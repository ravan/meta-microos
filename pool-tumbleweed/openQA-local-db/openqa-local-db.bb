SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-local-db-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "c7ff26b6c0e288391f1385f097b3de03b5afd8b5ed4e642d86bc8395674b075e1245266e956bc329089e23f1625185b8b8666a6dc5620ac388cb506d896e5adb"

RPROVIDES:${PN} += "openQA-local-db"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
openQA \
postgresql-server \
user-postgres"

inherit rpm
