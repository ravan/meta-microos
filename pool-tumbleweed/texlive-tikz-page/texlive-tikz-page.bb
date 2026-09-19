SUMMARY = "Small macro to help building nice and complex layout materials"
DESCRIPTION = "The package provides a small macro to help building nice and \
complex layout materials."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn42039"

RPM_NAME = "texlive-tikz-page-2026.226.1.0svn42039-59.2.noarch.rpm"
RPM_HASH = "a16ca47fdaccf6cea7a6f97c473b4f74e501504ee970e65a2ccc875dc6724e381eb4f842ab6a808f3762626f467ddb69005914883c2415540d19ab7f23df8730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-page.sty \
texlive-tikz-page"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-textpos.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
