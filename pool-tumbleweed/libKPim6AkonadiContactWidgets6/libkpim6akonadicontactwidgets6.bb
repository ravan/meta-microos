SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiContactWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ff164e4c82ea9346be69445519206685627c492a36480f66fd54399f22935689467186d32af2b65c31d0a2ba2a0c80bf359760d51c78e6b07e354978439662f5"

RPROVIDES:${PN} += "libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiContactWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-contacts \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Prison.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6GrantleeTheme.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
