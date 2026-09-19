SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libstdc++6-locale-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "fe9bd2cd95ca7df35b889f3adf880843dcb772fcad31f480262ddaa2c23f5754e0cd25d583ea5ec3d1f4c700523c2e6284ccf504fe4dba39472d7548f605f071"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
