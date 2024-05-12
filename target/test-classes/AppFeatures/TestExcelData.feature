Feature:  Test Excel data
Scenario Outline: 
Given Display site
When Sheet name is "<sheetname>" and row number is "<rowno>"
Examples:
|sheetname|rowno|
|Sheet4|0|
|Sheet4|1|