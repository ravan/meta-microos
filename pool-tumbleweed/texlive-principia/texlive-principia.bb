SUMMARY = "Notations for typesetting the 'Principia Mathematica'"
DESCRIPTION = "This package supports typesetting the Peanese notation in \
Volumes I-III of Whitehead and Russell's 1910 'Principia \
Mathematica'."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn74710"

RPM_NAME = "texlive-principia-2026.226.3.4svn74710-59.2.noarch.rpm"
RPM_HASH = "3898cc5a76558e2f7ba1527b7d9e092799d0963c6d6182aed2e3420fcec39feb92fd7e07d8347e2b5eff2fa83d8b3018b43148cd82bfa06bc5c6bb2e83dd2216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-principia.sty \
texlive-principia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-graphicx.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
