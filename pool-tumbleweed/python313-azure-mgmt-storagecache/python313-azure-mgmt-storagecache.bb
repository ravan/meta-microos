SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-mgmt-storagecache-4.0.0-1.1.noarch.rpm"
RPM_HASH = "78842526f96a741b436c36080217ec57216d94f5d136c927f02f84f08132446d9eac2f023bf0ca75a60da7ef7f218ddacfebfe4dc63c5e715cb870605d4214c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagecache \
python3.13dist-azure-mgmt-storagecache \
python313-azure-mgmt-storagecache \
python3dist-azure-mgmt-storagecache"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
