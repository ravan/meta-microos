SUMMARY = "Bootstrap5 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap5 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2026.3"

RPM_NAME = "python314-crispy-bootstrap5-2026.3-1.3.noarch.rpm"
RPM_HASH = "1afd9ad6cf489bc17d39837471301e045a07f33dec786d9c7a0c65ebbf3da1761b7df1ad015fd8597599e2678c083622233f77aa8194ca4e93c14400bd058968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-crispy-bootstrap5 \
python314-crispy-bootstrap5 \
python3dist-crispy-bootstrap5"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-crispy-forms"

inherit rpm
