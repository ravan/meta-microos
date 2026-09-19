SUMMARY = "Express lengths in arbitrary units"
DESCRIPTION = "The package provides a command to convert a length to any of a \
large selection of units. The package relies on the LaTeX3 \
programming environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn76924"

RPM_NAME = "texlive-lengthconvert-2026.226.1.0asvn76924-61.2.noarch.rpm"
RPM_HASH = "e6dd2a1333eca84680249c52ea55f5841e5f03cdc796c5926bdf4d62ec1ab7c602902067847a4ed84450d830865085676bf13497621d1c20cf51ac6fa94c3965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lengthconvert.sty \
texlive-lengthconvert"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
