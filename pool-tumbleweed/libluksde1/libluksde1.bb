SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libluksde1-20260902-1.2.aarch64.rpm"
RPM_HASH = "05806ab5f978a7fa525da29c720ab4bb3393858efa7ae1ec4b27f1c1f4a6f9a38fe24205768f5db71ac94ca2cc6556902269c4d709503979661e5d424aad5b8e"

RPROVIDES:${PN} += "libluksde.so.1 \
libluksde1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfcrypto.so.1 \
libfguid.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
