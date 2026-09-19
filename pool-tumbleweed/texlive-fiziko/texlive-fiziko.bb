SUMMARY = "A MetaPost library for physics textbook illustrations"
DESCRIPTION = "This MetaPost library was initially written to automate some \
elements of black and white illustrations for a physics \
textbook. It provides functions to draw things like lines of \
variable width, shaded spheres, and tubes of different kinds, \
which can be used to produce images of a variety of objects. \
The library also contains functions to draw some objects \
constructed from these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-2026.226.0.0.2.0svn61944-59.2.noarch.rpm"
RPM_HASH = "dacb9c5e0dbe9898f112a7e6ddc8fe15cf89deaae5196299192bb93f72fa4011beac02f4e416f333b3e4066923d86ff644477ac4ae74fda3eee8cd8d24d5fcf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko"

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
