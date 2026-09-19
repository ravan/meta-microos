SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-proxmoxer-2.3.0-1.3.noarch.rpm"
RPM_HASH = "07b1fddd380cc56527f2538d248c186038fbf066e7c9a4d23f1d418fb460fe2989d9a402ead0f7e800e9c03fdd42ed692e091927da75ce8d88f704f6bf0085c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proxmoxer \
python314-proxmoxer \
python3dist-proxmoxer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
