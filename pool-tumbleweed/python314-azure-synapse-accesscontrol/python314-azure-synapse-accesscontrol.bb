SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-azure-synapse-accesscontrol-0.7.0-3.9.noarch.rpm"
RPM_HASH = "f54ad9c4cb85d2c6e10731342be563128d67096061ddc90d84037c9d1594e61b9da4a0d1f12985bf875af4cd7a67bd72fc1062acc8972aa0a2dd6df0263dae80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-synapse-accesscontrol \
python314-azure-synapse-accesscontrol \
python3dist-azure-synapse-accesscontrol"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-synapse-nspkg \
python314-msrest"

inherit rpm
