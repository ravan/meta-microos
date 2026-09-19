SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.30"

RPM_NAME = "python314-Django4-4.2.30-5.1.noarch.rpm"
RPM_HASH = "69f9881f1514cdee2fa8e234147e2e2e332bbc1f54c767c965f568d6028314fff9c825db7cbb3465fdfe79686c7b5abd48edf8c57ab9d68c14935b64342c364c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django \
python314-Django \
python314-Django4 \
python314-South \
python314-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-Pillow \
python314-argon2-cffi \
python314-asgiref \
python314-bcrypt \
python314-pytz \
python314-setuptools \
python314-sqlparse"

inherit rpm
