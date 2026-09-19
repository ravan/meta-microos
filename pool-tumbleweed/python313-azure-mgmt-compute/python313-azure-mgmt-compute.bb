SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "35.0.0"

RPM_NAME = "python313-azure-mgmt-compute-35.0.0-2.4.noarch.rpm"
RPM_HASH = "208b20c0b103d3c89fad1ff8bbac4568eae51072681318c436ccf7d5ff808f5f1524587a3f7bcf9552b74adfed15e33f06c24fe96a338dc7fe0387a7ad66b208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-compute \
python3.13dist-azure-mgmt-compute \
python313-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
