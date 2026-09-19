SUMMARY = "Library for compressing and decompressing 3D geometric meshes and point clouds"
DESCRIPTION = "Draco is a library for compressing and decompressing 3D geometric meshes \
and point clouds. It is intended to improve the storage and transmission of \
3D graphics."
LICENSE = "Apache-2.0"

PV = "1.5.7"

RPM_NAME = "libdraco9-1.5.7-3.2.aarch64.rpm"
RPM_HASH = "9d72883e1829fe23c5064bf35f77c442ce5565938134cac472400cd22dee8432f841974c14a7899594c14809b4227c55726bc0a12c1fbfdb677ffa488163537d"

RPROVIDES:${PN} += "libdraco.so.9 \
libdraco9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
