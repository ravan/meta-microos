SUMMARY = "Allows you to use fixtures in @pytest.mark.parametrize"
DESCRIPTION = "Use your fixtures in `@pytest.mark.parametrize`. \
 \
This project was inspired by pytest-lazy-fixture \
 \
Improvements that have been made in this project: \
 \
1. You can use fixtures in any data structures \
2. You can access the attributes of fixtures \
3. You can use functions in fixtures \
4. It is compatible with pytest-deadfixtures"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-pytest-lazy-fixtures-1.4.0-1.5.noarch.rpm"
RPM_HASH = "bc2060ff84c049dc95dff2d449587a307dcfc85e99eb9c33236f3b1f2bc7100204af73f12e7007eb8fe995044e69a17843e124adcf5006f842d236e6c578f20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-lazy-fixtures \
python314-pytest-lazy-fixtures \
python3dist-pytest-lazy-fixtures"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
