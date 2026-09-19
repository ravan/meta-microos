SUMMARY = "Use italic and upright greek letters with mathtime"
DESCRIPTION = "This package is an add-on to the MathTime a style to provide \
TeX support for the use of the MathTime(tm) fonts (formerly \
distributed by YandY, Inc.). The MathTime package has uppercase \
Greek letters hardwired to be upright and only upright; this \
package provides a switch to choose between the two kinds of \
Greek uppercase letters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-2026.226.1.1+svn17967-61.2.noarch.rpm"
RPM_HASH = "09350146cbbd50e3360b898ab68f97ccba1c97770a98f00b87cc23b3c4102d2508193f0374b32eb4509920d235d13dacc3499560d1a2078d5ee25963d519b6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mtgreek.sty \
texlive-mtgreek"

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
