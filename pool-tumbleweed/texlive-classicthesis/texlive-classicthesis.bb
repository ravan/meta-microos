SUMMARY = "A 'classically styled' thesis package"
DESCRIPTION = "This package provides an elegant layout designed in homage to \
Bringhurst's 'The Elements of Typographic Style'. It makes use \
of a range of techniques to get the best results achievable \
using TeX. Included in the bundle are templates to make thesis \
writing easier."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.8svn73676"

RPM_NAME = "texlive-classicthesis-2026.226.4.8svn73676-60.2.noarch.rpm"
RPM_HASH = "c7b26d54dda3d3108aaa301065c01537adf432c552f9eab349d59e0e815d7246560055a4fc09d5a16079cdb242702ddcd7ffb068bb75b0f2ba8f40b72e7b5e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classicthesis-arsclassica.sty \
tex-classicthesis-linedheaders.sty \
tex-classicthesis-plain.sty \
tex-classicthesis.sty \
texlive-classicthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-euler-math.sty \
tex-eulervm.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-mparhack.sty \
tex-prelim2e.sty \
tex-scrlayer-scrpage.sty \
tex-scrtime.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-typearea.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
