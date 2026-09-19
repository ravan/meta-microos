SUMMARY = "FreeRDP Server Proxy library"
DESCRIPTION = "This package contains the FreeRDP Server Proxy library files."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "libfreerdp-server-proxy3-3-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "fd45c65f7ab09a29dc7e42e0d64d977cc389c9836be56c2d64501cf6f4898309ed925d725ceb85c7e968eb78dcf6c1e11deb0ab60daf3c9021adc5bea35d2e96"

RPROVIDES:${PN} += "libfreerdp-server-proxy3-3 \
libfreerdp-server-proxy3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libwinpr3.so.3"

inherit rpm
