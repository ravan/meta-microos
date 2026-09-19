SUMMARY = "Restoring tokens after closing multiple groups"
DESCRIPTION = "This package aims to solve the problem of how certain tokens \
can be preserved beyond a variable number of nested groups."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77946"

RPM_NAME = "texlive-tokgroupmark-2026.226.1.0svn77946-59.2.noarch.rpm"
RPM_HASH = "2adc34ee8f7b4ab063dbbfa8414ed7495110cf44f52e34c0b9f1f37fbe0ba6470815454495caadb3fd75024d208ea0f38926a44c230c1832d0064cf5f7564960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokgroupmark.sty \
texlive-tokgroupmark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
