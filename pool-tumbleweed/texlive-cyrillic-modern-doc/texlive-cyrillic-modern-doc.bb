SUMMARY = "Documentation for texlive-cyrillic-modern"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic-modern"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.4svn71183"

RPM_NAME = "texlive-cyrillic-modern-doc-2026.226.0.0.4svn71183-61.2.noarch.rpm"
RPM_HASH = "584eb806e78c5c813783cde2b265567bde89ca86fe58ab771e87b7711d18e1205c1dd219b58a8b5866e081c872af7be10eef288b1c47dd76b30dda7e9683279d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-modern-doc"

RDEPENDS:${PN} += ""

inherit rpm
