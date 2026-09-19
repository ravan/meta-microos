SUMMARY = "Python library to communicate with Redfish based systems"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems."
LICENSE = "Apache-2.0"

PV = "5.13.0"

RPM_NAME = "python314-sushy-5.13.0-1.1.noarch.rpm"
RPM_HASH = "d4cb4354f5cdb277b799dd7d4964fdec5a436ddaf9ff2fe3743e66262db52e449aa0b4da7558a3850d2d31a187d91ed42d9eb4d86af6b23250661cdd3fb1711f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sushy \
python314-sushy \
python3dist-sushy"

RDEPENDS:${PN} += "python-abi \
python314-pbr \
python314-python-dateutil \
python314-requests \
python314-stevedore"

inherit rpm
