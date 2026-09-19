SUMMARY = "Cross-platform terminal emulator"
DESCRIPTION = "Ghostty is a fast, feature-rich, and cross-platform terminal \
emulator that uses platform-native UI and GPU acceleration."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "75b62f6f83b6b6b9f8333ca7b804b27a0694474f6ac52c75f0fdc032278be2a3d7fba0346445dafa35bcbf7724e59d75d380a17bae09049d75002501e865776c"

RPROVIDES:${PN} += "ghostty"

RDEPENDS:${PN} += "libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglslang-default-resource-limits.so.16 \
libglslang.so.16 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtk4-layer-shell.so.0 \
libharfbuzz.so.0 \
libhwy.so.1 \
libm.so.6 \
libonig.so.5 \
libsimdutf.so.35 \
libspirv-cross-c-shared.so.0 \
libwayland-client.so.0 \
terminfo-ghostty"

inherit rpm
