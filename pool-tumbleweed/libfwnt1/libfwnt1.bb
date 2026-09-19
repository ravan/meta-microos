SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libfwnt1-20260602-1.5.aarch64.rpm"
RPM_HASH = "537aa643541dbeacfa20ef81cfb9c0b51efcf342ddc6887dc855d763c6a2934207445cb69ad94f60979c865418dcfa6962ebdb6134499cb629a5ca2e09a9ebbb"

RPROVIDES:${PN} += "libfwnt.so.1 \
libfwnt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
