SUMMARY = "Python bindings for akonadi-calendar"
DESCRIPTION = "This package provides Python bindings for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "python3-akonadi-calendar-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "82d0c478cf365c08ef53aefb0f4064fafdeb4d3815c6acf4f40a5d8f175e0a9988905a932668f139272908d7e95847696502a249ed5321bb65707f2bbd7d829c"

RPROVIDES:${PN} += "python3-akonadi-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ItemModels.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi \
python3-akonadi \
python3-kf6-kcalendarcore"

inherit rpm
