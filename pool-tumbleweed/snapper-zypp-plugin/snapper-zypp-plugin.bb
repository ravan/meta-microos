SUMMARY = "A zypp commit plugin for calling snapper"
DESCRIPTION = "This package contains a plugin for zypp that makes filesystem snapshots with \
snapper during commits."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "snapper-zypp-plugin-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "8e93d9fec06c64fd0f2bd23cfab8245d764e48774810c71dcb6570b8079c8319734f9a2b416422d7b3d5b7765905cb04f40875f6779aa2f4ed0c01140338d532"

RPROVIDES:${PN} += "snapper-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsnapper.so.8 \
libstdc++.so.6 \
libxml2.so.16 \
libzypp-plugin-commit \
snapper"

inherit rpm
