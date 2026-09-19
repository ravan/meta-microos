SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-azure-mgmt-storageimportexport-0.1.0-4.9.noarch.rpm"
RPM_HASH = "7b53140db05d462f3b3d8640c4cfb7b45c17fee807a44ab5e5fe9650881c5b5035a81c35fbaf61a308b3f97ff0c6af3c4242d943470c0007730e17d1c7bc5e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storageimportexport \
python3.13dist-azure-mgmt-storageimportexport \
python313-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.32 with python313-msrestazure < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
