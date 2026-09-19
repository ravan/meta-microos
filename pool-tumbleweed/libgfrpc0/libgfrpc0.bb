SUMMARY = "GlusterFS Remote Procedure Call library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "libgfrpc0-11.1-4.10.aarch64.rpm"
RPM_HASH = "e40a6e630835a7bf552b04f5db4da5d73e31463ad97a3097ec1d809c29e3bfa2fc42b05f5949fffa07213e92d0612030c0003c8096fa48835611ee314c46293b"

RPROVIDES:${PN} += "libgfrpc.so.0 \
libgfrpc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
