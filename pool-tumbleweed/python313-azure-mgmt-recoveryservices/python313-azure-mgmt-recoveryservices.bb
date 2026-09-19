SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python313-azure-mgmt-recoveryservices-4.2.0-1.1.noarch.rpm"
RPM_HASH = "4f40097f422205a07e52e43c182b56f95a3e4a12d1421d411560b1b9a26623ea98c2b5db9289c5ff5b9a2f22953cd85a77e682f2f867ed454fae4dde8069b8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservices \
python3.13dist-azure-mgmt-recoveryservices \
python313-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
