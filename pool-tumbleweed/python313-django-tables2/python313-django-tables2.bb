SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python313-django-tables2-3.0.0-1.2.noarch.rpm"
RPM_HASH = "acd34fc7d1058135a34db7c114dfb6ad24bd2c748d85aeabb39238cab3920009ae2d6e53c46a521d8b3c46450ef9b97f5fc296a729caf091a1be9b586497320a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tables2 \
python3.13dist-django-tables2 \
python313-django-tables2 \
python3dist-django-tables2"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
