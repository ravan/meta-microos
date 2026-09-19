SUMMARY = "Library to provide generic file value functions"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260531"

RPM_NAME = "libfvalue1-20260531-1.7.aarch64.rpm"
RPM_HASH = "d1e65388719abad565e22f8d51b2052802f19d4dfce00385c72dcf338a868c8ee39611e84dd5f57afe96cfb0a8c1a16a832175e98d761af285e66b5d20605738"

RPROVIDES:${PN} += "libfvalue.so.1 \
libfvalue1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
