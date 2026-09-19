SUMMARY = "LaTeX package extending Springer's llncs class"
DESCRIPTION = "The package extends Springer's llncs class for adding \
additional notes describing the status of the paper (submitted, \
accepted) as well as for creating author-archived versions that \
include the references to the official version hosted by \
Springer (as requested by the copyright transfer agreement for \
Springer's LNCS series)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn63136"

RPM_NAME = "texlive-llncsconf-2026.226.1.2.0svn63136-61.2.noarch.rpm"
RPM_HASH = "9e20bb959bd4a693b3aff70b8594343912aa4796b6ac37d7a2196cc26ea3a9705a3e98a63f15ab25af8b810a927fd4ebec1113c853f5e408b8bd35b6019d7ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-llncsconf.sty \
texlive-llncsconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-rcsinfo.sty \
tex-svninfo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
