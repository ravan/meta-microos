SUMMARY = "Override existing labels"
DESCRIPTION = "The package allows the user to override existing labels (for \
example, those generated automatically)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0osvn77682"

RPM_NAME = "texlive-undolabl-2026.226.1.0osvn77682-60.2.noarch.rpm"
RPM_HASH = "41c0524c71cb45d1a0ba532a4f9687f5b508de1940bfe0e8663483bb136de369c15534e189f59e3db339633f82bb4c9a2360cb19f42f596cf25dde43c91e5f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-undolabl.sty \
texlive-undolabl"

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
