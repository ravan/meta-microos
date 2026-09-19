SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.7"

RPM_NAME = "python313-django-formtools-2.7-1.1.noarch.rpm"
RPM_HASH = "fad5a0c184e29686dcc1e0df8022a53a8d8911b3a21f39ccb06c8a70bb5b28e08346d640ad9821b0b7681ee65cc54b8b4b6671d4221bfdc5c0e7c7a24ba0b9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-formtools \
python3.13dist-django-formtools \
python313-django-formtools \
python3dist-django-formtools"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
