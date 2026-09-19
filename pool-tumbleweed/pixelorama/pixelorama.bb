SUMMARY = "2D sprite editor"
DESCRIPTION = "Graphical tool based on the Godot Engine to create and edit \
animated pixel art, game graphics, tiles and many kinds of pixel art"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "pixelorama-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "05506a047a169eabd387591da8af5e169251878753d3a16b78e3f5a4b0de5f83a90b45fc11c3e06aeca2c672a4b407ae38406be0083474ea2b495650726beb4c"

RPROVIDES:${PN} += "pixelorama"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libasound.so.2 \
libbrotlicommon.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdecor-0.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libminiupnpc.so.21 \
libogg.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheora.so.1 \
libtheoradec.so.2 \
libturbojpeg.so.0 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwebp.so.7 \
libwslay.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
