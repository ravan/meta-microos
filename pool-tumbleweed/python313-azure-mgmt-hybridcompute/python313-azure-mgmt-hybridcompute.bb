SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python313-azure-mgmt-hybridcompute-10.0.0-1.1.noarch.rpm"
RPM_HASH = "e04062ebb43adfd8e1b5555e2cf9778c2a8e2c03cb2e8cece22abb263010802757d2258170d90a306f01f3163b07a190944498f669b520026e7a1fa75a70c2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridcompute \
python3.13dist-azure-mgmt-hybridcompute \
python313-azure-mgmt-hybridcompute \
python3dist-azure-mgmt-hybridcompute"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
