SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python313-cookiecutter-2.6.0-4.4.noarch.rpm"
RPM_HASH = "d2d56bc7713a58473208fe14d409b7b52ffc624833ea6831bc0cd22db9cff997fa2986a4b63890912ca7724e137fb2060dbd335bc6771b8701ea64316bb5ef39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter \
python3-cookiecutter \
python3.13dist-cookiecutter \
python313-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python313-Jinja2 >= 2.7 with python313-Jinja2 < 4 \
-python313-click >= 7 with python313-click < 9 \
/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python313-PyYAML \
python313-arrow \
python313-binaryornot \
python313-python-slugify \
python313-requests \
python313-rich \
update-alternatives"

inherit rpm
