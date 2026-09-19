SUMMARY = "BibTeX style for PNAS (newer version)"
DESCRIPTION = "This style produces bibliographies in the format of \
'Proceedings of the National Academy of Sciences, USA'. The \
style was derived from the standard unsrt.bst and adapted to \
the new (2009) formatting rules."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-pnas2009-2026.226.1.0svn76790-59.2.noarch.rpm"
RPM_HASH = "ee1ae609f6dbac03613205d43aa7c12d4b20e263a7cc68c222e4523afa802de795fb30a07e44e6f589d920e692ad7fc3e0eb112ab2f9f3f39ac2bad807d8d722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pnas2009"

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
