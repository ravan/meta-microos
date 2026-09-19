SUMMARY = "A LaTeX package to typeset (Italian) high school tests"
DESCRIPTION = "The purpose of this package is to manage the exercises for a \
test, their points, levels of difficulty, and solutions. Some \
typical formats of exercises are already implemented: Plain \
exercise 'Complete the Text' 'True or false' Closed questions \
Open questions 'Find the error'"
LICENSE = "LPPL-1.0"

PV = "2026.226.9.1svn77002"

RPM_NAME = "texlive-verifiche-2026.226.9.1svn77002-60.2.noarch.rpm"
RPM_HASH = "a73cb6dd9914eecea8619336bc41d36f189f7838adc9f80779b10e8238c2f36df3018b6f52e14c67dca2fc5a6de6c0cbdc34ae740e68774c4aa7ad5de5175fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verifiche.sty \
texlive-verifiche"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-fp.sty \
tex-pgffor.sty \
tex-randomlist.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
