SUMMARY = "Documentation for texlive-democodetools"
DESCRIPTION = "This package includes the documentation for texlive-democodetools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77050"

RPM_NAME = "texlive-democodetools-doc-2026.226.1.0.2svn77050-59.2.noarch.rpm"
RPM_HASH = "142b282af7b60a8984cc28d861b0a21f9fa17fb9355b41010f867d1a210bcb870954e73b67f15ea355e4ed540035dc1559269c746d9f5ab42cd997db478a56ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-democodetools-doc"

RDEPENDS:${PN} += ""

inherit rpm
