SUMMARY = "Documentation for texlive-quran"
DESCRIPTION = "This package includes the documentation for texlive-quran"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.41svn75029"

RPM_NAME = "texlive-quran-doc-2026.226.2.41svn75029-60.4.noarch.rpm"
RPM_HASH = "5c4a1212e6033e7de00f9cbb9a3bd6a4c19d8d6cc07d318b5b62e39405f73a83fce421d7bc3c61bd9dbc317c1511f29004bb502b3225c6e3596216d5058ffabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-doc"

RDEPENDS:${PN} += ""

inherit rpm
