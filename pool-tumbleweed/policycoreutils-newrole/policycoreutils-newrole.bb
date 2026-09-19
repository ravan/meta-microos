SUMMARY = "The newrole application for RBAC/MLS"
DESCRIPTION = "RBAC/MLS policy machines require newrole as a way of changing the role \
or level of a logged-in user."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-newrole-3.11-2.2.aarch64.rpm"
RPM_HASH = "d781552c8ce3994334946fba0fce3e66572bb979eb131b69c99926f2b233adbf35683e11f4209152ff2036bd8a04c2b80bfc37957192af4acda59c56c61ae7be"

RPROVIDES:${PN} += "policycoreutils-newrole"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
permissions \
policycoreutils"

inherit rpm
