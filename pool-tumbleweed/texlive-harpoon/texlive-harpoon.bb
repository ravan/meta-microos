SUMMARY = "Extra harpoons, using the graphics package"
DESCRIPTION = "Provides over- and under-harpoon symbol commands; the harpoons \
may point in either direction, with the hook pointing up or \
down. The covered object is provided as an argument to the \
commands, so that they have the look of accent commands."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn21327"

RPM_NAME = "texlive-harpoon-2026.226.1.0svn21327-60.4.noarch.rpm"
RPM_HASH = "dc3425355ef2b46ff759143b01cd4107485e51d97b64fbfdd5185cb3c168bbd64bb26961cb1e604a79fec4b88a72cb499e6b8e27ed3e65982925d68a99846514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harpoon.sty \
texlive-harpoon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
