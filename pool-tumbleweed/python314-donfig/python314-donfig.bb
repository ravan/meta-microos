SUMMARY = "Python package for configuring a python package"
DESCRIPTION = "Donfig is a python library meant to make configuration easier for other \
python packages. Donfig can be configured programmatically, by \
environment variables, or from YAML files in standard locations."
LICENSE = "MIT & BSD-3-Clause"

PV = "0.8.1.post1"

RPM_NAME = "python314-donfig-0.8.1.post1-1.4.noarch.rpm"
RPM_HASH = "8de576f13cabb09fcb525c260e5045df643a34c1cd84e9f2460e1e872d45ffaec0f27f90674f753e28d106441798eb585b833ddd9cfbb6c9c8cca26ebb3e5f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-donfig \
python314-donfig \
python3dist-donfig"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
