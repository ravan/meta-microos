SUMMARY = "Better medium-size math commands"
DESCRIPTION = "This package started as a fork of the mediummath code of the \
nccmath package, aiming to provide more stable and flexible \
medium-size math commands. This concerns sizes of operators and \
infinite loops caused by definite integrals."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025asvn74208"

RPM_NAME = "texlive-medmath-2026.226.2025asvn74208-59.2.noarch.rpm"
RPM_HASH = "45623269324f3665a17d38a16a0e7bf279dc2968f8b9a334f2c7aa57eb666196be5313fa0f402aa7259ec422a7f3c818ed988f1f55c0d087884fc1abf459caa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-medmath.sty \
texlive-medmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
