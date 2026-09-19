SUMMARY = "A high-level Python Web framework"
DESCRIPTION = "Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design."
LICENSE = "BSD-3-Clause"

PV = "5.2.17"

RPM_NAME = "python313-Django5-5.2.17-2.1.noarch.rpm"
RPM_HASH = "bcffff8cd9ce26042d9e8a511b91e14a57b5d5e00c3acd74c2429bcb86eb049464081261fbcea299bc219850b4a489fd24a0393dd221fd64acd4ebec3d0fef37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Django \
python3-Django5 \
python3-South \
python3-django \
python3.13dist-django \
python313-Django \
python313-Django5 \
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
