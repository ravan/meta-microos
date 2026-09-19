SUMMARY = "A class file to typeset screenplays"
DESCRIPTION = "The class implements the format recommended by the Academy of \
Motion Picture Arts and Sciences."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn27223"

RPM_NAME = "texlive-screenplay-2026.226.1.6svn27223-60.2.noarch.rpm"
RPM_HASH = "09cbf16e1a8393f875fbb86f4d61b426cab5c4d53029344e6e5af65c0163997fd71a017aa64bc19bad39a156955fd0e78de7061972eb3eac8b11a67eb86c5af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hardmarg.sty \
tex-screenplay.cls \
texlive-screenplay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-courier.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
