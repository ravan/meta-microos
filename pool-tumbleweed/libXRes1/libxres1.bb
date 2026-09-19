SUMMARY = "X Resource extension client library"
DESCRIPTION = "libXRes provides an X Window System client interface to the Resource \
extension to the X protocol. The Resource extension allows for X \
clients to see and monitor the X resource usage of various clients \
(pixmaps, et al)."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libXRes1-1.2.3-1.5.aarch64.rpm"
RPM_HASH = "615929075461330ec6d659f3314f49699885518973080b69a71086a1329f638c8d59f4949df5c24442dbb5a656de1b99799a8f29f5fceff24c6fbd2bf1e9c9a4"

RPROVIDES:${PN} += "libXRes.so.1 \
libXRes1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
