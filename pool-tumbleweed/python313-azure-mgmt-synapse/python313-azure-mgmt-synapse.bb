SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python313-azure-mgmt-synapse-2.1.0b5-2.9.noarch.rpm"
RPM_HASH = "ea314d156b7dd275aaa24f3f433566b39c45d0fc0dd7034104f848988f9ecdb87e65e8d76c6aef76c9d3f64737c90f3645667273a8e29250e79ef8254d2ea601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-synapse \
python3.13dist-azure-mgmt-synapse \
python313-azure-mgmt-synapse \
python3dist-azure-mgmt-synapse"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
