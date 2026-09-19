SUMMARY = "A YAML parser and tool for easy LaTeX definition creation"
DESCRIPTION = "This LuaLaTeX package provides a YAML parser and some functions \
to declare and define LaTeX definitions using YAML files."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73922"

RPM_NAME = "texlive-yamlvars-2026.226.svn73922-59.4.noarch.rpm"
RPM_HASH = "ca18fc691057f4f575bda67ad1fc12b548ff5ebc6c58664fddf54a418b5cecb5cb9af44f5d7667ec753f6d3c2eaf5c1f43d7b8a4dadaa6dc3a18333abe61e2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yamlvars.sty \
texlive-yamlvars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-luacode.sty \
tex-luakeys.sty \
tex-penlightplus.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
