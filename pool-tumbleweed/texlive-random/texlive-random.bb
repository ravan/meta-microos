SUMMARY = "Generating 'random' numbers in TeX"
DESCRIPTION = "Generates pseudo-random integers in the range 1 to 2^{31}. \
Macros are to provide random integers in a given range, or \
random dimensions which can be used to provide random `real' \
numbers, are also available."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2svn54723"

RPM_NAME = "texlive-random-2026.226.0.0.2svn54723-60.4.noarch.rpm"
RPM_HASH = "4da7d32301903f92aba1d106212724f493fbc22a7b9cfd1dfdc026db727456cb5ee46e98905697a5d1fc19f4ac5c0f8ec07b666b564adbc2f373a50b48df64b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-random.tex \
texlive-random"

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
