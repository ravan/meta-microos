SUMMARY = "An extension of package changebar that can be used with XeLaTeX"
DESCRIPTION = "The package extends package changebar so it can be used with \
XeLaTeX. It introduces the new option xetex for use with \
XeLaTeX. Everything else remains the same and users should \
consult the original documentation for usage information."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-xechangebar-2026.226.1.0svn77682-59.4.noarch.rpm"
RPM_HASH = "d59f612f4c1ce78cdc094230e69334d10571739694db91a9d6b78a82b1354a4bcf4c29586298d763983415eb59691d50276234cb1b947923a488c097c5ca380d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xechangebar.sty \
texlive-xechangebar"

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
