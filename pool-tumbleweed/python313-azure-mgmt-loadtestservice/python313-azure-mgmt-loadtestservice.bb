SUMMARY = "Microsoft Azure Loadtestservice Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtestservice Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-loadtestservice-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "1205e03af1946b18b2975c3f30c2b27f085c5234117bd0a6115d5d13aa0c00d85432f22d4bcc20b15d428162a21a737163b75442a5c4a99d7517fd887c58745b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtestservice \
python3.13dist-azure-mgmt-loadtestservice \
python313-azure-mgmt-loadtestservice \
python3dist-azure-mgmt-loadtestservice"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
