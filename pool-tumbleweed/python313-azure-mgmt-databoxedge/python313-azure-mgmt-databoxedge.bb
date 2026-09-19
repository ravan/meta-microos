SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-databoxedge-3.0.0-1.1.noarch.rpm"
RPM_HASH = "7331c5a886ca5422d805861c76a229577590283d166c0dc5863d62e84da6179947f29d3c13ed59d1a0d49d4c4496f1a7ca5bcd0b4807ce193daeaaad8d7f2126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databoxedge \
python3.13dist-azure-mgmt-databoxedge \
python313-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
