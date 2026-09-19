SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.7"

RPM_NAME = "wiiuse-devel-0.15.7-1.3.aarch64.rpm"
RPM_HASH = "b8e6aed2156607f00d31c6e04220f5eff0814e396516706b653373db670d83b95d696c9fed8d1d9996de54a7dc674af4c0d7ac0546f3283852ca9ae70f869372"

RPROVIDES:${PN} += "wiiuse-devel"

RDEPENDS:${PN} += "bluez-devel \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libSDL-1.2.so.0 \
libc.so.6 \
libglut.so.3 \
libwiiuse.so.0 \
libwiiuse0"

inherit rpm
