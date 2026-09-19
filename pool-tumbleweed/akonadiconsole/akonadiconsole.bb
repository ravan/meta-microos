SUMMARY = "Management and debugging console for akonadi"
DESCRIPTION = "Akonadi Console is a utility that can be used to explore or manage \
Akonadi. This utility exposes Akonadi internals, and can be useful \
for debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadiconsole-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9f84508805d95564c9148ed7370464ea705a19ea14a056c5050dd0a57f15a22f51b1a493fdcbf07b7ab6bc1303b094aabf5e14889c4b6485d3753298cdcacb68"

RPROVIDES:${PN} += "akonadiconsole \
libakonadiconsole.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6Mime.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiPrivate.so.6 \
libKPim6AkonadiSearchCore.so.6 \
libKPim6AkonadiSearchXapian.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6AkonadiXml.so.6 \
libKPim6CalendarSupport.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6MessageViewer.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
