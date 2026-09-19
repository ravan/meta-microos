SUMMARY = "XeTeX input map for Unicode Devanagari"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Devanagari (encoded according to the Harvard/Kyoto \
convention) to Unicode (range 0900-097F)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-2026.226.0.0.5svn34296-59.4.noarch.rpm"
RPM_HASH = "c0a8e47a79ab0f6469c745de1336d2c1980e07b2e993240b72c51b95eefab7e0ea738feec09d4fe20b6b65df7a41a1190342d88fe3a96b219d153e8b0821acf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-devanagarinumerals.map \
tex-harvardkyoto.map \
tex-iast.map \
tex-velthuis-sanskrit.map \
tex-velthuis.map \
texlive-xetex-devanagari"

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
