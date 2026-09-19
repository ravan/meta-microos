SUMMARY = "Generate problem sheets and their solution sheets"
DESCRIPTION = "The package is designed for lecturers who have to generate new \
problem sheets for their students on a regular basis (e.g. \
yearly) by randomly selecting a specified number of problems \
defined in another file. The package allows you easily to \
generate a new problem sheet that is different from the \
previous year, thus alleviating the temptation of students to \
seek out the previous year's students and checking out their \
answers. The solutions to the problems can be defined along \
with the problem, making it easy to generate the solution sheet \
from the same source code; problems may be reused within a \
document, so that solutions may appear in a different section \
of the same document as the problems they cover."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.05svn44783"

RPM_NAME = "texlive-probsoln-2026.226.3.05svn44783-59.2.noarch.rpm"
RPM_HASH = "32d2a085a1ab2e4970e16b03dac6abde04297efd713af23586c00c1cb7c57762bc37739d284b6a9256ab37b2963a3f985b484bc6f032c91200c128563a33ed2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-probsoln.sty \
texlive-probsoln"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
