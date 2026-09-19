SUMMARY = "Akonadi Agent base library"
DESCRIPTION = "This package provides the basic GUI widgets for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "44e9a99c808398be908c8dd164e273bd6b198bec8081898f72d1ef94bbb18af03a5b47a26ff1cc9e541cdf864874bdd9d7f7443eb2e6f7d5fc66e6619e556df7"

RPROVIDES:${PN} += "libKPim6AkonadiWidgets.so.6 \
libKPim6AkonadiWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiPrivate.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
