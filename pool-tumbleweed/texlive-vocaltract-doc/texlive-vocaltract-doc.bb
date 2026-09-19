SUMMARY = "Documentation for texlive-vocaltract"
DESCRIPTION = "This package includes the documentation for texlive-vocaltract"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn25629"

RPM_NAME = "texlive-vocaltract-doc-2026.226.1svn25629-60.2.noarch.rpm"
RPM_HASH = "ab2dfcdc6773ee94418bead700489c43ead26589f995e74b48a20fab9380bf4252d6b73f08d046707f1fe97395a3b8a183323e767395ffa8b29c0d1bdc10d713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vocaltract-doc"

RDEPENDS:${PN} += ""

inherit rpm
