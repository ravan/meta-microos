SUMMARY = "BibTeX style for use with RSC journals"
DESCRIPTION = "The rsc package provides a BibTeX style in accordance with the \
requirements of the Royal Society of Chemistry. It was \
originally based on the file pccp.bst, but also implements a \
number of styles from the achemso package. The package is now a \
stub for the chemstyle package, which the author developed to \
unify the writing of articles with a chemistry content."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1fsvn41923"

RPM_NAME = "texlive-rsc-2026.226.3.1fsvn41923-60.2.noarch.rpm"
RPM_HASH = "2f2ff833b7a86316438f6b2f5b116678a994be5feb28159728f51eaee1347a495eb01dcf7c1f3359b27920e82dc6b9919628ea69520f72cdaf542c8a1a64eb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rsc.sty \
texlive-rsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-mciteplus.sty \
tex-natbib.sty \
tex-natmove.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
