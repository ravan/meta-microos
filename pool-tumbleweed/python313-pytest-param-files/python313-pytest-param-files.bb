SUMMARY = "Create pytest parametrize decorators from external files"
DESCRIPTION = "A small package to generate parametrized pytest from external files."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-pytest-param-files-0.6.0-1.5.noarch.rpm"
RPM_HASH = "e4a14405f39b8d89acb197cb35f6fd142d9b7dd986feeb230addeb0ae6dbb7bea2c56578a5111ab0c7338dcd926c8fdc4527a38c249676bf3f54dcdcf0ac5cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-param-files \
python3.13dist-pytest-param-files \
python313-pytest-param-files \
python3dist-pytest-param-files"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-ruamel.yaml"

inherit rpm
