SUMMARY = "GlusterFS API library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "libgfapi0-11.1-4.10.aarch64.rpm"
RPM_HASH = "954990bcd88b4e67abf8aa20d752092ba385a0ed6983306dd8971390c3bee0de8371dfc26499d2676e62474226b84d735e5fd4fcfdca6f9a46ec98150cacb241"

RPROVIDES:${PN} += "libgfapi.so.0 \
libgfapi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgfrpc.so.0 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
