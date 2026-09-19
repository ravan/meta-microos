SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python314-azure-mgmt-billing-8.0.0-1.2.noarch.rpm"
RPM_HASH = "a95dd77bf0fe862554abbf635314527d9f964641673e6a8d7f28f7bb687339d78cdefb542aa89bb347ec8f79912de4ccbc2220086ad39db7f191b8972ac59c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-billing \
python314-azure-mgmt-billing \
python3dist-azure-mgmt-billing"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
