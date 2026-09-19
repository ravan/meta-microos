SUMMARY = "Documentation for texlive-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-latex-make"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4.3svn60874"

RPM_NAME = "texlive-latex-make-doc-2026.226.2.4.3svn60874-63.2.noarch.rpm"
RPM_HASH = "282f71325b66c66275ef55a792ba6a169a10739cedb471bf3df9524ac09c15d4b3196be442af6d7abc37e17aca79e871873643804ae01fa7103668008cff1639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
