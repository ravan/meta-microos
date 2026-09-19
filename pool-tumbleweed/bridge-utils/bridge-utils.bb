SUMMARY = "Utilities for Configuring the Linux Ethernet Bridge"
DESCRIPTION = "This package contains utilities for configuring the Linux ethernet \
bridge. The Linux ethernet bridge can be used for connecting multiple \
ethernet devices together. The connection is fully transparent: hosts \
connected to one ethernet device see hosts connected to the other \
ethernet devices directly."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-1.7.1-3.6.aarch64.rpm"
RPM_HASH = "6eeb302cc38af5e55e0909326687da921d90858e6168001a10ebf327426e02ee1a0a4fdff22b02a1a6ed731c3fe0a18975cff3c5eb8e717088a1df7ac1664102"

RPROVIDES:${PN} += "bridge-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
