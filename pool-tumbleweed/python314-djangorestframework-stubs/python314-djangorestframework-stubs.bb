SUMMARY = "PEP-484 stubs for django-rest-framework"
DESCRIPTION = "Mypy stubs for Django REST Framework. Supports Python 3.10 and up."
LICENSE = "MIT"

PV = "3.18.1"

RPM_NAME = "python314-djangorestframework-stubs-3.18.1-1.1.noarch.rpm"
RPM_HASH = "ecf986bc3fe97b7d52e595f357f7088afe87668a2227ef8b6a76a55ff7e796aac654fce8632f717ed797a2855967625750542ddba5f505c8d7dba78c3a26a3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-djangorestframework-stubs \
python314-djangorestframework-stubs \
python3dist-djangorestframework-stubs"

RDEPENDS:${PN} += "python-abi \
python314-django-stubs \
python314-types-PyYAML \
python314-typing-extensions"

inherit rpm
