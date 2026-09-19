SUMMARY = "Bibliography style for Cell"
DESCRIPTION = "This is an 'apa-like' style (cf. apalike.bst in the BibTeX \
distribution), developed from the same author's JMB style. A \
supporting LaTeX package is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-cell-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "b8425e0b0732dcd7bd1a92db94b6eb4e370d6225f4efcc7fac1b6219605dea28e58d00740019cfe2c7ea0602c183d6c61a1c2bdc243589cc9be139d50376087b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cell.sty \
texlive-cell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
