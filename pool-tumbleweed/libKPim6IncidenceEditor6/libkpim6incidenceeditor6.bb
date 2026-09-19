SUMMARY = "Incidenceeditor Library"
DESCRIPTION = "The IncidenceEditor library for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IncidenceEditor6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b407049d3139899e4a3d01d8513c62e891678909b410ac242b7c72214292cf3aea28bd5fdfe753348b5e166bb37dc14ac515b60aa051e163793c9f5836a57493"

RPROVIDES:${PN} += "libKPim6IncidenceEditor.so.6 \
libKPim6IncidenceEditor6"

RDEPENDS:${PN} += "/sbin/ldconfig \
incidenceeditor \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKGantt6.so.3 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarSupport.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6EventViews.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6LdapCore.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libKPim6TextEdit.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
