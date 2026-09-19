SUMMARY = "Apply a template to a tsv file"
DESCRIPTION = "This is a simple tsv (tab-separated values) reader for LuaLaTeX \
and plain LuaTeX. It also supports (non-quoted) comma-separated \
values, or indeed values separated by any character."
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-2026.226.2022_1.0svn65333-59.2.noarch.rpm"
RPM_HASH = "d074a37f8cf1927e1c73866032e47d5c254b39d224f131b1e244ae27a15ba7ed3685ec321203c61978a92e0e1c1e31626dd0657cbcfa32f839535c4d6f84fc42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tsvtemplate.sty \
tex-tsvtemplate.tex \
texlive-tsvtemplate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
