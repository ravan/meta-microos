SUMMARY = "Program to test a Render extension implementation"
DESCRIPTION = "rendercheck is a program to test a Render extension implementation \
against separate calculations of expected output."
LICENSE = "HPND"

PV = "1.6"

RPM_NAME = "rendercheck-1.6-1.9.aarch64.rpm"
RPM_HASH = "2a32952c0c1ec10cf201b441e8895648b5eba66a23e63d3167aa5731e72758fb0ac6925806fa413a281930de1ed869e8dd1bb6910c47aed9161c8b8aaed41635"

RPROVIDES:${PN} += "rendercheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6"

inherit rpm
