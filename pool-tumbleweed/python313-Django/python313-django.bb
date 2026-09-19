SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python313-Django-6.1.1-1.1.noarch.rpm"
RPM_HASH = "efeb621b55ce87dae9b6d9b911e01a3f7cf063c5694c751b058840055c8e4123e986a745355105df665d3c23f0568c107181347697baf66a9d06acef9a8f237b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django \
python3-South \
python3-django \
python3.13dist-django \
python313-Django \
python313-South \
python313-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-asgiref \
python313-sqlparse \
python313-tzdata"

inherit rpm
