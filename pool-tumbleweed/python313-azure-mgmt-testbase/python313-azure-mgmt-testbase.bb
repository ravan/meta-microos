SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mgmt-testbase-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "efdd6a770470e57c469e22ab2309edeabf0bf47bb65636a6d7670eddb07802129ba16c81c0810b37c6c37da6df417e6562082f29f8fbae24d5c8f5332d1d7b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-testbase \
python3.13dist-azure-mgmt-testbase \
python313-azure-mgmt-testbase \
python3dist-azure-mgmt-testbase"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
