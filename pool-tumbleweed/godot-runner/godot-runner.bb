SUMMARY = "Shared binary to play games developed with the Godot engine"
DESCRIPTION = "This package contains a godot-runner binary for the Linux platform, \
which can be used to run any game developed with the Godot engine simply \
by pointing to the location of the game's data package."
LICENSE = "MIT"

PV = "4.7.2"

RPM_NAME = "godot-runner-4.7.2-1.1.aarch64.rpm"
RPM_HASH = "9ed089846fd9d9afca3a197a3269ab91d7a21c376d9e041315f64d712ffd8e6e919f2c5eade20ad40310b47714d4b3756197d5bb52a0003911728a2f6a4d56e3"

RPROVIDES:${PN} += "godot-runner"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
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
