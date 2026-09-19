SUMMARY = "Documentation for texlive-cyrillic"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71408"

RPM_NAME = "texlive-cyrillic-doc-2026.226.svn71408-61.2.noarch.rpm"
RPM_HASH = "d9afc81baf6c4e4d2efca589c547635055809f84ec09c5e56d059007f66bf31d00102bad5a88535c0ec10a44660cbe3d07604b8e7022f9511dd83b9d1076da27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-doc"

RDEPENDS:${PN} += ""

inherit rpm
