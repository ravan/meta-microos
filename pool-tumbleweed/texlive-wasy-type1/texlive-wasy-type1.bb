SUMMARY = "Type 1 versions of wasy fonts"
DESCRIPTION = "Converted (Adobe Type 1) outlines of the wasy fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-2026.226.001.002svn53534-60.2.noarch.rpm"
RPM_HASH = "1a0e3f87411ca934107da71b513f37d4e02dcf08eb65ec66073a6c32b76920a8f7d0ea686fca23c1f97adc5ab083a649d79bf4b2b6f29bafc636516e8c154f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wasy.map \
texlive-wasy-type1"

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
texlive-scripts \
texlive-scripts-bin \
texlive-wasy \
texlive-wasy-type1-fonts"

inherit rpm
