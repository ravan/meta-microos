SUMMARY = "Documentation for texlive-scripture"
DESCRIPTION = "This package includes the documentation for texlive-scripture"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn76924"

RPM_NAME = "texlive-scripture-doc-2026.226.2.2svn76924-60.2.noarch.rpm"
RPM_HASH = "68970c9f318ea59d67e8177eadba4000901f616e5002cac20c128ed6291c85f5fd7d20db09acf456b177beb310ff239344d684197316ec466c33596d2bc78e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scripture-doc"

RDEPENDS:${PN} += ""

inherit rpm
