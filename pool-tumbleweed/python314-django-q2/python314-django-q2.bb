SUMMARY = "A multiprocessing distributed task queue for Django"
DESCRIPTION = "Django Q2 is a fork of Django Q. Big thanks to Ilan Steemers for starting this project. Unfortunately, development has stalled since June 2021. Django Q2 is the new updated version of Django Q, with dependencies updates, docs updates and several bug fixes."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python314-django-q2-1.10.0-1.2.noarch.rpm"
RPM_HASH = "d918bf0e26a2e6866fa8d4af6d35b76f924f5b413e02cde1ee75f24523159f50b5fa2ec099c9a3b7bcf5aa34bab8904f10f9d2fc53c3585d7be187016780b047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-q2 \
python314-django-q \
python314-django-q2 \
python3dist-django-q2"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-picklefield"

inherit rpm
