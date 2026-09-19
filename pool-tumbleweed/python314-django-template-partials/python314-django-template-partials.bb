SUMMARY = "Reusable named inline-partials for the Django Template Language"
DESCRIPTION = "Reusable named inline partials for the Django Template Language. \
Template Partials were added to Django in version 6.0. You should use that in new projects:"
LICENSE = "MIT"

PV = "25.3"

RPM_NAME = "python314-django-template-partials-25.3-1.1.noarch.rpm"
RPM_HASH = "e829d5132cc9404f4ba0d6891d3e0b16b543569c99119fe5f3202ac0e513cf891148423d01eef9b96ad26f78d561c52fbbb09b8ecf0bb7f19f827106938a11bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-template-partials \
python314-django-template-partials \
python3dist-django-template-partials"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
