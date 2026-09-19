SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-azure-synapse-managedprivateendpoints-0.4.0-3.9.noarch.rpm"
RPM_HASH = "cbb0d5b70850eab5dc9d99dcd17745995e93742c4a075fa92fc8907f861378c2096de25ab2af423f2dbc4bd6beb0c65c4539898d24140068a3ec7aa90767b898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-managedprivateendpoints \
python3.13dist-azure-synapse-managedprivateendpoints \
python313-azure-synapse-managedprivateendpoints \
python3dist-azure-synapse-managedprivateendpoints"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-synapse-nspkg \
python313-msrest"

inherit rpm
