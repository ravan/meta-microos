SUMMARY = "Relative alignment of rows in numeric columns in tabulars"
DESCRIPTION = "Defines a tabular column type for formatting numerical columns \
in LaTeX. The column type enables numerical items to be right \
justified relative to each other, while centred beneath the \
column label. In addition, macros are provided to enable \
variations on this column type to be defined. Usage of the \
package is superficially similar to that of dcolumn; however, \
the alignment scheme is different, and the packages have \
different, though overlapping, applications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-warpcol-2026.226.1.0csvn77682-60.2.noarch.rpm"
RPM_HASH = "831b34d3f901ee88b92701ac6a948dd098967bd373ceb2d4714ce51b12f5c8df60054d0305d68a2f0a95446cc6d2d7ee211c2dab4f8312e8c6da0c3f2f4a16c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-warpcol.sty \
texlive-warpcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
