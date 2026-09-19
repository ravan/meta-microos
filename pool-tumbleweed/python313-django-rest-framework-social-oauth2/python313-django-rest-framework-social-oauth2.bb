SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-django-rest-framework-social-oauth2-1.2.0-2.5.noarch.rpm"
RPM_HASH = "6fb2e9c9a81610c79fa92dc80640c768d9b513887f9ad8547d05ce33d54cb38a5616e4d69df0692b3830c04cdc3d2cf9b50032ed542449141f23db95da5a213a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-social-oauth2 \
python3.13dist-django-rest-framework-social-oauth2 \
python313-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python313-django-braces \
python313-django-oauth-toolkit \
python313-djangorestframework \
python313-social-auth-app-django"

inherit rpm
