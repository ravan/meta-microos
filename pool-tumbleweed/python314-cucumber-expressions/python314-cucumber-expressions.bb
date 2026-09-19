SUMMARY = "Cucumber Expressions - a simpler alternative to Regular Expressions"
DESCRIPTION = "Cucumber Expressions for Python, a simpler alternative to Regular \
Expressions. \
 \
The main docs are here: \
https://github.com/cucumber/cucumber-expressions#readme"
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python314-cucumber-expressions-20.1.0-1.1.noarch.rpm"
RPM_HASH = "b39f9ece0d9439cd134bea72c586175aa21c945502a4bbc173691d90ab919fa2532dc0c02497f29d761473dbb6377baf29cb998e43da3d99f30736124075b937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cucumber-expressions \
python314-cucumber-expressions \
python3dist-cucumber-expressions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
