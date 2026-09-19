SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons)."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Parts6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "d401a9277e2cb11aecceadc6c14211e0e8b7f5d72da0bd7d646c086e003d8a58af27634863bb59bf27643acc804a77a801c01d2b3593c1dd3cfc7d2e5b52b8c8"

RPROVIDES:${PN} += "libKF6Parts.so.6 \
libKF6Parts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kparts \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
