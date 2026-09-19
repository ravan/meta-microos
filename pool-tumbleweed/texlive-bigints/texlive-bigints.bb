SUMMARY = "Writing big integrals"
DESCRIPTION = "The package provides facilities for drawing big integral signs \
when needed. An example would be when the integrand is a \
matrix."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bigints-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "98fde8ae17551316a7bd47dfbe77980b0fda2c7e269244f03b9f8d74f73fd41cdea19378ac691c05ea82122c059e75fb42eff9135873d277cb3689ce024b3a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigints.sty \
texlive-bigints"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
