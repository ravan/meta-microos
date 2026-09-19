SUMMARY = "X Input Extension library"
DESCRIPTION = "libXi is the client-side library for the X Input Extension."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libXi6-1.8.3-1.3.aarch64.rpm"
RPM_HASH = "29185994b469bd3e3a342c07e64761d03545af521641d68fe6564d5afbaa277b287c3732da0748ad447f9fc8d488d6577b0bf93eb167eff12d6846f71da50905"

RPROVIDES:${PN} += "libXi.so.6 \
libXi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
