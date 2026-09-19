SUMMARY = "Documentation for texlive-xcharter-math"
DESCRIPTION = "This package includes the documentation for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78170"

RPM_NAME = "texlive-xcharter-math-doc-2026.226.0.0.73svn78170-59.4.noarch.rpm"
RPM_HASH = "97aba7d383e606ef0b46e891fef8a7eab7a8e2dc6f3b825ea636a0b763e15657d6875e90a611405e1080c5248207c92713bf89b99bd0165763d367a82050c0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
