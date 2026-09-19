SUMMARY = "Convenience package for float placement"
DESCRIPTION = "The hep-float package redefines some LaTeX float placement \
defaults and defines convenience wrappers for floats. The \
package is loaded with \\usepackage{hep-float}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-float-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "bbc95862800bcab5ae6260d41ce7aa86073f8f12e7fc812cae8bab18f2f89a13b7612048951b5dd05cc02462fec2e72a2830159cae7f7e394b78eebe94b4a2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-float.sty \
texlive-hep-float"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-multirow.sty \
tex-subcaption.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
