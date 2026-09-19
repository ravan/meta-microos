SUMMARY = "Bootstrap3 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap3 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2024.1"

RPM_NAME = "python314-crispy-bootstrap3-2024.1-3.5.noarch.rpm"
RPM_HASH = "db9902a22ad0b629bcbe2b6ef53403622f3aab20fdb27122557051cde310710e4318171e6b9f1446964cd9662742c060ba98f36f4b4a0847cea3205e5a9fe5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crispy-bootstrap3 \
python314-crispy-bootstrap3 \
python3dist-crispy-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-crispy-forms"

inherit rpm
