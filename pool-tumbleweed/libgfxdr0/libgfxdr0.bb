SUMMARY = "GlusterFS's External Data Representation library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "libgfxdr0-11.1-4.10.aarch64.rpm"
RPM_HASH = "0d9298fc6835af6da9309a0edc7ea7f489e8642988c3b2553e8aa3a80611cd4deee88f5a789b478b1ab5b575782a207fe38b27e0f875375447f54b91e7e58aa3"

RPROVIDES:${PN} += "libgfxdr.so.0 \
libgfxdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm
