SUMMARY = "YaST2 - SLP Agent and Library"
DESCRIPTION = "This package provides YaST modules to lookup/advertise services with SLP."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-slp-5.0.0-1.14.aarch64.rpm"
RPM_HASH = "2cf1eceb587f8a451d51d8070f484ece2ce0a291f190aeeab5b4071b3746d718819bbf09944529564fa609272fe44fa33fb7f344b9e2eb4679fe870ee531c71b"

RPROVIDES:${PN} += "libpy2ag-slp.so.2 \
yast2-slp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libslp.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
openslp \
yast2 \
yast2-ruby-bindings"

inherit rpm
