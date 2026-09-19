SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-django-rest-framework-social-oauth2-1.2.0-2.5.noarch.rpm"
RPM_HASH = "799cf126f02f48a51577ec63971b96242f53c1b36f0defa31cbf07a44ba937b884e92d55c9be70f0034078fb70eddcbc0c9a611b6736f2884f6d8eda01a5e11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rest-framework-social-oauth2 \
python314-django-rest-framework-social-oauth2 \
python3dist-django-rest-framework-social-oauth2"

RDEPENDS:${PN} += "python-abi \
python314-django-braces \
python314-django-oauth-toolkit \
python314-djangorestframework \
python314-social-auth-app-django"

inherit rpm
