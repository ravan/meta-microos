SUMMARY = "TeX support (from CJK) for the garuda font"
DESCRIPTION = "The garuda-c90 package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn60832"

RPM_NAME = "texlive-garuda-c90-2026.226.svn60832-60.2.noarch.rpm"
RPM_HASH = "2779f41486fa81e47961da0c66b21cc761e5721abaf71c97c37b58c93eb926a962701c0d6fe754f1bc5c490e2126b3fed4024515456f03a82f45d58c41ea2170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fgdb8z.tfm \
tex-fgdbo8z.tfm \
tex-fgdo8z.tfm \
tex-fgdr8z.tfm \
tex-garuda-c90.map \
texlive-garuda-c90"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
