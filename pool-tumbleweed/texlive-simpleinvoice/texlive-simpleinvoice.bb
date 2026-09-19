SUMMARY = "Easy typesetting of invoices"
DESCRIPTION = "This package lets you easily typeset professional-looking \
invoices. The user specifies the content of the invoice by \
different \\setPROPERTY commands, and an invoice is generated \
automatically with the \\makeinvoice command."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn45673"

RPM_NAME = "texlive-simpleinvoice-2026.226.svn45673-60.2.noarch.rpm"
RPM_HASH = "3bddf8671df4ebbd46896a9132ff1da746a2f52436ffdf1cf96612757a4f15a65f9a69e48ec7a11678107902eaa57876fd8a8febce544f0ee7cdaa321867a763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleinvoice.sty \
texlive-simpleinvoice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-advdate.sty \
tex-babel.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-tabularx.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
