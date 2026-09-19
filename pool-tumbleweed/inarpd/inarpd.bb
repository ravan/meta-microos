SUMMARY = "Inverse ARP daemon for Linux"
DESCRIPTION = "Inverse ARP (InARP) daemon for Linux."
LICENSE = "GPL-2.0-only"

PV = "0.17"

RPM_NAME = "inarpd-0.17-2.8.aarch64.rpm"
RPM_HASH = "7eebde74a6aa847f1eda206d8dc514f41d93fe06688fa78d86a3892ff15af32c708ca3e7ed2a144f8cfb80a605d51f53460322d313ef15ea43b8d10d9fc4b6fd"

RPROVIDES:${PN} += "inarpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
