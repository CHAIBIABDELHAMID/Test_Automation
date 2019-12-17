$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calendar.feature");
formatter.feature({
  "line": 1,
  "name": "Calendar",
  "description": "",
  "id": "calendar",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Calendar Default Display For role COR,DIV",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-cor,div",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Role \u003crole\u003e is selected",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Calendar menu is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Page Title is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Navigation buttons are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Variance color display default color",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Pencil icon is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Displayin is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Colored by is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Segment is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Legends are displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-cor,div;",
  "rows": [
    {
      "cells": [
        "role"
      ],
      "line": 22,
      "id": "calendar;calendar-default-display-for-role-cor,div;;1"
    },
    {
      "cells": [
        "COR"
      ],
      "line": 23,
      "id": "calendar;calendar-default-display-for-role-cor,div;;2"
    },
    {
      "cells": [
        "DIV"
      ],
      "line": 24,
      "id": "calendar;calendar-default-display-for-role-cor,div;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4165557700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 7879337800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 81469600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Calendar Default Display For role COR,DIV",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-cor,div;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Role COR is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Calendar menu is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Page Title is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Navigation buttons are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Variance color display default color",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Pencil icon is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Displayin is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Colored by is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Segment is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Legends are displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "COR",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5320707400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.calendar_menu_is_selected()"
});
formatter.result({
  "duration": 55772300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.page_title_is_displayed()"
});
formatter.result({
  "duration": 9073400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.navigation_buttons_are_displayed()"
});
formatter.result({
  "duration": 182039800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.variance_color_display_default_color()"
});
formatter.result({
  "duration": 156782300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.pencil_icon_is_displayed()"
});
formatter.result({
  "duration": 43101700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.displayin_is_displayed()"
});
formatter.result({
  "duration": 234701300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.colored_by_is_displayed()"
});
formatter.result({
  "duration": 334799300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.segment_is_displayed()"
});
formatter.result({
  "duration": 3205252100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.legends_are_displayed()"
});
formatter.result({
  "duration": 29391900,
  "status": "passed"
});
formatter.after({
  "duration": 666054600,
  "status": "passed"
});
formatter.before({
  "duration": 3211331700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 7542422900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 63239600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Calendar Default Display For role COR,DIV",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-cor,div;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Role DIV is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Calendar menu is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Page Title is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Navigation buttons are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Variance color display default color",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Pencil icon is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Displayin is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Colored by is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Segment is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Legends are displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DIV",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5292836700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.calendar_menu_is_selected()"
});
formatter.result({
  "duration": 34905400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.page_title_is_displayed()"
});
formatter.result({
  "duration": 8028800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.navigation_buttons_are_displayed()"
});
formatter.result({
  "duration": 138840900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.variance_color_display_default_color()"
});
formatter.result({
  "duration": 129750700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.pencil_icon_is_displayed()"
});
formatter.result({
  "duration": 27566000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.displayin_is_displayed()"
});
formatter.result({
  "duration": 222531100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.colored_by_is_displayed()"
});
formatter.result({
  "duration": 289212200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.segment_is_displayed()"
});
formatter.result({
  "duration": 3165536300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.legends_are_displayed()"
});
formatter.result({
  "duration": 29421800,
  "status": "passed"
});
formatter.after({
  "duration": 672274600,
  "status": "passed"
});
formatter.before({
  "duration": 3173935900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 8108462700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 71440900,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Calendar Default Display For role STM",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-stm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Select role \"STM\"",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Calendar menu is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Page Title is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Navigation buttons are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Summary table is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Variance color display default color",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Pencil icon is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Displayin is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Colored by is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Legends are displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "STM",
      "offset": 13
    }
  ],
  "location": "stepDefinition_Amarla.select_role_something(String)"
});
formatter.result({
  "duration": 5362635500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.calendar_menu_is_selected()"
});
formatter.result({
  "duration": 31234100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.page_title_is_displayed()"
});
formatter.result({
  "duration": 6372100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.navigation_buttons_are_displayed()"
});
formatter.result({
  "duration": 119764300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.summary_table_is_displayed()"
});
formatter.result({
  "duration": 131994100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.variance_color_display_default_color()"
});
formatter.result({
  "duration": 117997000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.pencil_icon_is_displayed()"
});
formatter.result({
  "duration": 32396400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.displayin_is_displayed()"
});
formatter.result({
  "duration": 282772200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.colored_by_is_displayed()"
});
formatter.result({
  "duration": 285737000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.legends_are_displayed()"
});
formatter.result({
  "duration": 27936300,
  "status": "passed"
});
formatter.after({
  "duration": 671942700,
  "status": "passed"
});
formatter.before({
  "duration": 3205678600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 7126484200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 65267200,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Calendar Default Display For role REG",
  "description": "",
  "id": "calendar;calendar-default-display-for-role-reg",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "Select role \"REG\"",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "Calendar menu is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Page Title is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Navigation buttons are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Summary table is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Variance color display default color",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Pencil icon is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Displayin is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Colored by is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Legends are displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "REG",
      "offset": 13
    }
  ],
  "location": "stepDefinition_Amarla.select_role_something(String)"
});
formatter.result({
  "duration": 5394333800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.calendar_menu_is_selected()"
});
formatter.result({
  "duration": 35110900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.page_title_is_displayed()"
});
formatter.result({
  "duration": 8420100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.navigation_buttons_are_displayed()"
});
formatter.result({
  "duration": 122188500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.summary_table_is_displayed()"
});
formatter.result({
  "duration": 129474100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.variance_color_display_default_color()"
});
formatter.result({
  "duration": 146914900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.pencil_icon_is_displayed()"
});
formatter.result({
  "duration": 32984600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.displayin_is_displayed()"
});
formatter.result({
  "duration": 234108800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.colored_by_is_displayed()"
});
formatter.result({
  "duration": 295179200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.legends_are_displayed()"
});
formatter.result({
  "duration": 31367200,
  "status": "passed"
});
formatter.after({
  "duration": 660525000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 54,
  "name": "Weeks are displayed from Week1 to Week52",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Role \u003crole\u003e is selected",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "Weeks are displayed from Week1 to Week52",
  "keyword": "Then "
});
formatter.examples({
  "line": 57,
  "name": "",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52;",
  "rows": [
    {
      "cells": [
        "role"
      ],
      "line": 58,
      "id": "calendar;weeks-are-displayed-from-week1-to-week52;;1"
    },
    {
      "cells": [
        "COR"
      ],
      "line": 59,
      "id": "calendar;weeks-are-displayed-from-week1-to-week52;;2"
    },
    {
      "cells": [
        "DIV"
      ],
      "line": 60,
      "id": "calendar;weeks-are-displayed-from-week1-to-week52;;3"
    },
    {
      "cells": [
        "REG"
      ],
      "line": 61,
      "id": "calendar;weeks-are-displayed-from-week1-to-week52;;4"
    },
    {
      "cells": [
        "STM"
      ],
      "line": 62,
      "id": "calendar;weeks-are-displayed-from-week1-to-week52;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3178603400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 6204289800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 84137400,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "Weeks are displayed from Week1 to Week52",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Role COR is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "Weeks are displayed from Week1 to Week52",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "COR",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5259703200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.weeks_are_displayed_from_week1_to_week52()"
});
formatter.result({
  "duration": 181169400,
  "status": "passed"
});
formatter.after({
  "duration": 672163200,
  "status": "passed"
});
formatter.before({
  "duration": 3180358800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 7006848600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 63897500,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "Weeks are displayed from Week1 to Week52",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Role DIV is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "Weeks are displayed from Week1 to Week52",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "DIV",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5287733500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.weeks_are_displayed_from_week1_to_week52()"
});
formatter.result({
  "duration": 168536200,
  "status": "passed"
});
formatter.after({
  "duration": 656304700,
  "status": "passed"
});
formatter.before({
  "duration": 3172389200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 7901130800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 63456600,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "Weeks are displayed from Week1 to Week52",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Role REG is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "Weeks are displayed from Week1 to Week52",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "REG",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5333775400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.weeks_are_displayed_from_week1_to_week52()"
});
formatter.result({
  "duration": 174261900,
  "status": "passed"
});
formatter.after({
  "duration": 642607600,
  "status": "passed"
});
formatter.before({
  "duration": 3187702200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User Is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to \"amarla\" on \"qa\" Login page and connect",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "amarla",
      "offset": 13
    },
    {
      "val": "qa",
      "offset": 25
    }
  ],
  "location": "stepDefinition_Amarla.navigate_to_something_on_something_login_page_and_connect(String,String)"
});
formatter.result({
  "duration": 6957905000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.home_page_is_displayed()"
});
formatter.result({
  "duration": 85776900,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "Weeks are displayed from Week1 to Week52",
  "description": "",
  "id": "calendar;weeks-are-displayed-from-week1-to-week52;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@Calendar"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Role STM is selected",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "Weeks are displayed from Week1 to Week52",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "STM",
      "offset": 5
    }
  ],
  "location": "stepDefinition_Amarla.role_is_selected(String)"
});
formatter.result({
  "duration": 5384481000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Amarla.weeks_are_displayed_from_week1_to_week52()"
});
formatter.result({
  "duration": 174647600,
  "status": "passed"
});
formatter.after({
  "duration": 645893300,
  "status": "passed"
});
});