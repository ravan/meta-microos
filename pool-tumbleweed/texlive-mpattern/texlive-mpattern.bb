SUMMARY = "Patterns in MetaPost"
DESCRIPTION = "A package for defining and using patterns in MetaPost, using \
the Pattern Color Space available in PostScript Level 2."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-mpattern-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "994dba3f9d76b2112f6f69798e4d5844d3ee128d748ad909c136ce53ecb892b64923973829a61785b06da3c2cc6f9f235a9d69a3249a50700f922c2f1bdeb40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpattern"

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
