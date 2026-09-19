SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-managementpartner-1.0.1-1.2.noarch.rpm"
RPM_HASH = "17baaf8161b78b889936ec997cdb8e9dee35457d932021192d33cc80b82694c7b580eee104b210002c48819323c6d7fed3877b078eb7af82810221216bf8abb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managementpartner \
python314-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
