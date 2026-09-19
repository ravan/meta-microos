SUMMARY = "Free multimedia C++ API"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc., and may be seen as an object-oriented alternative to \
SDL. It can be used as a minimal windowing system to interface with \
OpenGL, or as a multimedia library for building games and interactive \
programs."
LICENSE = "Zlib"

PV = "3.0.2"

RPM_NAME = "libsfml3-3_0-3.0.2-1.4.aarch64.rpm"
RPM_HASH = "ceb7f5ffc3a748a582906c19265129837c26cea85ab9080443fc4a972cd3b73a3ef3393ce787e77fe3870f90375850c7053effa5a7faf908ba6c959ab632a31b"

RPROVIDES:${PN} += "libsfml-audio.so.3.0 \
libsfml-graphics.so.3.0 \
libsfml-network.so.3.0 \
libsfml-system.so.3.0 \
libsfml-window.so.3.0 \
libsfml3-3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXrandr.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3"

inherit rpm
