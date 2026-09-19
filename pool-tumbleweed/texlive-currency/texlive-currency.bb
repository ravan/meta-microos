SUMMARY = "Format currencies in a consistent way"
DESCRIPTION = "The package facilitates the formatting of currencies (amounts \
and units) with various formatting capabilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn48990"

RPM_NAME = "texlive-currency-2026.226.0.0.4svn48990-61.2.noarch.rpm"
RPM_HASH = "2278343ad99dcf8663ba6c9879cb8f68f14d1d3dddf2318d6a921261943ddaacbe390729d61f4e612d6b96cfc6a9d2b1e233d2f8647d1c342518c3874e6a350d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currency.sty \
texlive-currency"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-eurosym.sty \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-siunitx.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
