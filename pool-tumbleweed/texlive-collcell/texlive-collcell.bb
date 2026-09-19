SUMMARY = "Collect contents of a tabular cell as argument to a macro"
DESCRIPTION = "The package provides macros that collect the content of a \
tabular cell, and offer them as an argument to a macro. Special \
care is taken to remove all aligning macros inserted by tabular \
from the cell content. The macros also work in the last column \
of a table, but do not support verbatim material inside the \
cells."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77682"

RPM_NAME = "texlive-collcell-2026.226.0.0.6svn77682-60.2.noarch.rpm"
RPM_HASH = "e1a306b443114bb74d7db01b2f8a764f04490e92af377c2e3f73d233b499a458f034273a10729164ac45877505634394aaffb9dd73ab4758d904511c6f8029a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collcell.sty \
texlive-collcell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
