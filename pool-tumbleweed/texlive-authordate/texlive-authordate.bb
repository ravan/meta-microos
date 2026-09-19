SUMMARY = "Author/date style citation styles"
DESCRIPTION = "Authordate produces styles loosely based on the recommendations \
of British Standard 1629(1976), Butcher's Copy-editing and the \
Chicago Manual of Style. The bundle provides four BibTeX styles \
(authordate1, ..., authordate4), and a LaTeX package, for \
citation in author/date style. The BibTeX styles differ in how \
they format names and titles; one of them is necessary for the \
LaTeX package to work."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-authordate-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "1c0503ead14613bb809e01061db0f99613f4cc5dcd10772664fe0cbb313c5bbdac1baea7ee24234e60a52cb276f456a35e9cfd661c3b1faed0a29b08d6c2928d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authordate1-4.sty \
texlive-authordate"

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
