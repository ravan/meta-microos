SUMMARY = "Import individual data from script files"
DESCRIPTION = "This LaTeX package uses pgfkeys to retrieve individual data \
points generated in some script. Analogous to how one might \
generate graphics in a script and import those graphics into a \
LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn61772"

RPM_NAME = "texlive-datax-2026.226.1.2.0svn61772-61.2.noarch.rpm"
RPM_HASH = "92991a70d02cf251e7340796d1ea7943fd9f75ef407532ff92ae962cf9831cb4a0393dd7bad8f220c326d0031cf01476ee0ca9aa308043adce4338f26150e688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datax.sty \
texlive-datax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
