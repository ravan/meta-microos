SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "7.2.2"

RPM_NAME = "python313-django-timezone-field-7.2.2-1.1.noarch.rpm"
RPM_HASH = "6bfe5d52e26ea9ebce69df829740a2f8158b9d422d380645af19533d59826ec320cf37c5b3504fc4a2a0ea09bdef58f14717698beaaee33a58768943b80a82e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-timezone-field \
python3.13dist-django-timezone-field \
python313-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
