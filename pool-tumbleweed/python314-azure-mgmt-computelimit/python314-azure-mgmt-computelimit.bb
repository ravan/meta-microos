SUMMARY = "Microsoft Azure Computelimit Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computelimit Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-azure-mgmt-computelimit-1.3.0-1.1.noarch.rpm"
RPM_HASH = "33b302763cece86be96b1e3efe90e015e5a03185b19b31b83f8e4634a30676a8b71d65829284e5fd86953936caf82a4864f578602bc83699a6e77cbaba2cd744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-computelimit \
python314-azure-mgmt-computelimit \
python3dist-azure-mgmt-computelimit"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
