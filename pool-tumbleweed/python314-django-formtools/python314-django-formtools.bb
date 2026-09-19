SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.7"

RPM_NAME = "python314-django-formtools-2.7-1.1.noarch.rpm"
RPM_HASH = "ef94ccb4dc6e896b2d2dd0a776c5e13c44988dcc5d9c86be2a0b0afb1d60f9ddd0a8b9022cbd5b79f8e65114bab2c6a7faaa15debecf50a99a5c2ecc7f10a6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-formtools \
python314-django-formtools \
python3dist-django-formtools"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
