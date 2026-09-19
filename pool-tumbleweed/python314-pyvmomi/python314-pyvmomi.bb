SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "9.1.0.0"

RPM_NAME = "python314-pyvmomi-9.1.0.0-1.2.noarch.rpm"
RPM_HASH = "b460df0bf5d1f995bea8541835b1c47eeb90e5311c94d4d3e4dff42d6975c7941b6a46e2b566629e7811cbcf5917125d89e33fbab2a4d1e8d2fec73928524065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvmomi \
python314-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
