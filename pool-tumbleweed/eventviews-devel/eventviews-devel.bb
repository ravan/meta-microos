SUMMARY = "Library for messages"
DESCRIPTION = "The development package for the eventviews libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "eventviews-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ba26aa26d5e42fdca90c4529dcebf8c997bab41dd645b55aa14b0906aa2f599806180e89faf8638472cf046d285009c03bac283b70bcbeef6b4ab78469eb0b36"

RPROVIDES:${PN} += "cmake-KPim6EventViews \
eventviews-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiCalendar \
cmake-KPim6CalendarSupport \
cmake-KPim6CalendarUtils \
libKPim6EventViews6"

inherit rpm
