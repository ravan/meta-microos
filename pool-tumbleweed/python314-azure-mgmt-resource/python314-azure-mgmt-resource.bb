SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "python314-azure-mgmt-resource-24.0.0-1.5.noarch.rpm"
RPM_HASH = "548ebabf06b9c6c1eb2d838dab7a31fa432e1f6167b66eeaaec9f2239825d4133a131af501e773a0fcf3c9d8530f968102e1c2a2aab8a80eac2fa269814ae82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource \
python314-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
