SUMMARY = "Screenshot software"
DESCRIPTION = "A program to capture screenshots. \
 \
Features: \
 \
 * Customizable appearance \
 * Annotation and drawing tools \
 * DBus interface \
 * Export to file, web"
LICENSE = "GPL-3.0-only"

PV = "14.0.0"

RPM_NAME = "flameshot-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "2ce26b2e56e0fd6ad23d21ab8afa778c77e94d8a50703637220c7fb510214ccf2454c6d7384ada7a9c06b33afd65fd6c9d208026bc9a6c4c0f474e75c900b08d"

RPROVIDES:${PN} += "flameshot"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
