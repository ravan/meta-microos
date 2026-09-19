SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-azure-mgmt-vmwarecloudsimple-0.2.0-4.9.noarch.rpm"
RPM_HASH = "effff187f28e3941e8ea8ef0423aa24bafcac0d46ee842d1f68892300963c5cdd69ee995e677a7615253dc7763d7a7dd579c3667027e8256b4c94060d6afdc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-vmwarecloudsimple \
python314-azure-mgmt-vmwarecloudsimple \
python3dist-azure-mgmt-vmwarecloudsimple"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.32 with python314-msrestazure < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
