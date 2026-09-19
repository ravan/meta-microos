SUMMARY = "Microsoft Azure Logz Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Logz Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-azure-mgmt-logz-1.1.1-1.7.noarch.rpm"
RPM_HASH = "169fb5cc95e54059019b2c9cdd5585f8f0aa0384bce72509ce8fba4621b7aaa8f1d6ec5dae0fbad2ec70e921f45f669b86b256ec43926fb8f2e52177d3547abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logz \
python3.13dist-azure-mgmt-logz \
python313-azure-mgmt-logz \
python3dist-azure-mgmt-logz"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
