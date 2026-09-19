SUMMARY = "Python library to communicate with Redfish based systems"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems."
LICENSE = "Apache-2.0"

PV = "5.13.0"

RPM_NAME = "python313-sushy-5.13.0-1.1.noarch.rpm"
RPM_HASH = "e2f6f4c5a38212a972bd4d67f97d6fac4700e92ac7a901c3b07631c6bd96185e873c744e0aaef35ae5b4eb6e395eefd858bd73d1624563bd425c8909f1d527d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sushy \
python3.13dist-sushy \
python313-sushy \
python3dist-sushy"

RDEPENDS:${PN} += "python-abi \
python313-pbr \
python313-python-dateutil \
python313-requests \
python313-stevedore"

inherit rpm
