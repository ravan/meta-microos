SUMMARY = "Bootstrap4 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap4 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2026.2"

RPM_NAME = "python314-crispy-bootstrap4-2026.2-1.2.noarch.rpm"
RPM_HASH = "b8b70265451ffcfdd4a9dd88369bb52af96812d6eb7d53e4b13d2208911fb0d06cba3b214b138d0c44ebaddf9dfc861ed3b0b155edc180fd20e015588a459e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crispy-bootstrap4 \
python314-crispy-bootstrap4 \
python3dist-crispy-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-crispy-forms"

inherit rpm
