SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-azure-mgmt-storageimportexport-0.1.0-4.9.noarch.rpm"
RPM_HASH = "9c0726472569ebb4436278e68320a55e7093e6227c841a21270398e4066969d63f61ffed356c097daee074de166f2ac0e8b01b04bf178c4f20062cd552f02362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storageimportexport \
python314-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.32 with python314-msrestazure < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
