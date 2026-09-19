SUMMARY = "General drawing macros"
DESCRIPTION = "A low level (DraTex.sty) and a high-level (AlDraTex.sty) \
drawing package written entirely in TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-dratex-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "893ac159a49901d6017104b214e5154ed407a8671efa158d6ca0d6c9d18a1774703a44663ac3ddccf4084a4860ea2e039000fc292af5adcb67d06c821bd0c706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlDraTex.sty \
tex-DraTex.sty \
tex-TeXProject.sty \
tex-wotree.sty \
texlive-dratex"

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
