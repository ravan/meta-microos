SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python313-azure-mgmt-datalake-store-1.1.0~b1-1.8.noarch.rpm"
RPM_HASH = "64b3f61da3b6e2c9d5439619ba71ebe4969c63d4421ce1d90f781a27be8ed729d427a6895c4060c7956a28ebecd52f7cfd7863792a9104cbf60e0869da62b73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-store \
python3.13dist-azure-mgmt-datalake-store \
python313-azure-mgmt-datalake-store \
python3dist-azure-mgmt-datalake-store"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-datalake-nspkg \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
