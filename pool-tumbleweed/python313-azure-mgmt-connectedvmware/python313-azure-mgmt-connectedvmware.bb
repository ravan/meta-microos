SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python313-azure-mgmt-connectedvmware-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "753424e142f4d89b74d1b65679710a8afc8b816534011e2c4c0c57975ab69d6e55e05f9bfac2356825a84cc4dc53d6ef88129c79d78bdac39845f8ee3dc0ba14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-connectedvmware \
python3.13dist-azure-mgmt-connectedvmware \
python313-azure-mgmt-connectedvmware \
python3dist-azure-mgmt-connectedvmware"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
