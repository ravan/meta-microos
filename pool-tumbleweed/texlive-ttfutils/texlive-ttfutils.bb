SUMMARY = "Convert TrueType to TFM and PK fonts"
DESCRIPTION = "Utilities: ttf2afm ttf2pk ttf2tfm ttfdump. FreeType is the \
underlying library."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-ttfutils-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "ef2435ad8b228cd6ae10f8e0ff7d9a026586ad2cb37178d2eb1641686234b533834d54189a82c66ed54d38140ef18810157a45872afa6c74e965af9e7f895ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-T1-WGL4.enc \
tex-ttf2pk.cfg \
texlive-ttfutils"

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
texlive-scripts-bin \
texlive-ttfutils-bin"

inherit rpm
