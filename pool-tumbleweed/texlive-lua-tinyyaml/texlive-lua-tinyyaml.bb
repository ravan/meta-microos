SUMMARY = "A tiny YAML (subset) parser in pure Lua"
DESCRIPTION = "This package provides a YAML (subset) parser written in pure \
Lua. It supports a subset of the YAML 1.2 specifications. It is \
required by several other LuaTeX packages including markdown \
and citeproc-lua."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.4svn73671"

RPM_NAME = "texlive-lua-tinyyaml-2026.226.0.0.4.4svn73671-59.2.noarch.rpm"
RPM_HASH = "a7763e4ce3326e0626ed2fd3995c20e5cb80353e9538928ce590ecbefe5a42ca6804824232f8597532eae777ecc22b8386a2d10bfe2cc3b54135ece43e9c47fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-tinyyaml"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
