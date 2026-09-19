SUMMARY = "Library for accessing the Common Log File System (CLFS)"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20240430"

RPM_NAME = "libfsclfs1-20240430-1.21.aarch64.rpm"
RPM_HASH = "1160cd2e5147541a1f5a831e429ac4ca19d612db5952613234e6a03634f3f53059d830f56a423707aaa62dd84bdd58dc8656bc11e01a5ef4132b8f4d233ff163"

RPROVIDES:${PN} += "libfsclfs.so.1 \
libfsclfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
