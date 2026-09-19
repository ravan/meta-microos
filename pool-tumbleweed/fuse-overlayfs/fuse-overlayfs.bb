SUMMARY = "FUSE implementation for overlayfs"
DESCRIPTION = "An implementation of overlay+shiftfs in FUSE for rootless containers."
LICENSE = "GPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "fuse-overlayfs-1.17-1.1.aarch64.rpm"
RPM_HASH = "f94956452667c573d1949fd37a3f67e15631eb55f74a2cfc09e2b5a4ad52dc67a8824ed243e71fd2f34ce0aeaf385800a1b6a521291cf631904c2d9bfb7490c9"

RPROVIDES:${PN} += "fuse-overlayfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4"

inherit rpm
