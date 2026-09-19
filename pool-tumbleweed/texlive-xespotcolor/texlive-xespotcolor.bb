SUMMARY = "Spot colours support for XeLaTeX"
DESCRIPTION = "The package provides macros for using spot colours in LaTeX \
documents. The package is a reimplementation of the spotcolor \
package for use with XeLaTeX. As such, it has the same user \
interface and the same capabilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-xespotcolor-2026.226.2.1svn77682-59.4.noarch.rpm"
RPM_HASH = "171886cefc0b0159c704a0b3839952f93a522a657814fc273e74b03fe013d96624929e89bd9562651f97448a74328cf2022e369ec2a5c994241bcf3f8ada4249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xespotcolor.sty \
texlive-xespotcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-iftex.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
