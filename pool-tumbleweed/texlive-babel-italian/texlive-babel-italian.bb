SUMMARY = "Babel support for Italian text"
DESCRIPTION = "The package provides language definitions for use in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.02svn77371"

RPM_NAME = "texlive-babel-italian-2026.226.1.5.02svn77371-60.2.noarch.rpm"
RPM_HASH = "5d2b0b95aeef2270de39e4ea0d739323a755ae1daa32ac1c4c2366ea44b9498ceffed5e62682b44ba978b4992139b945693de926bdf7ac647c6b2c82184f558e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-italian.ldf \
texlive-babel-italian"

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
