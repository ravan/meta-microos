SUMMARY = "Specifying placeholders for demonstration purposes"
DESCRIPTION = "This package is meant for setting parameters in a LuaLaTeX \
document in a more programmatic way with YAML. Parameters can \
be specified by adding a 'recipe' file. These recipe files \
describe the parameter's type, placeholders and/or default \
values. From thereon, the placeholders can be displayed in the \
document and an 'example' document can be created. An 'actual \
copy' document can be created by loading additional 'payload' \
files, which all must correspond to a recipe file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn70850"

RPM_NAME = "texlive-lua-placeholders-2026.226.1.0.3svn70850-59.2.noarch.rpm"
RPM_HASH = "3df36aae432fbf87cff7d46e6be041951f7c20991466fbf687b21759f3a7933bee0ff95d19a86799e9961f8ee8d80ce1687f34e6d4ec9a70febb78c960422991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-placeholders.sty \
texlive-lua-placeholders"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-luapackageloader.sty \
tex-textcomp.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
