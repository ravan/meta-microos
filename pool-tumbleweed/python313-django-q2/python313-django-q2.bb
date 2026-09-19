SUMMARY = "A multiprocessing distributed task queue for Django"
DESCRIPTION = "Django Q2 is a fork of Django Q. Big thanks to Ilan Steemers for starting this project. Unfortunately, development has stalled since June 2021. Django Q2 is the new updated version of Django Q, with dependencies updates, docs updates and several bug fixes."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python313-django-q2-1.10.0-1.2.noarch.rpm"
RPM_HASH = "c9e5aea24f7f77a839b6ddcd3c68569c0dcedbf9b5bb5a9ed6f171716ae46402e6c724f785d32d120c754689240eb98135f11f7bb0e54197fbf3a6fda86c306d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-q \
python3-django-q2 \
python3.13dist-django-q2 \
python313-django-q \
python313-django-q2 \
python3dist-django-q2"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-picklefield"

inherit rpm
