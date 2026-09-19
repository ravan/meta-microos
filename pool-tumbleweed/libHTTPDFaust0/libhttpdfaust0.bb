SUMMARY = "Faust HTTPD Library"
DESCRIPTION = "Dynamic Faust HTTPD Library."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "libHTTPDFaust0-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "efdc313a5facd842f0ef0c69bc941a41c9bab099d945d30651652a90e94e48fb3977d6dc995b71e0029da14f524542feb0b3dc736160750759374f0846f8cb92"

RPROVIDES:${PN} += "libHTTPDFaust.so.0 \
libHTTPDFaust0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmicrohttpd.so.12 \
libstdc++.so.6"

inherit rpm
