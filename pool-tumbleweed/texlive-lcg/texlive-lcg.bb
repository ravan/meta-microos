SUMMARY = "Generate random integers"
DESCRIPTION = "The lcg package generates random numbers (integers) via a \
linear congruential generator (Schrage's method). The random \
numbers are written to a counter. The keyval package is used \
for the user to provide values for the range and a seed, and \
for the name of the counter to be used."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-lcg-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "94f98feb70c673819f08a93c40c84e0f003e31d12d01084bd4140863b1c3766e191abdc97e8ba9000bffdd7aa1c1d68c66a942dd7da0172fdfed4ca04527c10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcg.sty \
texlive-lcg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
