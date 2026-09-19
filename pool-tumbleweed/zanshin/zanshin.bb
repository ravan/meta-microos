SUMMARY = "TODO Application"
DESCRIPTION = "Zanshin Todo is an application for managing your day-to-day actions. \
It helps you organize and reduce the cognitive pressure of what one has to do in his \
job and personal life. You will never forget anything anymore."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "zanshin-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "38f07c064abbd791a0473b73987f89ae3c9a264a98c8d0200f8cc9ac185625bd2deac2c3fb59eef54759158af589ba86dee172a5f9d7ee67c6a01bee5270628d"

RPROVIDES:${PN} += "zanshin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6Parts.so.6 \
libKF6Runner.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6KontactInterface.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
