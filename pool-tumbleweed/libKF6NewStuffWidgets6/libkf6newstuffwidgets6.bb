SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6NewStuffWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1590c5cea124677db8c3e50fa4ff5f5feaaf01ece59b37f76311b0fa9fe4f9029ca9b80dc893f295b2e7b1c6e11b3eb880df9c24cd94a028ffe018430850bd15"

RPROVIDES:${PN} += "libKF6NewStuffWidgets.so.6 \
libKF6NewStuffWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6NewStuffCore.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
