SUMMARY = "Microsoft Azure Mongocluster Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mongocluster Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-mgmt-mongocluster-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6417106c31fb73ac30d52b32c2660410e49283209dcb6586da74c5ade414ea8fc15fa4ad19c5d4486e6017faf5adca795f1b190b77bfaafe369f9adf5e261ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mongocluster \
python3.13dist-azure-mgmt-mongocluster \
python313-azure-mgmt-mongocluster \
python3dist-azure-mgmt-mongocluster"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
