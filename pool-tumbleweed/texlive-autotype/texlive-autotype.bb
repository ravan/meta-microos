SUMMARY = "A LuaLaTeX package for automatic language-specific typography"
DESCRIPTION = "autotype is a LuaLaTeX package for automatic language-specific \
typography. Currently, it supports ligature suppression at word \
boundaries, long s insertion for blackletter typesetting, and \
weighted hyphenation, but only for German (old and new \
orthography)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn76924"

RPM_NAME = "texlive-autotype-2026.226.0.0.5svn76924-60.2.noarch.rpm"
RPM_HASH = "42e04df8e61b00ef4d850761e5b0e98929af0928cff99bbe2c3b3a951ebe40accc3aa55bac88a53c975932eb1e17cade2e1663292cfe8fa32740dbdffd9f74de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autotype.sty \
texlive-autotype"

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
