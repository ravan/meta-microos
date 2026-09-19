SUMMARY = "Babel support for Occitan"
DESCRIPTION = "Occitan language description file with usage instructions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-2026.226.0.0.2svn39608-60.2.noarch.rpm"
RPM_HASH = "c60a71bcd8f4a81ce919bddde66b15edc6f5386d461a6d8eb75ad62d8ae391dc97eca5916027f08767443812b1a54175d6f198404730d626ff95dfdfea6e12bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-occitan.ldf \
texlive-babel-occitan"

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
