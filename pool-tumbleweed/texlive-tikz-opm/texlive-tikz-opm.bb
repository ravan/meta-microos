SUMMARY = "Typeset OPM diagrams"
DESCRIPTION = "Typeset OPM (Object-Process Methodology) diagrams using LaTeX \
and PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-2026.226.0.0.1.1svn32769-59.2.noarch.rpm"
RPM_HASH = "ff996257f48607e2e71d0a1fa9360b2591aadbcc14d76f9d357798d2ab426c363e78b7dd7db1c8426145824238cd1e5bcad4714e178c06de98eb85a6e3dd576b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-opm.sty \
texlive-tikz-opm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-makeshape.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
