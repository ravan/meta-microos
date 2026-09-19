SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0~b2"

RPM_NAME = "python314-azure-mgmt-appconfiguration-6.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "1ec20001345295b4f5f0746acbad3c40cf8b9574e040f7ca9911129037f451b9b4cd7a37c537ae036a5e5fa1027808182b7800cdf78e562cdc577ab463f02907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-appconfiguration \
python314-azure-mgmt-appconfiguration \
python3dist-azure-mgmt-appconfiguration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
