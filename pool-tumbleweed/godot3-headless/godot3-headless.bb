SUMMARY = "Headless version of Godot editor useful for command line"
DESCRIPTION = "This package is the headless version of the Godot editor that is suited for \
exporting Godot games on the command line. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "godot3-headless-3.6.3-1.1.aarch64.rpm"
RPM_HASH = "c4e8987b987470b5412e5e081a772b94c7254995ca90ecb0d403b8244348eb2bfdc2f096f6e05713309e8f596035454064919399321aa4186136ed23f378d926"

RPROVIDES:${PN} += "godot3-headless"

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
