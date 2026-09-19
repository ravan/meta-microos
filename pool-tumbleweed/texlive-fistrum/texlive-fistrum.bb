SUMMARY = "Access to 150 paragraphs of Lorem Fistrum very dummy text"
DESCRIPTION = "Fistrum is a LaTeX package forked from lipsum that produces \
dummy text for use in documents and examples. The paragraphs \
were taken with permission from https://www.chiquitoipsum.com/. \
Fistrum es un paquete de LaTeX derivado de lipsum que produce \
texto de ejemplo para usarlo en documentos y ejemplos. Los \
parrafos se han tomado con permiso de \
https://www.chiquitoipsum.com/."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-fistrum-2026.226.0.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "953bbd308563d8dd690c8434a7f9c9dc007db044af30dc0529e7c89ad9242acf86e9379b2c2619ae1836c5e986bd57e03fdd5ce236f848a138ac59c1566da043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fistrum-es.ftd.tex \
tex-fistrum-la.ftd.tex \
tex-fistrum.sty \
texlive-fistrum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
