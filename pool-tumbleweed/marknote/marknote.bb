SUMMARY = "Rich text notes editor"
DESCRIPTION = "Marknote lets you create rich text notes and easily organise them into notebooks. \
You can personalise your notebooks by choosing an icon and accent color for each \
one, making it easy to distinguish between them and keep your notes at your \
fingertips. Your notes are saved as Markdown files in your Documents folder, \
making it easy to use your notes outside of Marknote as well as inside the app."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "marknote-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "0ff5100cd2f2c42aae11024cf6ca2200276bb07521c8a0957b237c398f962d79872a7d146ffb15aab3790ddd500e3317fb6e20e8049676f177dd3daa1e2e1f58"

RPROVIDES:${PN} += "marknote"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Mime.so.6 \
libKF6WindowSystem.so.6 \
libKirigamiAddonsStatefulApp.so.6 \
libKirigamiApp.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libmd4c-html.so.0 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
