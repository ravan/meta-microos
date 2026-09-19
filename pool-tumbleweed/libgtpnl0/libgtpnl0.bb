SUMMARY = "GPRS tunnel configuration library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libgtpnl0-1.3.3-1.4.aarch64.rpm"
RPM_HASH = "d2cca90e66d5da5b7b627fbf98477d853e20596453fad2288e6f0a014fd357e87854fad56097e07b4f0762fb4107bb47d661594579a22e2d5ba276c2d4d5e9e5"

RPROVIDES:${PN} += "libgtpnl.so.0 \
libgtpnl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
