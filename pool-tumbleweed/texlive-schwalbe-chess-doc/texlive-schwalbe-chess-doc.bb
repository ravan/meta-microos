SUMMARY = "Documentation for texlive-schwalbe-chess"
DESCRIPTION = "This package includes the documentation for texlive-schwalbe-chess"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn78101"

RPM_NAME = "texlive-schwalbe-chess-doc-2026.226.2.13svn78101-60.2.noarch.rpm"
RPM_HASH = "4c05d49d503085d777d31973951c5fa8533bd9738beb7733297609e5ae1ce857bff544f07748cb77989bd5d46a1c06c498be7b1f561279f4e9320a503540894e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schwalbe-chess-doc-de \
texlive-schwalbe-chess-doc"

RDEPENDS:${PN} += ""

inherit rpm
