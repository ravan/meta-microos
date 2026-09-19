SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-proxmoxer-2.3.0-1.3.noarch.rpm"
RPM_HASH = "c69cbce0a82223f44cf117fd4b1bb689f20b9d90b75ffe30a1c5bde21c24bef9ab6fd3aeaaec1eceaff2dcde0b97f07671bd4c4649ecda2696d63ae55b620556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proxmoxer \
python3.13dist-proxmoxer \
python313-proxmoxer \
python3dist-proxmoxer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
