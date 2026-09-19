SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python314-Django-6.1.1-1.1.noarch.rpm"
RPM_HASH = "605cf0d86fdd013998509b040d4c6dd315a01fe6225e971fd023a6ec240695f0347a6b99291af1f2ee07feb6ef3b16943a9afcfcc85f5564f501fd79e38e0348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django \
python314-Django \
python314-South \
python314-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-asgiref \
python314-sqlparse \
python314-tzdata"

inherit rpm
