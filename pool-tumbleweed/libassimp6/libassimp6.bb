SUMMARY = "Library to load and process 3D scenes from various data formats"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "6.0.5"

RPM_NAME = "libassimp6-6.0.5-4.3.aarch64.rpm"
RPM_HASH = "b4e77979aa3c153ecf55bae59857bf6c1c19dec071edc06d52378bc9d0be159037cad0613171d5de8728a9bcaf7f9fdf02158ba90dcb570ba17c4b35b68dd2a0"

RPROVIDES:${PN} += "libassimp.so.6 \
libassimp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminizip.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
