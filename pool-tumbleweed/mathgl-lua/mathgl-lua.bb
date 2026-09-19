SUMMARY = "Lua interface for the MathGL library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides lua interface for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-lua-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "aea43690d6460b83719c73dc94de5a46d26e583fa880c242a9b7fabe215a67a50724bf095fcf8cc23ee5b83677f0e5c8ba4da8add4a4956b2ebbf570d21252e6"

RPROVIDES:${PN} += "mathgl-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
