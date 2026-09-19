SUMMARY = "Provides a tag-expression parser and evaluation logic for cucumber/behave"
DESCRIPTION = "Provides tag-expression parser for cucumber/behave."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python313-cucumber-tag-expressions-10.0.0-1.2.noarch.rpm"
RPM_HASH = "3a7cf2b12a625fd46e442aeba5c7004504d78a25707e61982a2382c2ae7f8326c7d75668ab58ed8127d89a2aa01c1e46f09835f29fe2d3cdd2b65ebd8fb51c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cucumber-tag-expressions \
python3.13dist-cucumber-tag-expressions \
python313-cucumber-tag-expressions \
python3dist-cucumber-tag-expressions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
