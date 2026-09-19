SUMMARY = "BibLaTeX implementation of the Science bibliography style"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Science."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-2026.226.1.2svn48945-61.2.noarch.rpm"
RPM_HASH = "c7463c1a16005ba2c6aa078ea228d1aa38a376e3fc0fd86f588896853aafb5edb6c56153842c039e22e4205731d82e49930064e7ecf048e8755299af4d5665a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-science.bbx \
tex-science.cbx \
texlive-biblatex-science"

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
