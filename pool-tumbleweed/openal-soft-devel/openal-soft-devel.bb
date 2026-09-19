SUMMARY = "Development headers for OpenAL Soft"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This subpackage contains libraries and header files for developing \
applications that want to make use of openal-soft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.3~179"

RPM_NAME = "openal-soft-devel-1.24.3~179-1.6.aarch64.rpm"
RPM_HASH = "4d53f4f83b0bf228e593a462e0b5337b0dc17d65d605ae2a57519b4060c7a1fe9453a734e7c0d7a54e2e057a96f36b02a7805b7b39b0cc90449fe1f1e6d5e3b0"

RPROVIDES:${PN} += "cmake-OpenAL \
openal-devel \
openal-soft-devel \
pkgconfig-openal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libopenal1"

inherit rpm
