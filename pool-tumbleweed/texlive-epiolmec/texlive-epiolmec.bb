SUMMARY = "Typesetting the Epi-Olmec Language"
DESCRIPTION = "The package contains all the necessary files to typeset \
Epi-Olmec 'documents', in a script used in Southern Middle \
America until about 500 AD."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-epiolmec-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "6e4800c40f0e4cc7630757431df41c50bf206a9a9b2104c90336fdeca5fbcb2637c1cc561eabf1d71ed4bb144bc1a133fea0e926e6f2884f13734113a178d4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-EpiOlmec.tfm \
tex-epiolmec.map \
tex-epiolmec.sty \
texlive-epiolmec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-epiolmec-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
