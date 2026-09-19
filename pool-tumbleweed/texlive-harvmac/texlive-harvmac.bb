SUMMARY = "Macros for scientific articles"
DESCRIPTION = "Known as 'Harvard macros', since written at that University."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-harvmac-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "9e8f92425c39cc02c6f34439c94ae4724035ddf14665625798eb103eae97425dbcb5a4a0ed54cf47bdf7ecc1cf63fd33fa391d8b9f64bb95fa651c1f6ad8653c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvmac.tex \
texlive-harvmac"

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
