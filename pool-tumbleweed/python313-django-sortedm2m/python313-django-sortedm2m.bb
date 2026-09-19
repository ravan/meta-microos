SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python313-django-sortedm2m-4.0.0-1.8.noarch.rpm"
RPM_HASH = "a489df90c7bc8ba92a40c0782a287ca87364be79874c76028cbbcb6e9c4889c134ea12b1d6df047767b576657e4a2fb212c13a4103644c791dbab1ccdbed6847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-sortedm2m \
python3.13dist-django-sortedm2m \
python313-django-sortedm2m \
python3dist-django-sortedm2m"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
