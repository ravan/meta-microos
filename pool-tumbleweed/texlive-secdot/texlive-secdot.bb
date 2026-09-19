SUMMARY = "Section numbers with trailing dots"
DESCRIPTION = "Makes the numbers of \\section commands come out with a trailing \
dot. Includes a command whereby the same can be made to happen \
with other sectioning commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-secdot-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "94daee646e5215dc4a20f7ba31e31723251034e1b18759395a97f2a99e09695aea2a5c32b14525b1b0517be12f79fad32f299b40cd5b49d0ba73df9958787571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-secdot.sty \
texlive-secdot"

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
