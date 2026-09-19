SUMMARY = "Database Needed by the m17n Library m17n-lib"
DESCRIPTION = "Database that is needed by the m17n library 'm17n-lib'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "1.8.14"

RPM_NAME = "m17n-db-1.8.14-1.1.noarch.rpm"
RPM_HASH = "966ed07327e95a6219c2c478800407ba624381cfcf04f2b2b0eaafb277894521d540f39fbcf5c6170914f040846fa468eb53779812dda677d0b737af8c27aaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "m17n-contrib \
m17n-db \
pkgconfig-m17n-db"

RDEPENDS:${PN} += "/usr/bin/gawk \
/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
