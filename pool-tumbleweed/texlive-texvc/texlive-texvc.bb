SUMMARY = "Use MediaWiki LaTeX commands"
DESCRIPTION = "User MediaWiki LaTeX commands to copy and past formulae from \
MediaWiki to LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn76874"

RPM_NAME = "texlive-texvc-2026.227.1.3svn76874-62.2.noarch.rpm"
RPM_HASH = "40dc642b04e22caa1bb37768f3064eeac6b266a2dec016d9388c78dc64271521d87b3e62c56c4ac57bfdba3327a3e379e7e0c3217672a6785871d8021eda0679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texvc.sty \
texlive-texvc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-arcs.sty \
tex-babel.sty \
tex-bbold.sty \
tex-cancel.sty \
tex-color.sty \
tex-eurosym.sty \
tex-mhchem.sty \
tex-stix.sty \
tex-teubner.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
