SUMMARY = "GlusterFS volume changelog translator library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
The goal of this volume translator is to capture changes performed on \
a GlusterFS volume. The translator needs to be loaded on the server \
(bricks) and captures changes in a plain text file inside a \
configured directory path (controlled by the 'changelog-dir' \
directive)."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "libgfchangelog0-11.1-4.10.aarch64.rpm"
RPM_HASH = "293fbfb0d8db4559196c7b1dad43a326487d3be13594b1034801e5a3e2c262d0be17abf47f294e0ada1e542d885dce7ecff4f70c8fdc25093f9ffae3d334b88d"

RPROVIDES:${PN} += "libgfchangelog.so.0 \
libgfchangelog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfrpc.so.0 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
