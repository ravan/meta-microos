SUMMARY = "Companion application for conferences"
DESCRIPTION = "Kongress provides practical information about conferences. \
It supports conferences that offer their schedule in iCalendar \
format. In Kongress, the data of the talks are shown in various \
ways, e.g. in daily views, by talk category, etc. The users can \
also create a list of favorite conference talks/events as well as \
they can navigate to the web page of each talk. A map of the \
conference venue, location information and link to OpenStreetMap \
can also be added."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kongress-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9eb62b93e8d56f5d8742072cd2f40bba320cdef86f56416f18d53db01b267a9c795a122199cf176251ad6efdffe39ce8e4d6ade91c7be4650c65109f2abf5e92"

RPROVIDES:${PN} += "kongress"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
