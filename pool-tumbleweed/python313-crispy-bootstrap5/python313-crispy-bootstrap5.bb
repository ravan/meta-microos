SUMMARY = "Bootstrap5 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap5 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2026.3"

RPM_NAME = "python313-crispy-bootstrap5-2026.3-1.3.noarch.rpm"
RPM_HASH = "989c15e0475d8a8c23a674663a22025d2bf74fd101d27aa9f60f62599b829ecc18082a4cced923681ec757448202df1ee155322477ad2d37cb9eb63903c48f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap5 \
python3.13dist-crispy-bootstrap5 \
python313-crispy-bootstrap5 \
python3dist-crispy-bootstrap5"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-crispy-forms"

inherit rpm
