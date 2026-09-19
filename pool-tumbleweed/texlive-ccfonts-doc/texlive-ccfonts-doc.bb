SUMMARY = "Documentation for texlive-ccfonts"
DESCRIPTION = "This package includes the documentation for texlive-ccfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ccfonts-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "2706fa503750d06badb7b0c654608c1f3bb048b66c7d5933e3498b163b60698a765c52970b1a6d9ac37932b6217c2810b69b7ab3e2ecee429dd8e799cdd61db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
