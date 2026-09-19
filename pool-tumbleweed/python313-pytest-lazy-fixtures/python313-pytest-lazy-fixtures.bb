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

RPM_NAME = "python313-pytest-lazy-fixtures-1.4.0-1.5.noarch.rpm"
RPM_HASH = "27d8ec7a9a7be31ad336943e364fc8f5ee4907d9233914d24ec33da5824cde2096b53cd8ec512b4fe6fc9bd6d4dd5cfdc790120521ca35ceb8cd50c0496a1eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-lazy-fixtures \
python3.13dist-pytest-lazy-fixtures \
python313-pytest-lazy-fixtures \
python3dist-pytest-lazy-fixtures"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
