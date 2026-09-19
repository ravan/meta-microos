SUMMARY = "Nice and easy derivatives"
DESCRIPTION = "Typesetting derivatives and differentials in a consistent way \
are clumsy and require care to ensure the preferred formatting. \
Several packages have been developed for this purpose, each \
with its own features and drawbacks, with the most ambitious \
one being diffcoeff. While this package is comparable to \
diffcoeff in terms of features, it takes a different approach. \
One difference is this package provides more options to tweak \
the format of the derivatives and differentials. However, the \
automatic calculation of the total order isn't as developed as \
the one in diffcoeff. This package makes it easy to write \
derivatives and differentials consistently with its predefined \
commands. It also provides a set of commands that can define \
custom derivatives and differential operators. The options \
follow a consistent naming scheme making them easy to use and \
understand."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-derivative-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "307a4b09247b1e585e73f71ba110d13dcef2185b0641004fa4ffe3fcdc1f910b223df0042cc4dd10fcf544e0fbfc87d8fb5d2f07325a2a81c5029435a6bf9fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-derivative.sty \
texlive-derivative"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
