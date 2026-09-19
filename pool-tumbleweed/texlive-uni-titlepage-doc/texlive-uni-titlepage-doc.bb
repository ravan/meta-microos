SUMMARY = "Documentation for texlive-uni-titlepage"
DESCRIPTION = "This package includes the documentation for texlive-uni-titlepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76033"

RPM_NAME = "texlive-uni-titlepage-doc-2026.226.1.4svn76033-60.2.noarch.rpm"
RPM_HASH = "2394c2b533fd64c0226eca99ac814bf47d0bd4b105621b1bd8fc63fdf125968bfa06487ee2eeed54e807132409620ce6f1c0ffb177c547313b15e9cb44197a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uni-titlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
