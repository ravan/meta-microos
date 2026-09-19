SUMMARY = "Microsoft Azure Synapse Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Synapse Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0b5"

RPM_NAME = "python314-azure-mgmt-synapse-2.1.0b5-2.9.noarch.rpm"
RPM_HASH = "4682ac900751314670f164d1fe0b57e7ac9ebece20e627bd99c19f75a0fb36765c0b0c802f6924a8205805fce1cfc405b770a4a2c5d5ff4f2d67401ea4508958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-synapse \
python314-azure-mgmt-synapse \
python3dist-azure-mgmt-synapse"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
