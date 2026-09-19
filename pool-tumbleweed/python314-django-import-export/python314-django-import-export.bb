SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "python314-django-import-export-4.4.1-1.2.noarch.rpm"
RPM_HASH = "be00b44056fc805fd20fa677e99364721807120b6e80ca4360fb8001f54e0ea122c86c89b24d23c868008b88e1bb27a6351a3a59831970b7e141413dcd39fc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-import-export \
python314-django-import-export \
python3dist-django-import-export"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-diff-match-patch \
python314-tablib"

inherit rpm
