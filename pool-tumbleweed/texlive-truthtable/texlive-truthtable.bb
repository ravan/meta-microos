SUMMARY = "Automatically generate truth tables for given variables and statements"
DESCRIPTION = "This LuaLaTeX package permits to automatically generate truth \
tables given a table header. It supports a number of logical \
operations which can be combined as needed. It is built upon \
the luacode package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn68300"

RPM_NAME = "texlive-truthtable-2026.226.0.0.1.0svn68300-59.2.noarch.rpm"
RPM_HASH = "8a252d7135310a53781087f25ca9a099e5652825ad8d816c3f3330bac3be39cbf429173dd6d241c385e649427dafdab9d924c78c23d9502645cc0a2813565f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-truthtable.sty \
texlive-truthtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
