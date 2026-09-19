SUMMARY = "Typesetting (complex) polynomial long division"
DESCRIPTION = "This package provides a simple interface for typesetting \
(complex) polynomial long division."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76639"

RPM_NAME = "texlive-complexpolylongdiv-2026.226.0.0.2svn76639-60.2.noarch.rpm"
RPM_HASH = "c5bd2b29c4460603d61a898e2db5c4d085b761169c1e107e5a6d5ecfbace7579696aff85a599da710fa2f90022bc7e4ec339046acba94a52beebf8f86ffdcd27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-complexpolylongdiv.sty \
texlive-complexpolylongdiv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
