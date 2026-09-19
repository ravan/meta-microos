SUMMARY = "Bootstrap4 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap4 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2026.2"

RPM_NAME = "python313-crispy-bootstrap4-2026.2-1.2.noarch.rpm"
RPM_HASH = "262f973c73e2d0299007e04fe3e47380555e842aaa38e70e1fafa8a175695bd29790fcb3d598ef8b09ebf8670110302c7536a4f5fa85a498503f51c7837b10fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap4 \
python3.13dist-crispy-bootstrap4 \
python313-crispy-bootstrap4 \
python3dist-crispy-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-crispy-forms"

inherit rpm
