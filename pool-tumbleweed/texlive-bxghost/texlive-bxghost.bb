SUMMARY = "Ghost insertion for proper xkanjiskip"
DESCRIPTION = "The package provides two commands to help authors for documents \
in Japanese to insert proper xkanjiskips. It supports LuaTeX, \
XeTeX, pTeX, upTeX, and ApTeX (pTeX-ng)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-2026.226.0.0.5.1svn66147-59.2.noarch.rpm"
RPM_HASH = "cc4c1fc3b2e63a4bea14f9e43ff847ca448322f1f9ddcd6636415645da6d732f9431fc9817e6f3058068efb18323a911a7022c270db94e868982bfa0c52d825a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxghost-lib.sty \
tex-bxghost.sty \
texlive-bxghost"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexja-adjust.sty \
tex-luatexja.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
