SUMMARY = "Metafont logo font"
DESCRIPTION = "These fonts were created in Metafont by Knuth, for his own \
publications. At some stage, the letters 'P' and 'S' were \
added, so that the MetaPost logo could also be expressed. The \
fonts were originally issued (of course) as Metafont source; \
they have since been autotraced and reissued in Adobe Type 1 \
format by Taco Hoekwater."
LICENSE = "SUSE-TeX"

PV = "2026.226.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-2026.226.1.002svn54512-61.2.noarch.rpm"
RPM_HASH = "8afcd3cc603006d00bd757d63d5c50e51d301231030f198a8fa5d07987b762ecaf9e2026016cd6f3f9bb43292d691ddebc3eea8bcef2e340429d443847eb1819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mflogo.map \
texlive-mflogo-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mflogo-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
