SUMMARY = "Loading patterns in LuaLaTeX with language.dat"
DESCRIPTION = "Preloading hyphenation patterns (or 'hyphen rules.) into any \
format based upon LuaTeX is not required in LuaTeX and recent \
releases of babel don't do it anyway. This package is addressed \
to those who just want to select the languages and load their \
patterns by means of `language.dat` without loading `babel`."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn78101"

RPM_NAME = "texlive-luahyphenrules-2026.226.1.1svn78101-59.2.noarch.rpm"
RPM_HASH = "8746c3006b63f74ed986ee560d29a4c5f59fba309d61222b7b10252adbf66e5aa1ddab85b58a95dc5978d50a24c8755c9a9284309a367bffaa0d743fa6469707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luahyphenrules.sty \
texlive-luahyphenrules"

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
