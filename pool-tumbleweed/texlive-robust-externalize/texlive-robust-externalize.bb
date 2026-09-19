SUMMARY = "Cache anything (TikZ, python, ...) in a robust, efficient and pure way"
DESCRIPTION = "This package provides a LaTeX library to cache anything (TikZ, \
python, ...), in a robust, efficient and pure way. We also \
provide a template system with placeholders to provide \
configurable templates. For more information, see the \
documentation and the github repository."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn76924"

RPM_NAME = "texlive-robust-externalize-2026.226.3.0svn76924-60.4.noarch.rpm"
RPM_HASH = "cedf9c2690edc4ef613c0d64e989f34d7677e9aa8a96ecebd8f919503c754738572a8caa4b5c3dd885c1651ed74d8d5288e8df9083a5fa03021049141377ae69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robust-externalize.sty \
texlive-robust-externalize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-pgffor.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xparse.sty \
tex-xsimverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
