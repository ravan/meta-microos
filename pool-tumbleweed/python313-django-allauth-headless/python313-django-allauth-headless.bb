SUMMARY = "Django allauth - Headless"
DESCRIPTION = "Python extra dependency `headless-spec` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-headless-65.19.1-1.1.noarch.rpm"
RPM_HASH = "06871c9c2ab097fe05f924654cc4e574b74746293813d5955c96bd971a02c036b106f568550e910b756861fa5a5f9e42621ac2917676506222e2dfdee7d3d140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-headless \
python313-django-allauth-headless"

RDEPENDS:${PN} += "python313-PyYAML \
python313-django-allauth"

inherit rpm
