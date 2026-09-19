SUMMARY = "Tools for Working With jigdo Files"
DESCRIPTION = "Jigit is an interactive wrapper around mkimage to ease the download or upgrade \
of existing CDs and CD images."
LICENSE = "GPL-2.0-only"

PV = "1.22"

RPM_NAME = "jigit-1.22-1.21.aarch64.rpm"
RPM_HASH = "1e0f936ac4e7b6df3152e1a6f8962f43bc896633ac27112af360639e1ce53bcd8dc8f51899c83fca3fe7fed22247a6bcbf2051a40ee5514cf395002a07477567"

RPROVIDES:${PN} += "jigit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
