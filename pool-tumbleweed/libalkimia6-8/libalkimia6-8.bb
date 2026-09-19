SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library for Qt6 with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.2.1"

RPM_NAME = "libalkimia6-8-8.2.1-1.6.aarch64.rpm"
RPM_HASH = "769e64e57ea1fd50c10ff9a7262c6373314230b36efbe5eb569f36d2152a24ea7a909c9cb057c2249a239320fcc5672251403dff39acb220232326ad2af2a38d"

RPROVIDES:${PN} += "libalkimia6-8 \
libalkimia6.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
