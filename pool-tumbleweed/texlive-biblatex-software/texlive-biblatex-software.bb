SUMMARY = "BibLaTeX stylefiles for software products"
DESCRIPTION = "This package implements software entry types for BibLaTeX in \
the form of a bibliography style extension. It requires the \
Biber backend."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2_8svn77180"

RPM_NAME = "texlive-biblatex-software-2026.226.1.2_8svn77180-61.2.noarch.rpm"
RPM_HASH = "f8497ac18f513c93ca8bc26781c7e6a6cdfb6c8840cb90ef888a4358c46866410e01356fb48f13e1c7d1ab2aad06b43febd270735941c4c4f6a83a4a030c8385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-software.lbx \
tex-french-software.lbx \
tex-software-biblatex.sty \
tex-software.bbx \
texlive-biblatex-software"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
