SUMMARY = "KDE PIM Libraries: AkonadiCalendar"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiCalendar6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "afc02ea2bd71a348cbb7dbb4c50d478b05c87d48031552b99f2986c08d3bab94664e1ebe6efa45f013645bea9bcc58ac21aa7dcba67093c147a250c9a314f408"

RPROVIDES:${PN} += "libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCalendar6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-calendar \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6Mime.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCalendarCore6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailTransport.so.6 \
libKPim6MessageComposer.so.6 \
libKPim6MessageCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libqgpgmeqt6.so.15 \
libstdc++.so.6"

inherit rpm
