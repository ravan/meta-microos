SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-servicefabric-2.1.0-2.9.noarch.rpm"
RPM_HASH = "0ce84b883f89bf90349eb294e9243c8c8e5bff215cf30e291a4a70dfaab821c08180c4e6e49f7d94412e57eeaf37aec67618504204d3241ccff2fb7b81ec0886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabric \
python3.13dist-azure-mgmt-servicefabric \
python313-azure-mgmt-servicefabric \
python3dist-azure-mgmt-servicefabric"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
