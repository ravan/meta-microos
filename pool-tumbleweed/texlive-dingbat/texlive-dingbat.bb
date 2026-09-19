SUMMARY = "Two dingbat symbol fonts"
DESCRIPTION = "The fonts (ark10 and dingbat) are specified in Metafont; \
support macros are provided for use in LaTeX. An Adobe Type 1 \
version of the fonts is available in the niceframe fonts \
bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-dingbat-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "65d59f28590e5feede3630c032e6c4aed2de8a3038d5bd318065f65fb1331537dc0d0d9b37221918abb1bd24159e1293c1c0db4465a1b1c361b8f3ba5d5bf540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ark10.tfm \
tex-dingbat.sty \
tex-dingbat.tfm \
tex-uark.fd \
tex-udingbat.fd \
texlive-dingbat"

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
