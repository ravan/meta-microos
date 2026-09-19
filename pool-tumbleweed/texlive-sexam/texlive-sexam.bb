SUMMARY = "Package for typesetting arabic exam scripts"
DESCRIPTION = "The package provides a modified version of the exam package \
made compatible with XeLaTeX/polyglossia to typesetting arabic \
exams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn46628"

RPM_NAME = "texlive-sexam-2026.226.1svn46628-60.2.noarch.rpm"
RPM_HASH = "5ddff39d16a320adfe68bfc8b599114ce2f77eda9d028d421403d50e1ca7a8d58061e88b8df0e1c512a6430b2d2370ca041970395ea395cb0efadafc54fac16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bacex.sty \
tex-sexam.sty \
tex-wexam.sty \
texlive-sexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-background.sty \
tex-bclogo.sty \
tex-ean13isbn.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-fmtcount.sty \
tex-fouriernc.sty \
tex-geometry.sty \
tex-listings.sty \
tex-mathpple.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-moreenum.sty \
tex-multicol.sty \
tex-pifont.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-wasysym.sty \
tex-yagusylo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
