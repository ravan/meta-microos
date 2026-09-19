SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python314-cookiecutter-2.6.0-4.4.noarch.rpm"
RPM_HASH = "6b5b9ea5346806e6a63a3d8cbdfbc10c50dd51399cc5e011018aa7ff5346480a354594936dd208a3c1d4b70ac8c871c984e779aa8541ea556cbbbf4e2c428c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cookiecutter \
python314-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python314-Jinja2 >= 2.7 with python314-Jinja2 < 4 \
-python314-click >= 7 with python314-click < 9 \
/usr/bin/python3.14 \
/usr/bin/sh \
git-core \
python-abi \
python314-PyYAML \
python314-arrow \
python314-binaryornot \
python314-python-slugify \
python314-requests \
python314-rich \
update-alternatives"

inherit rpm
