SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "4.2.30"

RPM_NAME = "python313-Django4-4.2.30-5.1.noarch.rpm"
RPM_HASH = "36a2ec0acc215c65f6f47d5f906b2211ca0c761b03e976c0ae258bf2820f374e794b96b6a5fda260d185c92a9d412120555acc7f761fd5b7b1770f0e47a8cf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django \
python3-Django4 \
python3-South \
python3-django \
python3.13dist-django \
python313-Django \
python313-Django4 \
python313-South \
python313-django \
python3dist-django"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313 \
python313-Pillow \
python313-argon2-cffi \
python313-asgiref \
python313-bcrypt \
python313-pytz \
python313-setuptools \
python313-sqlparse"

inherit rpm
