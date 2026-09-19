SUMMARY = "Unofficial thesis template for Huazhong University"
DESCRIPTION = "The package provides an Unofficial Thesis Template in LaTeX for \
Huazhong University of Science and Technology."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn76924"

RPM_NAME = "texlive-hustthesis-2026.226.2.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "75616a561c27fc0c023f509e259d4ecda88b0dfadd97951740c65571f86bbd05c878313c97965c78c8a4d41c50b4d6a1713196d8c90a61d433817206b0e1bb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hustthesis-d.def \
tex-hustthesis-doc.sty \
tex-hustthesis-m.def \
tex-hustthesis.bbx \
tex-hustthesis.cbx \
tex-hustthesis.cls \
texlive-hustthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-gb7714-2015.bbx \
tex-gb7714-2015.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
