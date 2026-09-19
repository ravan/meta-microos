SUMMARY = "BibLaTeX support for Nature"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Nature."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-2026.226.1.3dsvn57262-61.2.noarch.rpm"
RPM_HASH = "b8e6ed7a933380f001bfa7ea6776a6efe18951f57b921be095e243f22cb9e93f898414a55133e23478fcc04cb4d338395b6f0a824226a1bf632bbb8e3ad0913f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nature.bbx \
tex-nature.cbx \
texlive-biblatex-nature"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
