SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-paloaltonetworksngfw-1.1.0-1.4.noarch.rpm"
RPM_HASH = "0dd121c0ab25061a15c14001b92b4357292d90b679e20c87f844ce30997186d6ecd2089e6ceb161f8e93257114cfeb22fbb8a98196f25536acf5dfb5696582c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-paloaltonetworksngfw \
python314-azure-mgmt-paloaltonetworksngfw \
python3dist-azure-mgmt-paloaltonetworksngfw"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
