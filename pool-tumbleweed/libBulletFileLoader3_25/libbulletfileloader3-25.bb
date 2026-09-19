SUMMARY = "Bullet File Loader Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libBulletFileLoader3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "a13d287b5c9ca052c578382e4cc29b5b3798fef1206a231faf9a021f25a2bd08b9cd9ef240e92456bbc61f34f3fa6cc58a0c63662669e86643321769464f22bc"

RPROVIDES:${PN} += "libBulletFileLoader.so.3.25 \
libBulletFileLoader3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
