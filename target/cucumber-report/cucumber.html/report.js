$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WomenTest.feature");
formatter.feature({
  "line": 1,
  "name": "Women Test",
  "description": "",
  "id": "women-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5646383100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify The Sort By Product Name Filter",
  "description": "",
  "id": "women-test;verify-the-sort-by-product-name-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Mouse Hover on Women Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Mouse Hover on Tops",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Select Sort By filter “Product Name”",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Verify the products name display in alphabetical order",
  "keyword": "And "
});
formatter.match({
  "location": "GearTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 120095000,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 689400200,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 169565000,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iClickOnJackets()"
});
formatter.result({
  "duration": 1455154300,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iSelectSortByFilterProductName()"
});
formatter.result({
  "duration": 377372400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iVerifyTheProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
formatter.after({
  "duration": 114400,
  "status": "passed"
});
formatter.before({
  "duration": 3760117800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify The SortBy Price Filter",
  "description": "",
  "id": "women-test;verify-the-sortby-price-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I Mouse Hover on Women Menu",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I Mouse Hover on Tops",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Click on Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Select Sort By filter “Price”",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Verify the products price display in Low to High",
  "keyword": "Then "
});
formatter.match({
  "location": "GearTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 21000,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 1126104200,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 174646900,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iClickOnJackets()"
});
formatter.result({
  "duration": 1791227300,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iSelectSortByFilterPrice()"
});
formatter.result({
  "duration": 2141259400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iVerifyTheProductsPriceDisplayInLowToHigh()"
});
formatter.result({
  "duration": 101453800,
  "status": "passed"
});
formatter.after({
  "duration": 52700,
  "status": "passed"
});
});