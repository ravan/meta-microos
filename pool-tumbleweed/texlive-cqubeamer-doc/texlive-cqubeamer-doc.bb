SUMMARY = "Documentation for texlive-cqubeamer"
DESCRIPTION = "This package includes the documentation for texlive-cqubeamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-doc-2026.226.1.0svn54512-61.2.noarch.rpm"
RPM_HASH = "78721c17869b775b645be5ab919729c311dcaae89fe509666740544f023a28db5b7c8a859d0a5e07ad08253c4915f67d686bac49b5d9df0bec81de7b89ede51c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cqubeamer-doc-zh \
texlive-cqubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
