SUMMARY = "Draw signal flow graphs"
DESCRIPTION = "Defines some commands to draw signal flow graphs as used by \
electrical and electronics engineers and graph theorists. \
Requires fp and pstricks packages (and a relatively fast \
machine)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn20209"

RPM_NAME = "texlive-sfg-2026.226.0.0.91svn20209-60.2.noarch.rpm"
RPM_HASH = "c9d1b1624de72c8e22a8c5ca7ea0710aa7a627fc48739706097b237725b7737f77b9d2b7fdc450d969529b41e15719ad049eae0eb7d64669b4716d355c0acaf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sfg.sty \
texlive-sfg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
