SUMMARY = "Documentation for texlive-scrhack"
DESCRIPTION = "This package includes the documentation for texlive-scrhack"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.42svn76924"

RPM_NAME = "texlive-scrhack-doc-2026.226.3.42svn76924-60.2.noarch.rpm"
RPM_HASH = "cd94c4f0d01d3e4f4881a7e237bd5418ba0b38ae3225073fe7f7227756a73a825fd36c4c87b07ead5be58f7fac07ab04539d6fad2b9cd25989dc3ef2aaffc4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrhack-doc"

RDEPENDS:${PN} += ""

inherit rpm
