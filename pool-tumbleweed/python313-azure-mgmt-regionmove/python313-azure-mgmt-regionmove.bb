SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python313-azure-mgmt-regionmove-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "929a493f09cbe9af8758e264eecc5158c98d6084145a03030de01dee5544d06a95fb2315cc2b6420aabe3fa08de31cef4463c8e2c6c5902627cc576c9dacd51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-regionmove \
python3.13dist-azure-mgmt-regionmove \
python313-azure-mgmt-regionmove \
python3dist-azure-mgmt-regionmove"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.32 with python313-msrestazure < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
