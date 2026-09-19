SUMMARY = "Automatic numbering of constants"
DESCRIPTION = "The package provides a way to number constants in a \
mathematical proof automatically, with a system for \
labelling/referencing. In addition, several families of \
constants (with different symbols) may be defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-constants-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "175d94077c97638e0056224fa2973710fcc427ba38180fe7364b47d49f62e550d92d661e34e1fcf193a11230c279761b8adc2a90482ef30e628b77021df1fc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-constants.sty \
texlive-constants"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
