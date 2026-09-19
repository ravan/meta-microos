SUMMARY = "Reusable named inline-partials for the Django Template Language"
DESCRIPTION = "Reusable named inline partials for the Django Template Language. \
Template Partials were added to Django in version 6.0. You should use that in new projects:"
LICENSE = "MIT"

PV = "25.3"

RPM_NAME = "python313-django-template-partials-25.3-1.1.noarch.rpm"
RPM_HASH = "56d1d9cb6fa9ea572f5ad4b075e9be55c1ea4ff1db9ed697275a367cec84eb0cb762752c20c35c9d0ff5f03011384f1a29940bd28956ecfe8b373e9a00f9bda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-template-partials \
python3.13dist-django-template-partials \
python313-django-template-partials \
python3dist-django-template-partials"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
