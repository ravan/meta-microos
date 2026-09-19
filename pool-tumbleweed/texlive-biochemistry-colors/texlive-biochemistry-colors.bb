SUMMARY = "Colors used to display amino acids, nucleotides, sugars or atoms in biochemistry"
DESCRIPTION = "Biochemistry-colors.sty defines the standard colors of \
biochemistry for use with the color package and the xcolor \
package. xcolor is loaded by Biochemistry-colors.sty. Colors \
include: Shapely-colors for amino acids and nucleotides. \
CPK-Colors (Corey, Pauling and Koltun) of elements. Jmol-colors \
of elements, important isotopes and structures. Glycopedia \
colors for sugars."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-2026.226.1.00svn54512-61.2.noarch.rpm"
RPM_HASH = "4786522d839b6570ff02b6777d2a137dcebe7f60a9069b4f51650ffefce452df24b1c05c16ef1dc5b89a6277395a2eaad1058f639eb2dfabd8acc22adfc3f71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Biochemistry-colors.sty \
texlive-biochemistry-colors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
