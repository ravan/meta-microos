SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.1"

RPM_NAME = "python314-azure-mgmt-web-11.0.1-1.1.noarch.rpm"
RPM_HASH = "d6481b5372b16d30f8757b5a554369d4dc9c59ad019268f2f2cf35b64b03ef345a241058380d0ec879c8b2677d40b2062200019ce902a6e318fc51f8ab4c708f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-web \
python314-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
