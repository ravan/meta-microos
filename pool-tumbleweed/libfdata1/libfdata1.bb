SUMMARY = "Library to provide generic file data functions"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfdata1-20260521-1.8.aarch64.rpm"
RPM_HASH = "a14b6a3a791fa228825acaa26b143dabc41fb5eb451224d90c675944fa25798134cc5cfd76333e091bb02e10c341fc138095fd9279edd25746e9c7aac118b9a6"

RPROVIDES:${PN} += "libfdata.so.1 \
libfdata1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfcache.so.1"

inherit rpm
