SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "python313-django-reversion-6.3.0-1.1.noarch.rpm"
RPM_HASH = "ed40903f6939fe0b7fc11209fbeef7ae7e29fe00b84c72c25ecfa81d372d884cc23fe70371facf27bf561118bf76d6a56f6aff776b4d7b9a732461436f7e9b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-reversion \
python3.13dist-django-reversion \
python313-django-reversion \
python3dist-django-reversion"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
