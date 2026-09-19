SUMMARY = "Visualize node lists in a tree view"
DESCRIPTION = "nodetree is a development package that visualizes the structure \
of node lists. nodetree shows its debug information in the \
console output when you compile a LuaTeX file. It uses a \
similar visual representation for node lists as the UNIX tree \
command for a folder structure."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.1svn76924"

RPM_NAME = "texlive-nodetree-2026.226.2.4.1svn76924-61.2.noarch.rpm"
RPM_HASH = "d1911865da8009df7480d04b8c3ef500ab6cc42d18bf79c603fe19bb6437378af616872fc51ae2f815c3955f74717b3bc66e00fbfc32c205d15009391054bcef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nodetree-embed.sty \
tex-nodetree.sty \
tex-nodetree.tex \
texlive-nodetree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-mdframed.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
