SUMMARY = "Utility to refresh all or part of an X screen"
DESCRIPTION = "Xrefresh is a simple X program that causes all or part of your screen \
to be repainted. This is useful when system messages have messed up \
your screen."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "xrefresh-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "3cba21ec60484ef7e4e0bc61a6bdf96f6e64da9f351de8aa0f2c69e841083ac283d3f5cb5a57e22b314c1230988a947dc65fe989ed0090434797b1d418335340"

RPROVIDES:${PN} += "xrefresh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
