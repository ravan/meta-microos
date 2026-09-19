SUMMARY = "Provides a tag-expression parser and evaluation logic for cucumber/behave"
DESCRIPTION = "Provides tag-expression parser for cucumber/behave."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python314-cucumber-tag-expressions-10.0.0-1.2.noarch.rpm"
RPM_HASH = "f726b0d6f233048aca0a9b4bbb45540d78488fa1daa2e6db4ba437a276e3756d6e5def5c0c0f53f73f7678dc2aea06ab39397c838254dea3e99590e18b2d0569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cucumber-tag-expressions \
python314-cucumber-tag-expressions \
python3dist-cucumber-tag-expressions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
