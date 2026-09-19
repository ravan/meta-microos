SUMMARY = "Device independent picture environment enhancement"
DESCRIPTION = "Ebezier is a device independent extension for the standard \
picture environment. Linear, quadratic, and cubic bezier curves \
are supplied in connection with higher level circle drawing \
commands. Additionally some macros for the calculation of curve \
lengths are part of this package."
LICENSE = "LPPL-1.0"

PV = "2026.226.4svn76924"

RPM_NAME = "texlive-ebezier-2026.226.4svn76924-61.4.noarch.rpm"
RPM_HASH = "fc73454a8663c221fc767ea9dd04a59a71ec0d40e9bfbb794467ad434e45075bf7ccef7ca99ee2b0d9ab03aff99ddf1490d90e92892c0513f5b7dd042d63889c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebezier.sty \
texlive-ebezier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
