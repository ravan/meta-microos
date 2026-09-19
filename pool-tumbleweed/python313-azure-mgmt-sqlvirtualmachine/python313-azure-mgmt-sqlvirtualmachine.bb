SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python313-azure-mgmt-sqlvirtualmachine-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "63b090a40b00271eac12ff5be11520976975243001be7b5594530ec9d35c324c812798d0a88e87e16927e13f24c18997e4b95ac1e907593969517b300bda9d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sqlvirtualmachine \
python3.13dist-azure-mgmt-sqlvirtualmachine \
python313-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
