SUMMARY = "Automatic line breaking of displayed equations"
DESCRIPTION = "The package provides solutions to a number of common \
difficulties in writing displayed equations and getting \
high-quality output. For example, it is a well-known \
inconvenience that if an equation must be broken into more than \
one line, 'left...right' constructs cannot span lines. The \
breqn package makes them work as one would expect whether or \
not there is an intervening line break. The single most \
ambitious goal of the package, however, is to support automatic \
linebreaking of displayed equations. Such linebreaking cannot \
be done without substantial changes under the hood in the way \
formulae are processed; the code must be watched carefully, \
keeping an eye on possible glitches. The bundle also contains \
the flexisym and mathstyle packages, which are both designated \
as support for breqn."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98lsvn77682"

RPM_NAME = "texlive-breqn-2026.226.0.0.98lsvn77682-59.2.noarch.rpm"
RPM_HASH = "5d2fc16c81bd37d3ff9cdce7a5162f9deb183fd1668a6742df193f78447f83886852eac2f1b3b3929b889eaa6e6ce2b92b53dd57c0b0cb5343004954ce6e7912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breqn.sty \
tex-flexisym.sty \
tex-mathstyle.sty \
texlive-breqn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
