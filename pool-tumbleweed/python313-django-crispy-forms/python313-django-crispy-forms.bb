SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "2.7"

RPM_NAME = "python313-django-crispy-forms-2.7-1.1.noarch.rpm"
RPM_HASH = "d2dcf44b789d8d8d65181b2d650c24e082457a0ad5e333e7d0eda2d2e56b541ba3129abb0f883123f2a221d9665c466a24b242c4c8cb8a84701d7ff6319b3bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-crispy-forms \
python3.13dist-django-crispy-forms \
python313-django-crispy-forms \
python3dist-django-crispy-forms"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
