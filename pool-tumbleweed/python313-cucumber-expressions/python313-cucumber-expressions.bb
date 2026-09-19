SUMMARY = "Cucumber Expressions - a simpler alternative to Regular Expressions"
DESCRIPTION = "Cucumber Expressions for Python, a simpler alternative to Regular \
Expressions. \
 \
The main docs are here: \
https://github.com/cucumber/cucumber-expressions#readme"
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python313-cucumber-expressions-20.1.0-1.1.noarch.rpm"
RPM_HASH = "d2a6e8410baf070f136860f55c455553f2cbeb2e71e33afefdea6a30faaaf24582295f4818df479564e90a59b2ffc992b57fb588fa135c89c834fe764c79e59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cucumber-expressions \
python3.13dist-cucumber-expressions \
python313-cucumber-expressions \
python3dist-cucumber-expressions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
