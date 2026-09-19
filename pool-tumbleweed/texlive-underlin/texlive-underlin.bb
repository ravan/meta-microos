SUMMARY = "Underlined running heads"
DESCRIPTION = "Defines two pagestyles that provide underlined page heads in \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-underlin-2026.226.1.01svn15878-60.2.noarch.rpm"
RPM_HASH = "29ac0b5886228cbe39eb0135528cf90587847516d95155f2468c5d420c952621774924b7250e3165e63cd6b96ff55b880fd1e7fa4492547e628a643cc08fd468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underlin.sty \
texlive-underlin"

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
