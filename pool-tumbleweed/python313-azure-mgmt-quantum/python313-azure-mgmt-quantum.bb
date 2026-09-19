SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b5"

RPM_NAME = "python313-azure-mgmt-quantum-1.0.0b5-1.9.noarch.rpm"
RPM_HASH = "8855f9373b0f271b7e19f8d698d0f6af2fc297cef8d97f0e43788e3002111911a07899f2f802d21280fd872795efad6774f8f6885cee3f77db9d8ee5edcafd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quantum \
python3.13dist-azure-mgmt-quantum \
python313-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
