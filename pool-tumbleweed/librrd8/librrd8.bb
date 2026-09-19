SUMMARY = "Round Robin Database tool library"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.11.0"

RPM_NAME = "librrd8-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "e79b779f16595f63351bbb2369c2bd61183f73aeebc042379094f2040611b0a596ad6b91db7ba535dfddfe6a84919ff4ee7463fad3be10a57db871087713e541"

RPROVIDES:${PN} += "librrd.so.8 \
librrd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbi.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libxml2.so.16"

inherit rpm
