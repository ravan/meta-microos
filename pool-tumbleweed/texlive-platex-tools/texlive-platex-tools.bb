SUMMARY = "PLaTeX standard tools bundle"
DESCRIPTION = "This bundle is an extended version of the latex-tools bundle \
developed by the LaTeX team, mainly intended to support \
pLaTeX2e and upLaTeX2e. Currently patches for the latex-tools \
bundle and Martin Schroder's ms bundle are included."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn72097"

RPM_NAME = "texlive-platex-tools-2026.226.svn72097-59.2.noarch.rpm"
RPM_HASH = "4013f111e653958e85c018fc0b02515b083c164ff828ccd426e4477960c6b0f680a55d1f1e7fd5735af922d165cc277aad309423753db1125000a73be216c5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plarray.sty \
tex-pldocverb.sty \
tex-plextarray.sty \
tex-plextcolortbl.sty \
tex-plextdelarray.sty \
tex-pxatbegshi.sty \
tex-pxeverysel.sty \
tex-pxeveryshi.sty \
tex-pxftnright.sty \
tex-pxmulticol.sty \
tex-pxxspace.sty \
texlive-platex-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-atbegshi.sty \
tex-colortbl.sty \
tex-delarray.sty \
tex-doc.sty \
tex-etoolbox.sty \
tex-everysel.sty \
tex-everyshi.sty \
tex-ftnright.sty \
tex-multicol.sty \
tex-pdftexcmds.sty \
tex-plext.sty \
tex-ptrace.sty \
tex-uptrace.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
