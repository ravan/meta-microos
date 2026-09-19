SUMMARY = "Library for compressing and decompressing 3D geometric meshes and point clouds"
DESCRIPTION = "Draco is a library for compressing and decompressing 3D geometric meshes \
and point clouds. It is intended to improve the storage and transmission of \
3D graphics."
LICENSE = "Apache-2.0"

PV = "1.5.7"

RPM_NAME = "draco-1.5.7-3.2.aarch64.rpm"
RPM_HASH = "fa81e7f45ee683ef57ef5fc53e8e3ca114b9299ab6b8425da9f0abd8819994035f0af8a3a6978a3602f37483a1bd69463ac2b1d6d8f674517fe6a33dbbded0f1"

RPROVIDES:${PN} += "draco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdraco.so.9 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
