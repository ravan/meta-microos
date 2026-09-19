SUMMARY = "A LaTeX class for stage plays"
DESCRIPTION = "Stage.cls is a LaTeX class for creating plays of any length in \
a standard manuscript format for production and submission."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn62929"

RPM_NAME = "texlive-stage-2026.226.1.03svn62929-64.2.noarch.rpm"
RPM_HASH = "d5dfb9b170b87015ae06cc64190d77c72a18604786b792f54855c607ddfbffcbcf8350b618e70f1da7dd8dbb890581ad2cbb1eb3e7089e6fde346d8e8d2c165e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stage.cls \
texlive-stage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-changepage.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-needspace.sty \
tex-parskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
