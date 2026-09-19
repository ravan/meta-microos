SUMMARY = "Experimental memoir support"
DESCRIPTION = "A package of code proposed as supporting material for memoir. \
The package is intended as a test bed for such code, which may \
in the fullness of time be adopted into the main memoir \
release."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "8e0eb3dd482f8ab057c8af6ee6909f34ddf231a2f8e20309a0597a4c1f334b8b3b1d65605f2dd1b7cfb14c6d4c902648bb7ee39badb84e9c5f77f0cd933fe8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memexsupp.sty \
texlive-memexsupp"

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
