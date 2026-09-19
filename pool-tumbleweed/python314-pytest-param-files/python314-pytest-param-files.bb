SUMMARY = "Create pytest parametrize decorators from external files"
DESCRIPTION = "A small package to generate parametrized pytest from external files."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-pytest-param-files-0.6.0-1.5.noarch.rpm"
RPM_HASH = "31a158deb9116b039c86a61b655f113b9de1d7d58309112a7149aa490932a98442691a436d7af6dd578902ff49e83227cd9291d5114a941906c6b81aa49097c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-param-files \
python314-pytest-param-files \
python3dist-pytest-param-files"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-ruamel.yaml"

inherit rpm
