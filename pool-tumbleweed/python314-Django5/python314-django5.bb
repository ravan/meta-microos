SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "5.2.17"

RPM_NAME = "python314-Django5-5.2.17-2.1.noarch.rpm"
RPM_HASH = "39211d58f738e40cd62f670c2d49acb756096ddba36a706ddd2003c62f7d24fb78b059617f6d5cdb04ac418628e6a9b0bd892d500d88337978fc9495a533ad84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django \
python314-Django \
python314-Django5 \
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
