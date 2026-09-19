SUMMARY = "Library for accessing the Outlook Nickfile (NK2) format"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnk2-1-20260526-1.12.aarch64.rpm"
RPM_HASH = "36ca1b5c5bc42c77433351d4b842bd213538a6d565ab7994aa9b6c494066025c1ab61983ba059bee39edc3936c0834a600ae125ad5c78bcc11835d95c126b7d6"

RPROVIDES:${PN} += "libnk2-1 \
libnk2.so.1"

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
