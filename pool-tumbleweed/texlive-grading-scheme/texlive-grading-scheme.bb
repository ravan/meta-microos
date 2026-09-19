SUMMARY = "Typeset grading schemes in tabular format"
DESCRIPTION = "This package aims at an easy-to-use interface to typeset \
grading schemes in tabular format, in particular \
grading-schemes of exercises of mathematical olympiads where \
multiple solutions have to be graded and might offer mutual \
exclusive ways of receiving points."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-grading-scheme-2026.226.0.0.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "724100a4b464368093736671cc0f5e5d6d15541e5bfcfa65a8dfe0cc3528c0de9234f9a4f66864dd8575e47f22e4b17fb367a076d600a159c81442c99f0cc424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grading-scheme.sty \
texlive-grading-scheme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-multirow.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
