SUMMARY = "A modern curriculum vitae class"
DESCRIPTION = "The class provides facilities for typesetting modern \
curriculums vitae, both in a classic and in a casual style. It \
is fairly customizable, allowing you to define your own style \
by changing the colours, the fonts, etc. The template.tex file \
can be used as an example."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.1svn77552"

RPM_NAME = "texlive-moderncv-2026.226.2.5.1svn77552-61.2.noarch.rpm"
RPM_HASH = "b5a52d28fce85b2e6fb7fab25a90ec6aff28a087f9a212016903553bc48d8ed55009513734e5004b39976bfdf9d375adfd0cef26e7d1aa8a8489a7a4f76b8dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moderncv.cls \
tex-moderncvbodyi.sty \
tex-moderncvbodyii.sty \
tex-moderncvbodyiii.sty \
tex-moderncvbodyiv.sty \
tex-moderncvbodyv.sty \
tex-moderncvbodyvi.sty \
tex-moderncvcollection.sty \
tex-moderncvcolorblack.sty \
tex-moderncvcolorblue.sty \
tex-moderncvcolorburgundy.sty \
tex-moderncvcolorcerulean.sty \
tex-moderncvcolorgreen.sty \
tex-moderncvcolorgrey.sty \
tex-moderncvcolororange.sty \
tex-moderncvcolorpurple.sty \
tex-moderncvcolorred.sty \
tex-moderncvcolors.sty \
tex-moderncvcompatibility.sty \
tex-moderncvdebugtools.sty \
tex-moderncvfooti.sty \
tex-moderncvheadi.sty \
tex-moderncvheadii.sty \
tex-moderncvheadiii.sty \
tex-moderncvheadiv.sty \
tex-moderncvheadv.sty \
tex-moderncvheadvi.sty \
tex-moderncvheadvii.sty \
tex-moderncviconsacademic.sty \
tex-moderncviconsawesome.sty \
tex-moderncviconsletters.sty \
tex-moderncviconsmarvosym.sty \
tex-moderncviconssymbols.sty \
tex-moderncviconstikz.sty \
tex-moderncvskillmatrix.sty \
tex-moderncvstylebanking.sty \
tex-moderncvstylecasual.sty \
tex-moderncvstyleclassic.sty \
tex-moderncvstylecontemporary.sty \
tex-moderncvstyleempty.sty \
tex-moderncvstylefancy.sty \
tex-moderncvstyleoldstyle.sty \
tex-moderncvverticaltimeline.sty \
tex-tweaklist.sty \
texlive-moderncv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-academicons.sty \
tex-arydshln.sty \
tex-calc.sty \
tex-changepage.sty \
tex-ebgaramond.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kurier.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-qrcode.sty \
tex-tgpagella.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-academicons \
texlive-arydshln \
texlive-colortbl \
texlive-etoolbox \
texlive-fancyhdr \
texlive-filesystem \
texlive-fontawesome5 \
texlive-graphics \
texlive-hyperref \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-microtype \
texlive-multirow \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-url \
texlive-xcolor"

inherit rpm
