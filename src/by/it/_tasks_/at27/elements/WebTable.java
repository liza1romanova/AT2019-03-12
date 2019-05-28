package by.it._tasks_.at27.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
public class WebTable {
    private WebElement _webTable;

    public WebTable(WebElement webTable)
    {
        set_webTable(webTable);
    }

    public WebElement get_webTable() {
        return _webTable;
    }

    public void set_webTable(WebElement _webTable) {
        this._webTable = _webTable;
    }

    public int getRowCount() {
        List<WebElement> tableRows =
                _webTable.findElements(By.tagName("tr"));
        return tableRows.size();
    }

    public int getColumnCount() {
        List<WebElement> tableRows =
                _webTable.findElements(By.tagName("tr"));
        WebElement headerRow = tableRows.get(0);
        List<WebElement> tableCols = headerRow.findElements(By.tagName("td"));
        return tableCols.size();
    }

    public WebElement getCellEditor(int rowIdx, int colIdx, int editorIdx) {
        try {
            List<WebElement> tableRows = _webTable
                    .findElements(By.tagName("tr"));
            WebElement currentRow = tableRows.get(rowIdx-1);
            List<WebElement> tableCols = currentRow
                    .findElements(By.tagName("td"));
            WebElement cell = tableCols.get(colIdx-1);
            WebElement cellEditor = cell
                    .findElements(By.tagName("input")).get(editorIdx);
            return cellEditor;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Failed to get cell editor");
        }
    }
}