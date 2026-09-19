SUMMARY = "A reimplementation of the LaTeX for-loop macro"
DESCRIPTION = "The package redefines the LaTeX internal \\@for macro so that \
the loop may be prematurely terminated. The action is akin to \
the C/Java break statement, except that the loop does not \
terminate until the end of the current iteration"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-xfor-2026.226.1.05svn77682-59.4.noarch.rpm"
RPM_HASH = "7924e57b4a282227472678313d99a7f80ebf33e25e3688e5cb89a34b37f74996d595eed98bc80777530dc74128f9ddb952fa83906744d547f649be207538f742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfor.sty \
texlive-xfor"

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
