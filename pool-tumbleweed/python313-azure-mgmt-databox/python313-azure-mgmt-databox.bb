SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-azure-mgmt-databox-3.1.0-1.5.noarch.rpm"
RPM_HASH = "7d4fc6d174696d87eded08830e6e2b10cef869a58f7f6c9d55c1421a1575861e56c05a8d2ee97214dfb81be3f9ac4d469b02043db03ee0b4bb10984bb38a9df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databox \
python3.13dist-azure-mgmt-databox \
python313-azure-mgmt-databox \
python3dist-azure-mgmt-databox"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.6.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
