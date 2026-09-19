SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "skanlite-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b1dcc004f2371953bc81aff6cc0dfa963a6d2620233a41849ff3481a95647c32f2f1c7111662bffe65ab348be302d8f953e75378ce7e6226c9dfd15442152474"

RPROVIDES:${PN} += "skanlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKSaneWidgets6.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
