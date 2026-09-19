SUMMARY = "Citation style for literary studies at the University of Wuppertal"
DESCRIPTION = "The package defines a BibLaTeX citation style based on the \
author-title style of biblatex-dw. The citations are optimised \
for literary studies in faculty of humanities at the Bergische \
Universitat Wuppertal."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-2026.226.0.0.2svn31541-60.2.noarch.rpm"
RPM_HASH = "4cc2de290a2e5f14355a5af24852c3513cb6da523e728a64944ce156dbf8c8f2337a0704546eab5a60274ee01bde1e5491e0ffb25605aece8e4fe8fb1dd90138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni-wtal-ger.bbx \
tex-uni-wtal-ger.cbx \
texlive-uni-wtal-ger"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle-dw.bbx \
tex-authortitle-dw.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
