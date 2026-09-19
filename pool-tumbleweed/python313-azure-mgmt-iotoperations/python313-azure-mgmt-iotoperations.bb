SUMMARY = "Microsoft Azure Iotoperations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotoperations Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-mgmt-iotoperations-1.2.0-1.1.noarch.rpm"
RPM_HASH = "eb6f63a1626eb00e31f975cfc5175bb666481bd02d5320f0dd1d3596e979ce39a82d02d43d4bb2a792ff8aca8858219b1289ccb0bd9e20a89df9b8ddd98bc76d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotoperations \
python3.13dist-azure-mgmt-iotoperations \
python313-azure-mgmt-iotoperations \
python3dist-azure-mgmt-iotoperations"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
