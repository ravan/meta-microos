SUMMARY = "Microsoft Azure Synapse Managed Private Endpoints Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse Managed Private Endpoints Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-azure-synapse-managedprivateendpoints-0.4.0-3.9.noarch.rpm"
RPM_HASH = "5a77c5a315ce464bcb32c681a4b3a407a3626668ee276cbdd6a5f625d7735513e26c7edad13bacd771a73cc6c96e4521037988794db72f92c1d0f9c61598437e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-managedprivateendpoints \
python314-azure-synapse-managedprivateendpoints \
python3dist-azure-synapse-managedprivateendpoints"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-synapse-nspkg \
python314-msrest"

inherit rpm
