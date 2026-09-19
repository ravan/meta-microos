SUMMARY = "Macros for making newsletters with Plain TeX"
DESCRIPTION = "The newsletr package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-newsletr-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "ae7a0e42a0a6f73a9d477f5d6c3cfac87f23e3548c3f41accf7e567a9d20614176becf3a65231f042a2adcf0e01a6c2a748a708d31011d9c9f9087f6c3cde7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newsletr.tex \
texlive-newsletr"

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
