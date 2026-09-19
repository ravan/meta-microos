SUMMARY = "Microsoft Azure Portalservicescopilot Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portalservicescopilot Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-portalservicescopilot-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "f432c01021ab03791ad15edcee5399f705f83bb3449e63611415c4b2fc7f4da6fc9bc198341d49761c0a0b58eee43e618465be22df7f4852cbd9318473df7b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-portalservicescopilot \
python314-azure-mgmt-portalservicescopilot \
python3dist-azure-mgmt-portalservicescopilot"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
