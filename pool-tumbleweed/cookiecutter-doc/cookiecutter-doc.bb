SUMMARY = "Documentation files for cookiecutter"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
This package contains the documentation for cookiecutter."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "cookiecutter-doc-2.6.0-4.4.noarch.rpm"
RPM_HASH = "14abb466ba218ef3cffd7af9d6b291dffd89d467733874e7581f6de81d7454ecceb0e27369a805be6a16269391d8b98c2b51084d07ef756420feda0c454f7546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter-doc"

RDEPENDS:${PN} += ""

inherit rpm
