SUMMARY = "Utility to test X11 server performance"
DESCRIPTION = "The x11perf program runs one or more performance tests and reports how \
fast an X server can execute the tests."
LICENSE = "HPND"

PV = "1.7.0"

RPM_NAME = "x11perf-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "5bd7d43a562357dcd06611768ac9f137b136663a269951baab7ad9efafb8d7407b88fb7cba04e3dac66b71fdfc829f62f7301df579cb4f108b2040b4ce9e0b53"

RPROVIDES:${PN} += "x11perf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmuu.so.1 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libm.so.6"

inherit rpm
