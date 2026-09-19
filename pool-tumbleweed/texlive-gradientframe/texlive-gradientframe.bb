SUMMARY = "Simple gradient frames around objects"
DESCRIPTION = "The package provides a means of drawing graded frames around \
objects. The gradients of the frames are drawn using the color \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-2026.226.0.0.2svn21387-60.4.noarch.rpm"
RPM_HASH = "bb9b36e7f80c59641570973aedf4c6a336653035928865bf7fd38b938e7704d19fc741555a52318321c606b647e9bb73e2150f4917a154a077c3f7dac0baf82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradientframe.sty \
texlive-gradientframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
