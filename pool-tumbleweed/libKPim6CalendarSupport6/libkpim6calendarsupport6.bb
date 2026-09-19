SUMMARY = "Library for handling calendaring in PIM applications"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6CalendarSupport6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "83a2016dcd34abaca60ad62963c8bf253c7f73c9d10332fa5a96ee7420cb3f884380860547bf1000809b90afdca0af6ba0d8532672026c9cad7d736a843c5bab"

RPROVIDES:${PN} += "libKPim6CalendarSupport.so.6 \
libKPim6CalendarSupport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
calendarsupport \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6IdentityManagementCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
