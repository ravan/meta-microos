SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "python313-django-braces-1.17.0-2.5.noarch.rpm"
RPM_HASH = "7a8a7e336ed96b7f5a93e469c59f7e2c106164095019ce6a90092808eeeb0b5142587aa75aa047a0b37856be464cafffa36a0443a7cc43778dbfb6ffdb94de1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-braces \
python3.13dist-django-braces \
python313-django-braces \
python3dist-django-braces"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
