SUMMARY = "Insert pictures/boxes into paragraphs"
DESCRIPTION = "The package provides convenient bundling of the \\parshape \
primitive. LaTeX users should note that this is a generic \
package, and should be loaded using \\input ."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn34299"

RPM_NAME = "texlive-insbox-2026.226.2.2svn34299-60.2.noarch.rpm"
RPM_HASH = "c3e51e5af574691b54491f72159bc23afaa7ec16e263947cd2e6e3af289b12ef4ed686470a5de038121021de5a8b66351bd3129c7d1dfb73f538d72eaced303e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-insbox.tex \
texlive-insbox"

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
