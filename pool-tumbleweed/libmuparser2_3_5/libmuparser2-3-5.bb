SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "libmuparser2_3_5-2.3.5-1.7.aarch64.rpm"
RPM_HASH = "b0ebac979ecfe01ec0e0eb9b765a500fda6dcfeccb21d645a43e04b496261b8edefc905ff1c87241264365f0a6e4e6f912f53179460c0d0632ebe3042fcfbfe4"

RPROVIDES:${PN} += "libmuparser.so.2.3.5 \
libmuparser2-3-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
