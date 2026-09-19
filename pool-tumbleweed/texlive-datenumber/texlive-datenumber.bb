SUMMARY = "Convert a date into a number and vice versa"
DESCRIPTION = "This package provides commands to convert a date into a number \
and vice versa. Additionally there are commands for \
incrementing and decrementing a date. Leap years and the \
Gregorian calendar reform are considered."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn78101"

RPM_NAME = "texlive-datenumber-2026.226.0.0.03svn78101-61.2.noarch.rpm"
RPM_HASH = "797db51a11204100d8a13839508fff9e3f1c1199ba8dcb03121288ec521e4340808b0520b50ae1be74b4737699fed7d87798f8e9672068de03d3fb98ef14ac98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datenumber.sty \
tex-datenumberUSenglish.ldf \
tex-datenumberdummy.ldf \
tex-datenumberenglish.ldf \
tex-datenumberfrench.ldf \
tex-datenumbergerman.ldf \
tex-datenumberspanish.ldf \
texlive-datenumber"

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
