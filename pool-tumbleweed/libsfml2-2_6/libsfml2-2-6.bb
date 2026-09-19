SUMMARY = "Free multimedia C++ API"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc., and may be seen as an object-oriented alternative to \
SDL. It can be used as a minimal windowing system to interface with \
OpenGL, or as a multimedia library for building games and interactive \
programs."
LICENSE = "Zlib"

PV = "2.6.1"

RPM_NAME = "libsfml2-2_6-2.6.1-2.8.aarch64.rpm"
RPM_HASH = "d827fa098d0644be7afbbda74a974d334e74d43b045485f442552cb950b928709e6bd484c6244c5882fc2faa58089a618faf9de1816900cc3ca1a66f7b4635a0"

RPROVIDES:${PN} += "libsfml-audio.so.2.6 \
libsfml-graphics.so.2.6 \
libsfml-network.so.2.6 \
libsfml-system.so.2.6 \
libsfml-window.so.2.6 \
libsfml2-2-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libX11.so.6 \
libXcursor.so.1 \
libXrandr.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libopenal.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3"

inherit rpm
