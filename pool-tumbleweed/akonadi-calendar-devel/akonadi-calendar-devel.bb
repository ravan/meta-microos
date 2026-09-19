SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "Development package for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-calendar-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2d0848609ce814e60447e511fc871c0e3c9415bdc944b45e64599d2ff7bace8521c426a50b748daa07bdc7ff241b0d45a0631962945520b8da3fab790282712c"

RPROVIDES:${PN} += "akonadi-calendar-devel \
akonadi5-calendar-devel \
cmake-KPim6AkonadiCalendar \
cmake-KPim6AkonadiCalendarCore"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6I18n \
cmake-KF6WidgetsAddons \
cmake-KPim6Akonadi \
cmake-KPim6IdentityManagementCore \
libKPim6AkonadiCalendar6 \
libKPim6AkonadiCalendarCore6"

inherit rpm
