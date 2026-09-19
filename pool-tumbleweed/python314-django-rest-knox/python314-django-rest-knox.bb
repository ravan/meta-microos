SUMMARY = "Authentication for Django REST framework"
DESCRIPTION = "Authentication for Django REST framework."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python314-django-rest-knox-5.0.2-2.5.noarch.rpm"
RPM_HASH = "ece9db8553e14df2de4c845ae6e01ed5a6cd128d3316ec9bcb542650f47b557ea97ae00258143534cdd3b777d03c854bfdd0725a13b758e3bf95d019ed9dc1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rest-knox \
python314-django-rest-knox \
python3dist-django-rest-knox"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-cryptography \
python314-djangorestframework"

inherit rpm
