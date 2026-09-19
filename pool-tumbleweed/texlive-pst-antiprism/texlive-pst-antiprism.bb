SUMMARY = "A PSTricks related package which draws an antiprism"
DESCRIPTION = "pst-antiprism is a PSTricks related package which draws an \
antiprism, which is a semiregular polyhedron constructed with \
2-gons and triangles."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn46643"

RPM_NAME = "texlive-pst-antiprism-2026.226.0.0.02svn46643-59.2.noarch.rpm"
RPM_HASH = "1e515878e929099367a87f33f177a9d1f726765cc0f22cb028a76fbd78f1cd9b5a350be542c94b93a9124db9b4e7a3e84394c574639ce0d9def0a5ab188da363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-antiprism.sty \
tex-pst-antiprism.tex \
texlive-pst-antiprism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-solides3d.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
