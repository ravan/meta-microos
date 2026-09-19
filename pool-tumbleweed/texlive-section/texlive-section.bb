SUMMARY = "Modifying section commands in LaTeX"
DESCRIPTION = "The package implements a pretty extensive scheme to make more \
manageable the business of configuring LaTeX output."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20180"

RPM_NAME = "texlive-section-2026.226.svn20180-60.2.noarch.rpm"
RPM_HASH = "5f00947d1db62222f5496c65a3fe42dd361ab5de0d7d9ffbde681caa2c57105d504933cdacea1256eae1bd0346494d898c723a2811e652330989c05a2304214f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-section.sty \
texlive-section"

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
