SUMMARY = "SFML development files"
DESCRIPTION = "SFML is a C++ multimedia API that provides a low and high-level \
access to graphics, input, audio, etc., and may be seen as an \
object-oriented alternative to SDL. SFML can be used as a minimal \
windowing system to interface with OpenGL, or as a multimedia library \
for building games or interactive programs. \
 \
This subpackage provides the header files needed to build SFML \
programs."
LICENSE = "Zlib"

PV = "3.0.2"

RPM_NAME = "sfml3-devel-3.0.2-1.4.aarch64.rpm"
RPM_HASH = "fe1ea890ede2a193ea53447ccecb841f47ec3bbda28cd2a889c3e14e2dde7a128346a016fcaf1c30717f281f20874fa4be0a4de239cfbc8da8cb21e111966fa1"

RPROVIDES:${PN} += "cmake-SFML \
pkgconfig-sfml-all \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
sfml3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsfml3-3-0 \
pkgconfig-flac \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-ogg \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
pkgconfig-vorbis \
pkgconfig-vorbisenc \
pkgconfig-vorbisfile"

inherit rpm
