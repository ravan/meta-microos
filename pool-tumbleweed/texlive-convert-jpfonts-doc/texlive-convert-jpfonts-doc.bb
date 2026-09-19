SUMMARY = "Documentation for texlive-convert-jpfonts"
DESCRIPTION = "This package includes the documentation for texlive-convert-jpfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn73551"

RPM_NAME = "texlive-convert-jpfonts-doc-2026.226.1.0.1svn73551-61.2.noarch.rpm"
RPM_HASH = "1595da470f1722f561a05df474fdb3688e6af5f1cd9924f7f759281b37f26f8e8ebbc0dfea707878ad815f8bbc103a708dd683ee2763ed4fcfbe02a2d7dd56ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-convert-jpfonts-doc-ja \
texlive-convert-jpfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
