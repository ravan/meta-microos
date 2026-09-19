SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "python314-mathgl-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "09518d4938cd2473953bec2a0649ea19ed6f8e3f9f7cc51ef542b46f232c88ccdf27319e8316231c2f9f494350e4df168d1afab865a20901db3f2798fd217811"

RPROVIDES:${PN} += "python314-mathgl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libpython3.14.so.1.0 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
