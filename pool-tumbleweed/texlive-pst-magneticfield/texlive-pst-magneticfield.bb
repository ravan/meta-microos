SUMMARY = "Plotting a magnetic field with PSTricks"
DESCRIPTION = "pst-magneticfield is a PSTricks related package to draw the \
magnetic field lines of Helmholtz coils in a two or three \
dimensional view. There are several parameters to create a \
different output. For more information or some examples read \
the documentation of the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.17asvn69493"

RPM_NAME = "texlive-pst-magneticfield-2026.226.1.17asvn69493-59.2.noarch.rpm"
RPM_HASH = "ca4d8a69f689061ef92846d1e21a0f9c4a36e294fed38b7c694b560ba1e4cc54a085e04a69ce571688e35f227534009604eeee818da06d1ec4e2606de3599228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-magneticfield.sty \
tex-pst-magneticfield.tex \
texlive-pst-magneticfield"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
