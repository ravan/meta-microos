SUMMARY = "Adobe Type 1 format of Carolingian Minuscule fonts"
DESCRIPTION = "The bundle offers Adobe Type 1 format versions of Peter \
Wilson's Carolingian Minuscule font set (part of the bookhands \
collection). The fonts in the bundle are ready-to-use \
replacements for the Metafont originals."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-carolmin-ps-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7b6594d3c025279a3b08c758f794fbfe9881ef9fefeeb6862b9fd97468e830fc28191e439bb6be68f75a7670bee668a77866c7f2817bb619fea613ba856bdb43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmin.map \
texlive-carolmin-ps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-carolmin-ps-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
