SUMMARY = "Library for making scientific graphics"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. MathGL \
integrates into FLTK, Qt and OpenGL applications."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "python313-mathgl-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "5d84083862de2fec0cc48575fa1f708db735ba047b8f00d8be68856768e297118ca9230f023f11ad7e5907ea98bc47017a33ffb5e098cf07ecdac71ed82fce88"

RPROVIDES:${PN} += "python3-mathgl \
python313-mathgl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
