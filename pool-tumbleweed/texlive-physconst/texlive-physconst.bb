SUMMARY = "Macros for commonly used physical constants"
DESCRIPTION = "This package consists of several macros that are shorthand for \
a variety of physical constants, e.g. the speed of light. The \
package developed out of physics and astronomy classes that the \
author has taught and wanted to ensure that he had correct \
values for each constant and did not wish to retype them every \
time he uses them. The constants can be used in two forms, the \
most accurate available values, or versions that are rounded to \
3 significant digits for use in typical classroom settings, \
homework assignments, etc. Most constants are taken from CODATA \
2018, with the exception of the astronomical objects, whose \
values are taken from International Astronomical Union \
specified values. Constants that are derived from true \
constants, e.g. the fine structure constant, have been \
calculated using the accepted values of the fundamental \
constants."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn58727"

RPM_NAME = "texlive-physconst-2026.226.1.1.2svn58727-58.2.noarch.rpm"
RPM_HASH = "9f2ccfbe81cf7fc9f5f8d7f0936a224cd554eb19801c3a066e5d130f2f7eb2a71c5e1ab15f279581c440fff6af7525bafad8a4c444be7d7bc7861683b991cae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physconst.sty \
texlive-physconst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-physunits.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
