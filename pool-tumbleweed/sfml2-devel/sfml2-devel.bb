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

PV = "2.6.1"

RPM_NAME = "sfml2-devel-2.6.1-2.8.aarch64.rpm"
RPM_HASH = "15651f65349f2fd26433efde89c5c497ac7bb21d646b4efa35ffc2b91d1d20e05417885d1d9afadeeba4b695b78f9386f71c23b40042acdf9a48826cb628d613"

RPROVIDES:${PN} += "cmake-SFML \
pkgconfig-sfml-all \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
sfml2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsfml2-2-6 \
pkgconfig-flac \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-ogg \
pkgconfig-openal \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
pkgconfig-vorbis \
pkgconfig-vorbisenc \
pkgconfig-vorbisfile"

inherit rpm
