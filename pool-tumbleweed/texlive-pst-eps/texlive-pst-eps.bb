SUMMARY = "Create EPS files from PSTricks figures"
DESCRIPTION = "Pst-eps is a PSTricks-based package for exporting PSTricks \
images 'on the fly' to encapsulated PostScript (EPS) image \
files, which can then be read into a document in the usual way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-pst-eps-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "d69be5137c16fd4e6df7007535f944a065217f3da496dc18f4bf07a162c66b30d330170a629577b9317beb53ce4266977fe9068c24ffe7eddbf350001794df22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eps.sty \
tex-pst-eps.tex \
texlive-pst-eps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
