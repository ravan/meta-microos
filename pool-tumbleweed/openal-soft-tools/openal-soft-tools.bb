SUMMARY = "OpenAL Soft tools"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains additional tools for OpenAL."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "1.24.3~179"

RPM_NAME = "openal-soft-tools-1.24.3~179-1.6.aarch64.rpm"
RPM_HASH = "d306a3bf02e0ba92ec8a78210ea881344f98fbb71f79cc45b30d8241a52b69e849197763f2fa70af6f5609e61467de4eb81e60894afaeed6535c394adfdf59e0"

RPROVIDES:${PN} += "openal-soft-/usr/bin/openal-info \
openal-soft-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
