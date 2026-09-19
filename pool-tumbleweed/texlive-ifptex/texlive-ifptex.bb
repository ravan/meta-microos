SUMMARY = "Check if the engine is pTeX or one of its derivatives"
DESCRIPTION = "The ifptex package is a counterpart of ifxetex, ifluatex, etc. \
for the ptex engine. The ifuptex package is an alias to ifptex \
provided for backward compatibility."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2csvn77682"

RPM_NAME = "texlive-ifptex-2026.226.2.2csvn77682-60.2.noarch.rpm"
RPM_HASH = "1a4d6d4d260fc3ea2830f340bad1bfa4c35cf7668d7b5fea03d716f709ccd84f7d4f185fcad46ca8ea826be5365df9d0a700e9d617d78d64b5da86c7cf12e73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifptex.sty \
tex-ifuptex.sty \
texlive-ifptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
