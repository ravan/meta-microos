SUMMARY = "Development files for ktnef"
DESCRIPTION = "Development files for ktnef."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "ktnef-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9610aa585f54b6c6c82c9f4182d2d39c4748292c56b04cc65765d7579dd84fe8af6069fcd0784039f0bd5f58773b7010d52dd5ef5aa35255d664b83866be3e03"

RPROVIDES:${PN} += "cmake-KPim6Tnef \
ktnef-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
libKPim6Tnef6"

inherit rpm
