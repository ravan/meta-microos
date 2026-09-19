SUMMARY = "Development package for the KDEPIM Calendarsupport library"
DESCRIPTION = "The development package for the calendarsupport libraries"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "calendarsupport-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "670bc47cf8c539fc424cec1d5180eb057ceb7c1f2ff1c674d4b0f4867cf0f4a833f8ebbbded84809a06fdb7e384211e7bc51e98e01119535351cd5ce9716af22"

RPROVIDES:${PN} += "calendarsupport-devel \
cmake-KPim6CalendarSupport"

RDEPENDS:${PN} += "cmake-KF6Mime \
cmake-KPim6AkonadiCalendar \
cmake-KPim6IdentityManagementCore \
cmake-Qt6PrintSupport \
libKPim6CalendarSupport6"

inherit rpm
