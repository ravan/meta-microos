SUMMARY = "Typeset complex trees for linguists"
DESCRIPTION = "jTree uses PSTricks to enable linguists to typeset complex \
trees. The package requires use of PStricks (of course) and \
xkeyval packages. jTree is a development of, and replacement \
for, the jftree package, which is no longer available."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-2026.226.2.6svn20946-59.2.noarch.rpm"
RPM_HASH = "2667f065d90268c4f075b89546856a99f35bc704c8d1480590fb831d8adfdf6cd6636b3d07f5cb830beebae9be9f3ed9209cb57763e70c88547c4291c438181c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-jtree.sty \
tex-pst-jtree.tex \
texlive-pst-jtree"

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
