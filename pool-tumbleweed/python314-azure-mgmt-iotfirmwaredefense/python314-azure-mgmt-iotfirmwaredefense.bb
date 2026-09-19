SUMMARY = "Microsoft Azure Iotfirmwaredefense Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotfirmwaredefense Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-iotfirmwaredefense-2.0.0-1.4.noarch.rpm"
RPM_HASH = "c3afa3da5b9407963d4ed75830a7e27e0fb0723bc16730b57b5e5364cf2cf9ddafda247a41a518b125f71ca84578b5b6c80577c10d6a26274126fe097c0e66c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-iotfirmwaredefense \
python314-azure-mgmt-iotfirmwaredefense \
python3dist-azure-mgmt-iotfirmwaredefense"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
