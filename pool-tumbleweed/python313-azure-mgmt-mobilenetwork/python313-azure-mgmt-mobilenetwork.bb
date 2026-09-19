SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python313-azure-mgmt-mobilenetwork-3.3.1-1.4.noarch.rpm"
RPM_HASH = "3caec12a7347c583bf841fd7b333c823413c987a1d31d10a8eb4f21c4cc4e2836407de9cce88cf1f6726c4b3ffdba44dac28a74c606d0a6e305f5cc497862691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mobilenetwork \
python3.13dist-azure-mgmt-mobilenetwork \
python313-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
