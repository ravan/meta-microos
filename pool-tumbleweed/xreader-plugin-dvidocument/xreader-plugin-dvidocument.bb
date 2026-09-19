SUMMARY = "DVI document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DVI documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-dvidocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "5e45b93058eee4f39fd2f71dbb057f51776ca461079f64e74d4795c7bc7725a26192f066f0d59b69a392d0ee9af76190639e7c77d8e29bdb1c13a0909b981b84"

RPROVIDES:${PN} += "libdvidocument.so \
xreader-plugin-dvidocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
