SUMMARY = "Probability trees with MetaPost"
DESCRIPTION = "This package provides MetaPost tools for drawing simple \
probability trees and graphs (in discrete geometry)."
LICENSE = "LPPL-1.0"

PV = "2026.226.24.04svn70887"

RPM_NAME = "texlive-mptrees-2026.226.24.04svn70887-61.2.noarch.rpm"
RPM_HASH = "029c616f22647cb1cbf4ca39037f831d5c34f61e11e8fe04b40b44e6a81582a03d1744de9bfa6cef7caecc38e0d39e12069dbc845d933aa002831d6e15c7f22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees"

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
