SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python313-django-js-asset-4.0.2-1.1.noarch.rpm"
RPM_HASH = "2d5ce225cbc03ae7b9986a303149d18374a78bc6752133092656b6ca966c848874d700c92a876b981c4a779e087f8b807df1f71996c32eae94745d7d22650bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-js-asset \
python3.13dist-django-js-asset \
python313-django-js-asset \
python3dist-django-js-asset"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
