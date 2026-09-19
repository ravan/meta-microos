SUMMARY = "Translations for package m17n-db"
DESCRIPTION = "Provides translations for the 'm17n-db' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "1.8.14"

RPM_NAME = "m17n-db-lang-1.8.14-1.1.noarch.rpm"
RPM_HASH = "707b978a69a5d43dd48b5fefb1729ec0cbe68ccde9694d67edb71142eee16f0bb136dcb928376f78a5162ce3bd28aad87a81de8d570796560f7be9b4b6b4142d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-m17n-db-de \
locale-m17n-db-eo \
locale-m17n-db-ja \
locale-m17n-db-vi \
m17n-db-lang \
m17n-db-lang-all"

RDEPENDS:${PN} += "m17n-db"

inherit rpm
