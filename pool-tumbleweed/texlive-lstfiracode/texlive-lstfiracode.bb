SUMMARY = "Use Fira Code font for listings"
DESCRIPTION = "The lstfiracode package defines FiraCodeStyle for the use with \
the listings package. This style contains almost all ligatures \
in Nikita Prokopov's Fira Code family of fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-2026.226.0.0.1csvn49503-59.2.noarch.rpm"
RPM_HASH = "bfa206bafe536886b50aed0a0cd42171f2864c69d392b55b79a4a88f46351a909ad3498063dc2dc66ea266e9d104e1d42e6b6a884d5bb851e1cdd02f0fd6e861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstfiracode.sty \
texlive-lstfiracode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-listings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
