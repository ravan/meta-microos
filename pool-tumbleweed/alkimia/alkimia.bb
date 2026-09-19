SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.2.1"

RPM_NAME = "alkimia-8.2.1-1.6.aarch64.rpm"
RPM_HASH = "30ec266b63c8df0887007e3307b7a22629667977d86c264709edd8a8be3224bc1ab6154adeba618c415463be4012ee5ea2cd48b8de04b380b2721e4b3691de11"

RPROVIDES:${PN} += "alkimia \
libqmlalkimia6.so \
qt6qmlimport-org.kde.alkimia6 \
qt6qmlimport-org.kde.alkimia6.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libalkimia6.so.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core.2 \
qt6qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
