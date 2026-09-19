SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kitinerary-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d8d07e65933c51b6b14e6f86ce8ab1e68ac5ab4af9550fa898563f692c612453be602048c620335f8df74ea791008d70fd0f0f0cccc535e9c82c34f2ade84b76"

RPROVIDES:${PN} += "cmake-KPim6Itinerary \
kitinerary-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6Contacts \
cmake-KF6Mime \
cmake-KPim6PkPass \
cmake-Qt6Gui \
libKPim6Itinerary6"

inherit rpm
