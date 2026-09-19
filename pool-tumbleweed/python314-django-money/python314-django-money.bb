SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.6.1"

RPM_NAME = "python314-django-money-3.6.1-1.1.noarch.rpm"
RPM_HASH = "1c9eed854a81ac3774832a5989ebffc78109d44fe3d5197f65256459635173e4030febc39f8f5fe1e2ebe70a777b8d1e99002be43beed599cc3d0c8acdeb05b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-money \
python314-django-money \
python3dist-django-money"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-py-moneyed \
python314-setuptools"

inherit rpm
