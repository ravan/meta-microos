SUMMARY = "Macros to generate quantum ciruits"
DESCRIPTION = "The package supports those within the quantum information \
community who typeset quantum circuits, using xy-pic package, \
offering macros designed to help users generate circuits."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-2026.226.2.6.0svn48400-60.4.noarch.rpm"
RPM_HASH = "35ce1439b51e37e00a2727ed5cb0e2e8f711a7a6f87f551bdc2f3acbd514f5da23af947d44f419c204d4b6039baf825c2a3ef1895d91551b264261ce1acf8622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qcircuit.sty \
texlive-qcircuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
