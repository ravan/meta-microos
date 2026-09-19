SUMMARY = "COSMIC xdg portal"
DESCRIPTION = "This package contains the xdg portal implementation for COSMIC DE."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "xdg-desktop-portal-cosmic-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "2eb65218f6a77a3d5a689913dc5aaf0051e7dd8ffcfbeb020a7a15d39e661c305366b07402449c213bc2da36ac3280d2d5865b5a62177b3827fd70b9566ea68e"

RPROVIDES:${PN} += "xdg-desktop-portal-cosmic"

RDEPENDS:${PN} += "libc.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpipewire-0.3.so.0 \
libxkbcommon.so.0"

inherit rpm
