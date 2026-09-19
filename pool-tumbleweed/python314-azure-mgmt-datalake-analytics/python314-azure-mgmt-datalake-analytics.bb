SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-azure-mgmt-datalake-analytics-0.6.0-6.9.noarch.rpm"
RPM_HASH = "6b6712f897415d7c656ca51576a646f150d195244aa61f2934b75e84a54d1b89f86cd724b0155198fbf0050658a36f8c31a27e889f778dfba1e3c0b30cbf0d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datalake-analytics \
python314-azure-mgmt-datalake-analytics \
python3dist-azure-mgmt-datalake-analytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-msrestazure >= 0.4.27 with python314-msrestazure < 2.0.0 \
python-abi \
python314-azure-mgmt-datalake-nspkg \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
