SUMMARY = "Library providing network API for libreport"
DESCRIPTION = "Library providing network API for libreport"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-web_2-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "c45782285d4c6640b0a3f76f77f37bf5baa61932a22898fde50dfb6c73a5f41a4d4213e0dfe8396c0621f012094a4730cc7c831cf2d8a09ef9717b6620593968"

RPROVIDES:${PN} += "libreport-web-2 \
libreport-web.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libjson-c.so.5 \
libreport-2 \
libreport.so.2 \
libsatyr.so.4 \
libxmlrpc-client.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
