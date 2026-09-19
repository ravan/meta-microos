SUMMARY = "Configuration of squid"
DESCRIPTION = "Configuration of squid"
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-squid-5.0.0-1.14.aarch64.rpm"
RPM_HASH = "619c14fd1b07fc8bc3ad2c7b97f5bcb9d99b6f5bf38cf0c423694f306a9826faec82fc414abb1d5eadc5db3b925d36c89c012796373c67abacdc9e15a509d3e3"

RPROVIDES:${PN} += "libpy2ag-squid.so.2 \
yast2-squid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2 \
yast2-ruby-bindings"

inherit rpm
