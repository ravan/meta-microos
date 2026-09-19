SUMMARY = "Babel contributed support for Basque"
DESCRIPTION = "The package establishes Basque conventions in a document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0fsvn77682"

RPM_NAME = "texlive-babel-basque-2026.226.1.0fsvn77682-60.2.noarch.rpm"
RPM_HASH = "ff3dd1abb600dda3fe48d4e64e25dbd5ef0425e03bb3f88e2d51791f276a9f6f0467110cbcf065db3cf19f48e8efc4cd609cc7384c560dff53cc731d3f73604a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque.ldf \
texlive-babel-basque"

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
