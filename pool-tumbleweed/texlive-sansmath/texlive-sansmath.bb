SUMMARY = "Maths in a sans font"
DESCRIPTION = "The package defines a new math version sans, and a command \
\\sansmath that behaves somewhat like \\boldmath"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-sansmath-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "506a356381baa9adc1841c492e9c56661453eb1d497419d07c65fb35695df782b557571a017b2e0926b11094873d9b0a2616cf0f0a2d3b39b2b9c4073cbf2bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sansmath.sty \
texlive-sansmath"

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
