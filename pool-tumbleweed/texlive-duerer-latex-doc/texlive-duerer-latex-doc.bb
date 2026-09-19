SUMMARY = "Documentation for texlive-duerer-latex"
DESCRIPTION = "This package includes the documentation for texlive-duerer-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-doc-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "060d76c3214206d8e4f49921dd9a58a45829952bd496eba700773dabe9d83a6d0a89bcc6f2d5c171fa1cf1d6392c7d9e0e1ea00b53073f83a2184ad484c490b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
