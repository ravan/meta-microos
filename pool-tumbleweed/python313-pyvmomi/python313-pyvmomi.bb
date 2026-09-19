SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "9.1.0.0"

RPM_NAME = "python313-pyvmomi-9.1.0.0-1.2.noarch.rpm"
RPM_HASH = "dc312e0c5c94343eec99a704f261fd9c8e19d85adf7805a9d75fbe281b87368c76fe1f1ab06e00946af3581bf65d589f0b9181ccb997798980d697a0d3e267ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvmomi \
python3.13dist-pyvmomi \
python313-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
