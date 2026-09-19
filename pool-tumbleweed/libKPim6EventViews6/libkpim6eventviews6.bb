SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6EventViews6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3fcdd4f08f541ed6a0beb203bce6125ba675317694f9f329cf6bffe811aa8823ce909bcbd6621199dff550a5d230084a31731c6390f4692a3b08cac359bea616"

RPROVIDES:${PN} += "libKPim6EventViews.so.6 \
libKPim6EventViews6"

RDEPENDS:${PN} += "/sbin/ldconfig \
eventviews \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKF6WidgetsAddons.so.6 \
libKGantt6.so.3 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarSupport.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6Libkdepim.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
