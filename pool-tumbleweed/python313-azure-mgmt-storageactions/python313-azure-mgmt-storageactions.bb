SUMMARY = "Microsoft Azure Storageactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storageactions Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-storageactions-1.0.0-1.5.noarch.rpm"
RPM_HASH = "0323c4fc203862c586c23f6736b05f67f8e1e50980a553cdf7d0987a029715805fab7559f74491fbc79ff2b888b36de9b479a797e9011812e71a79a0cfdfbe05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storageactions \
python3.13dist-azure-mgmt-storageactions \
python313-azure-mgmt-storageactions \
python3dist-azure-mgmt-storageactions"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
