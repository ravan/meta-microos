SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-paloaltonetworksngfw-1.1.0-1.4.noarch.rpm"
RPM_HASH = "5d381f805b40c211bb7cc1b08f2d8a702801fe66c5206cac90b4c66e2230bd4c0b456149e00b12945467267cbf1a59a047dbe55a2877478f5d5ce95a8a56161f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-paloaltonetworksngfw \
python3.13dist-azure-mgmt-paloaltonetworksngfw \
python313-azure-mgmt-paloaltonetworksngfw \
python3dist-azure-mgmt-paloaltonetworksngfw"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
