SUMMARY = "Console applications and utilities for managing calendars"
DESCRIPTION = "Console applications and utilities for managing calendars in Akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-calendar-tools-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a8481a25a15bc22838ffcb64cb1608e81f089cb698ae4607b1b557b221c155631f32d91534bab980e272134399169613b4f9427ebb163c8e94435e21a25d86e4"

RPROVIDES:${PN} += "akonadi-calendar-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6CalendarSupport.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
