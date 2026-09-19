SUMMARY = "AppArmor module for apache2"
DESCRIPTION = "apache2-modapparmor adds support to apache2 to provide AppArmor \
confinement to individual cgi scripts handled by apache modules like \
mod_php and mod_perl. \
 \
This package is part of a suite of tools that used to be named \
SubDomain. \
 \
The documentation is in the apparmor-admin_en package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "apache2-mod_apparmor-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "dfd391d8986b3df8325183926ceb37e3a08c9a4d913d392ea18232427a748994896400a11a310e6ac78454217f1b9f0cf5af566bf8e001992621e0633a627c01"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
