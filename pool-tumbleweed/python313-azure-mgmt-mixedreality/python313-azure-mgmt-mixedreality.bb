SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python313-azure-mgmt-mixedreality-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "6dceadbd3af8f191f00a6d48f44a974e3a72609602f7bfbf298a6a95c6988580dc9bc1e0bcb10e083cff7b27a05c12bfa26318fcedced898e21cd64a0a59eebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mixedreality \
python3.13dist-azure-mgmt-mixedreality \
python313-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
