SUMMARY = "Commands for dimensionless numbers"
DESCRIPTION = "This package simplifies the calling of Dimensionless Numbers in \
math or text mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-2026.226.1.0.1svn58774-59.2.noarch.rpm"
RPM_HASH = "4f178dc9c507cadec01021631dbe3a964f760fa2bcc98e9ab27e8f9a05ad7b5641b310b5bdbfb7ce2d84b2e2b3fef0e1a30d0a6a2726556550e1eea2095d99d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dimnum.sty \
texlive-dimnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
