SUMMARY = "Documentation for texlive-dataref"
DESCRIPTION = "This package includes the documentation for texlive-dataref"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn62942"

RPM_NAME = "texlive-dataref-doc-2026.226.0.0.7svn62942-61.2.noarch.rpm"
RPM_HASH = "ac480fa36a31da4e0413ddcb0ab10e46c42fd08c33235e58afa283e5413c2b0c9cf4988a30cb90818c69a4767c8af64d04551b9b436c389640bba142c1b938e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dataref-doc"

RDEPENDS:${PN} += ""

inherit rpm
