SUMMARY = "Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.7"

RPM_NAME = "libmediaart-2_0-0-1.9.7-1.8.aarch64.rpm"
RPM_HASH = "5122b5d478433cf8557642367b86ed714fbd271d42751a5ac41642bacea0b0ff57b0158221fd49e9caa536b3ae423390e72ef518d0a0081ca940c5808ede7ec5"

RPROVIDES:${PN} += "libmediaart-2-0-0 \
libmediaart-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
