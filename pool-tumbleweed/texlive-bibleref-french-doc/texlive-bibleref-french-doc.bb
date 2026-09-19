SUMMARY = "Documentation for texlive-bibleref-french"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-french"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.0svn75246"

RPM_NAME = "texlive-bibleref-french-doc-2026.226.2.4.0svn75246-61.2.noarch.rpm"
RPM_HASH = "c1b2f5f7016b1f4194b397b2e581ae5f799c30aa05e70a4b9b38ee7662f2e8c153ef1fad6b5a6518f091632b4bb4b1119dddfe9eeb96acb3761ace471e267805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibleref-french-doc-fr \
texlive-bibleref-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
