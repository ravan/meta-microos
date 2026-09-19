SUMMARY = "Upright Greek letters in chemistry"
DESCRIPTION = "The package provides upright Greek letters in support of other \
chemistry packages (such as chemmacros). The package used to be \
distributed as a part of chemmacros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-chemgreek-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "248696706aaac6f11a0026ff5ae9932364afc8a5b5707ca4f40f31ec914832a51beb8a1d09111fde10ffb048b92f1225f58cac0a1582bf7857bd3de9aeedbcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemgreek.sty \
texlive-chemgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
