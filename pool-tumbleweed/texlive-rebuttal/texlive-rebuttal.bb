SUMMARY = "Markup for structured journal and conference paper rebuttals"
DESCRIPTION = "This package provides means for writing structured journal and \
conference paper rebuttals."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn72851"

RPM_NAME = "texlive-rebuttal-2026.226.0.0.1.1svn72851-60.4.noarch.rpm"
RPM_HASH = "549a6fafaa2e5683249663b632f3b73491a5367359815f0ed82fb39c3340cc799d8ccb74afc5d0f812994e153187dd463d2a8e8238bab4cd387b83e1f10796c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rebuttal.sty \
texlive-rebuttal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-chngcntr.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-pdfcomment.sty \
tex-pgfkeys.sty \
tex-soul.sty \
tex-tikz.sty \
tex-todonotes.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
