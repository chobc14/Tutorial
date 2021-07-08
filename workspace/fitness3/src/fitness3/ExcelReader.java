package fitness3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * A dirty simple program that reads an Excel file.
 * 
 * @author www.codejava.net
 *
 */
public class ExcelReader {

	public HashMap<String, FoodDTO> read()  {
		HashMap<String, FoodDTO> map = new HashMap<String, FoodDTO>();

		try {
			String excelFilePath = "C:\\githubTeam\\Tutorial\\workspace\\fitness3\\data.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet firstSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = firstSheet.iterator();

			int rowIndex = -1;
			while (iterator.hasNext()) {
				rowIndex++;

				Row nextRow = iterator.next();
				if (rowIndex == 0)
					continue;

				Iterator<Cell> cellIterator = nextRow.cellIterator();

				FoodDTO dto = new FoodDTO();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getColumnIndex()) {
					case 5:
						dto.setName(cell.getStringCellValue());
						break;
					case 19: {
						String value = cell.getStringCellValue();
						if (value.isEmpty() == false && value.contains("-") == false)
							dto.setProtein(Double.parseDouble(value));
						}
						break;
					case 20: {
						String value = cell.getStringCellValue();
						if (value.isEmpty() == false && value.contains("-") == false)
							dto.setFat(Double.parseDouble(value));
						}
						break;
					case 22: {
						String value = cell.getStringCellValue();
						if (value.isEmpty() == false && value.contains("-") == false)
							dto.setCarbs(Double.parseDouble(value));
						}
						break;
					}
				}
				map.put(dto.getName(), dto);
			}

			workbook.close();
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}
}