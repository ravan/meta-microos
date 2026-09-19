SUMMARY = "Microsoft Azure Disconnectedoperations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Disconnectedoperations Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-disconnectedoperations-1.0.0-1.3.noarch.rpm"
RPM_HASH = "b76011ee91ce37e57479428e8250b12df0b3b9bd2d10de85926fa525f64de6b438abc9b95629947ac57ea18d8f9fc6a407275024a0db25e06e2f34b06ab4742f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-disconnectedoperations \
python3.13dist-azure-mgmt-disconnectedoperations \
python313-azure-mgmt-disconnectedoperations \
python3dist-azure-mgmt-disconnectedoperations"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
