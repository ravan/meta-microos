SUMMARY = "Documentation for texlive-annotate-equations"
DESCRIPTION = "This package includes the documentation for texlive-annotate-equations"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn67044"

RPM_NAME = "texlive-annotate-equations-doc-2026.226.0.0.2.2svn67044-61.2.noarch.rpm"
RPM_HASH = "7837da4da463ff21bcad71fc4f689c5b3f88bf5281aece4f04364f26c8fed4ad07ee770ecf0032ceaa47721f570225406a8773157b1f03de3c82883710df29a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate-equations-doc"

RDEPENDS:${PN} += ""

inherit rpm
