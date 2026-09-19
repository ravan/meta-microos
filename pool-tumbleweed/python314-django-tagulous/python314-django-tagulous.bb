SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python314-django-tagulous-2.1.1-1.3.noarch.rpm"
RPM_HASH = "f44514db5dcb3ec49e9e0b679957c743d277e2f1b70ebc6d7223fa7177f91aec0ca97dfeac73fa70a15f4712fe3f173bb4375d9691a3dfbff94f3cc4db6fb123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-tagulous \
python314-django-tagulous \
python3dist-django-tagulous"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
