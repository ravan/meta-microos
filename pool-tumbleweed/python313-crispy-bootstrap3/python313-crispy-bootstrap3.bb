SUMMARY = "Bootstrap3 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap3 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2024.1"

RPM_NAME = "python313-crispy-bootstrap3-2024.1-3.5.noarch.rpm"
RPM_HASH = "d317847b822bdd2a73a788bafaf5ded4d8ec534cd54f8342b573436cd002e2baf4d5f11018250b38094c403e271e774c02860c54d9a87f423d956547d2fe65ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap3 \
python3.13dist-crispy-bootstrap3 \
python313-crispy-bootstrap3 \
python3dist-crispy-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-crispy-forms"

inherit rpm
