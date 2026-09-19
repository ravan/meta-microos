SUMMARY = "Godot headless binary for servers"
DESCRIPTION = "This package contains the headless binary for the Godot game engine \
particularly suited for running dedicated servers. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "godot3-server-3.6.3-1.1.aarch64.rpm"
RPM_HASH = "24a8d4b95ec6f877c0c1b6cbd3d53c22a94be2dbcf26adf7339617b711574768b34aa3aea3b9686236e3307e0ec6adc6e7f744d98c3f3f46667cfacbd1749574"

RPROVIDES:${PN} += "godot3-server"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletSoftBody.so.3.25 \
libLinearMath.so.3.25 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libminiupnpc.so.21 \
libogg.so.0 \
libopus.so.0 \
libopusfile.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtheora.so.1 \
libtheoradec.so.2 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwebp.so.7 \
libwslay.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
