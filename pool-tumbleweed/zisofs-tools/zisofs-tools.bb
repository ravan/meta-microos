SUMMARY = "User tools for zisofs"
DESCRIPTION = "Zisofs-tools, in conjunction with a zisofs-enabled system, allows the \
creation of an ISO-9660 filesystem that can be decompressed 'live' on a \
file-by-file basis, while still being readable by systems without \
zisofs support. This package contains the tools necessary to create \
such a filesystem and read compressed files on a system without zisofs \
support."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "zisofs-tools-1.0.8-27.11.aarch64.rpm"
RPM_HASH = "3588aba092806c76fd3a2772730bd2ed9f4240d92b24b36c1fda9faa386704c69a684fafb6c102fd2578eea9f22f726258895cffd9c499c67d24bb4bc5b004d3"

RPROVIDES:${PN} += "zisofs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mkisofs"

inherit rpm
