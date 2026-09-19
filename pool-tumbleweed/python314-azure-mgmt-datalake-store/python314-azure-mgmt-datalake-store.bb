SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python314-azure-mgmt-datalake-store-1.1.0~b1-1.8.noarch.rpm"
RPM_HASH = "061aa7334aed255965c972e63595e01daaa1ffb332c96b5412d3f474bcb4996bf909068e9d86d02a94d4a877fe1fc8507b0c4914e99557bc20d49c0c7749f77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datalake-store \
python314-azure-mgmt-datalake-store \
python3dist-azure-mgmt-datalake-store"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-datalake-nspkg \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
