SUMMARY = "Documentation for texlive-umbclegislation"
DESCRIPTION = "This package includes the documentation for texlive-umbclegislation"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-doc-2026.226.2016_6_8svn41348-60.2.noarch.rpm"
RPM_HASH = "1d311c83c3c9cb6383bf7cc76b66d0be82ee92f3d0f52fe75aa937f43faa9ee73e6f373b4b3ede4fb6c56074858ec87fc3445a02226ea4a645dd41e78008135f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umbclegislation-doc"

RDEPENDS:${PN} += ""

inherit rpm
