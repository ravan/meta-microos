SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python314-django-sortedm2m-4.0.0-1.8.noarch.rpm"
RPM_HASH = "b4b167a8cb7bb0ad31a6189e2323c9a69024f7b2b42229d10b22541bbc20d64c24f01a6952e7db720860436b98ee7d8bd373062a77bf21d4476bcb31c29f75c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-sortedm2m \
python314-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
