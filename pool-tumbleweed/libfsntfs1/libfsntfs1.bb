SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260827"

RPM_NAME = "libfsntfs1-20260827-1.1.aarch64.rpm"
RPM_HASH = "229ba0ce82f6c88c42e7609ce7231d85352a121b64b95817a86a2173bd5fe8ee7b77b2f4c652c0b010392d91306116c82ccff5882000e19943337e15eeba0e43"

RPROVIDES:${PN} += "libfsntfs.so.1 \
libfsntfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
