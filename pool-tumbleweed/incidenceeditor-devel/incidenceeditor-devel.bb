SUMMARY = "Development package for incidenceeditor"
DESCRIPTION = "The development package for the incidenceeditor libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "incidenceeditor-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "58b40deec2b2be021b5ffa11e170024fcf3e4080de46011b9fea372e94b2693c7d9b4e0a9aaa138c237ee5439b54232fcc26640e8fad89f2a3889bd86ffa136d"

RPROVIDES:${PN} += "cmake-KPim6IncidenceEditor \
incidenceeditor-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6Mime \
cmake-KPim6AkonadiMime \
cmake-KPim6CalendarSupport \
cmake-KPim6CalendarUtils \
cmake-KPim6EventViews \
libKPim6IncidenceEditor6"

inherit rpm
