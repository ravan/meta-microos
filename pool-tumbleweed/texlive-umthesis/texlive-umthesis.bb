SUMMARY = "Dissertations at the University of Michigan"
DESCRIPTION = "The class loads book class, and makes minimal changes to it; \
its coding aims to be as robust as possible, and as a result it \
has few conflicts with potential add-on packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "54d804e5c4092b4e37c8f46ae84d1206dbc7a5a59f2eabb0dd5160639ff0f02575e2243700102aea859f51ffc50e53e858691c76324490f3530da516f4f8a1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umthesis.cls \
texlive-umthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-etex.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
