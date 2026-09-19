SUMMARY = "Sub-numbering for figures and tables"
DESCRIPTION = "This package enables sub-numbering of floats (figures and \
tables) similar to the subequations-environment of the amsmath \
package. The subfloat package is not to be confused with the \
subfig package which generates sub-figures within one normal \
figure, and manages their placement; subfloat only affects \
captions and numbering."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn77682"

RPM_NAME = "texlive-subfloat-2026.226.2.14svn77682-64.2.noarch.rpm"
RPM_HASH = "bc4eb37469f7fec7798c2d89b1bc19385f7a110cad6c3fd82110c188631109e58fef62fcfdfb9510c1e8e5e664f54c7a8985be1baa6e51e100ce8e9272a04407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfloat.sty \
texlive-subfloat"

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
