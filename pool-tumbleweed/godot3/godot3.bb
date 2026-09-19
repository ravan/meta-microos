SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "godot3-3.6.3-1.1.aarch64.rpm"
RPM_HASH = "2d418372bcf3b1111d85de3773684ca8e11618accac2a5e19a4331426cd85af6d8c1899d5d9c413ba45012a6eccee61b3debced463bad2f7f632cbe55bc61a4f"

RPROVIDES:${PN} += "bundled-FastLZ \
bundled-RVO2-3D \
bundled-Tangent-Space-Normal-Maps \
bundled-brotli \
bundled-cvtt \
bundled-embree \
bundled-enet \
bundled-etc2comp \
bundled-glad \
bundled-google-droid-fonts \
bundled-hack-fonts \
bundled-hqx \
bundled-ifaddrs-android \
bundled-jpeg-compressor \
bundled-libsimplewebm \
bundled-minimp3 \
bundled-minizip \
bundled-nanosvg \
bundled-noto-sans-fonts \
bundled-oidn \
bundled-open-simplex-noise-in-c \
bundled-pcg \
bundled-polyclipping \
bundled-polypartition \
bundled-pvrtccompressor \
bundled-recastnavigation \
bundled-smaz \
bundled-squish \
bundled-stb \
bundled-tinyexr \
bundled-vhacd \
bundled-xatlas \
bundled-yuv2rgb \
godot3"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletSoftBody.so.3.25 \
libGL.so.1 \
libLinearMath.so.3.25 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
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
