SUMMARY = "Typesetting science fiction/fantasy manuscripts"
DESCRIPTION = "The class is designed for typesetting science fiction and \
fantasy manuscripts. Sffms now includes several options for \
specific publishers as well as extensive documentation aimed at \
new LaTeX users."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-sffms-2026.226.2.0svn15878-60.2.noarch.rpm"
RPM_HASH = "02701bd985a57472be25249e80cae8ad28ddee642d164bccb07be2638e6b341c0a17364032e04b8ce6875e0b2cf83493acaa8eba0dea8b799bed3c88e3fe144c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sffdumb.sty \
tex-sffms.cls \
tex-sffsmart.sty \
texlive-sffms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-report.cls \
tex-setspace.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
