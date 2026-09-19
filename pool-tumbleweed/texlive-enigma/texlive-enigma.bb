SUMMARY = "Encrypt documents with a three rotor Enigma"
DESCRIPTION = "The package provides historical encryption (Enigma cipher) for \
LuaTeX-based formats."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.1svn29802"

RPM_NAME = "texlive-enigma-2026.226.0.0.1svn29802-61.4.noarch.rpm"
RPM_HASH = "fd160ea9240e948a6d61a42b2c726d3c59aca557538f7111a8b1ffe216d882cfdd515c1f0ebdf288b7a2147cab71151360c8237eb003a53caaf0c686bc9eb080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enigma.sty \
tex-enigma.tex \
texlive-enigma"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
