SUMMARY = "Documentation for texlive-juraabbrev"
DESCRIPTION = "This package includes the documentation for texlive-juraabbrev"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-juraabbrev-doc-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "a332a60cc92423a1e4a0320e0d15fb9a41074a1725ce49c00cc7a4efcea4cc6433949cec2043e1e64eada96dfa6a920da28fd96755145276585ef136659b1e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-juraabbrev-doc-de \
texlive-juraabbrev-doc"

RDEPENDS:${PN} += ""

inherit rpm
