SUMMARY = "Make overhead slides"
DESCRIPTION = "A class that produces overhead slides (transparencies), with \
many facilities. The class requires availability of the \
fancybox package. Seminar is also the basis of other classes, \
such as prosper. In fact, seminar is not nowadays reckoned a \
good basis for a presentation -- users are advised to use more \
recent classes such as powerdot or beamer, both of which are \
tuned to 21st-century presentation styles. Note that the \
seminar distribution relies on the xcomment package, which was \
once part of the bundle, but now has a separate existence."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.63asvn77682"

RPM_NAME = "texlive-seminar-2026.226.1.63asvn77682-60.2.noarch.rpm"
RPM_HASH = "35c64356d6e6b41853c686204e7ed8aeb57a99f349ab2d712b555f95315558d652d8d449996a741bd1e70c64b238d0014f56378c25efffd5e819155fb6156c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-npsfont.sty \
tex-sem-a4.sty \
tex-sem-dem.sty \
tex-sem-page.sty \
tex-semcolor.sty \
tex-semhelv.sty \
tex-seminar.cls \
tex-seminar.sty \
tex-semlayer.sty \
tex-semlcmss.sty \
tex-semrot.sty \
tex-slidesec.sty \
tex-tvz-code.sty \
tex-tvz-hax.sty \
tex-tvz-user.sty \
texlive-seminar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-article.sty \
tex-doc.sty \
tex-fancybox.sty \
tex-hyperref.sty \
tex-pst-ovl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
