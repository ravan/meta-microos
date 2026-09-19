SUMMARY = "Creation of syntax diagrams"
DESCRIPTION = "Create syntax diagrams using special environments and commands \
to represent the diagram structure."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-syntax-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "4c1e773c38b2dfbb9c7272db23a5a13c47533f92e32e7e381474cef8d5617ec087827062f7bc3a80fa561285a69babb7b5b88f60ceed5557929d671c048ac6b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntax.tex \
texlive-syntax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
