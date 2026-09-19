SUMMARY = "Repeat BibTeX entries in a LuaLaTeX document body"
DESCRIPTION = "The package reimplements bibentry, for use in LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-2026.226.0.0.1asvn55777-59.2.noarch.rpm"
RPM_HASH = "8b8c7608ebbea5a6fe2f643fec4d0060de49c5c6f4613d6b5696e9d8c6a8e76fe317be77fe1e873402ede0c7ba4c49da50365095bcdbcbfe0381760d6f916b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luabibentry.sty \
texlive-luabibentry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
