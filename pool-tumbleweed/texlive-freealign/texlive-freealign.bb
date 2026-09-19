SUMMARY = "Align math formulas in different lines"
DESCRIPTION = "This package provides several commands for aligning math \
formulas in different lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024asvn69267"

RPM_NAME = "texlive-freealign-2026.226.2024asvn69267-60.2.noarch.rpm"
RPM_HASH = "adc23250a8f91bc5fe6a2628abe738ae88dd26c1a7af09cb0c7783e8221d2f44d2cdd9f208ffcdf54b41a42a6002ad2627cc86e584a0d6aa37982d85bdfd2151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-freealign.sty \
texlive-freealign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
