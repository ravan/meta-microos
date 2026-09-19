SUMMARY = "Transactions of the ASAE"
DESCRIPTION = "A class and BibTeX style for submissions to the Transactions of \
the American Society of Agricultural Engineers. Also included \
is the Metafont source of a slanted Computer Modern Caps and \
Small Caps font."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-asaetr-2026.226.1.0asvn15878-60.2.noarch.rpm"
RPM_HASH = "6c057e9080426d0b6c78a7c124bd68e1f759b1d884bcbe2074acb7aa638895170b8614b8cfda116067d5b0f0ccbbd5764f617b88d65c4d98f831435417683222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asaesub.sty \
tex-asaetr.cls \
tex-asaetr.sty \
texlive-asaetr"

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
