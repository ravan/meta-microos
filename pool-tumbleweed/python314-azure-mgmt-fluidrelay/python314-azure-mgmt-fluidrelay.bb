SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-fluidrelay-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "7370f75247d1ea1d175a8a2b81c56348aa0ac76919f68e47d38f060d32816aad08137e5a91799e568f231cc04ef1442d5d052c1c8ba9153950f4462ab1f6a35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-fluidrelay \
python314-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.1 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
