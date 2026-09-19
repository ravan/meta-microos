SUMMARY = "Create Turabian-formatted material using LaTeX"
DESCRIPTION = "The bundle provides a class file and a template for creating \
Turabian-formatted projects. The class file supports citation \
formatting conforming to the Turabian 8th Edition style guide."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-2026.226.0.0.1.0svn36298-59.2.noarch.rpm"
RPM_HASH = "2d75407d2972c357f4a6ff629c61d8375305aec3f0e158a6511b3a8ea1081d28662dfcd9399371048c3d7ab7eddc82b1c4729dc8f7261a4c0e13db03b5f04114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turabian.cls \
texlive-turabian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-cjhebrew.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyphenat.sty \
tex-indentfirst.sty \
tex-lipsum.sty \
tex-report.cls \
tex-scrextend.sty \
tex-setspace.sty \
tex-times.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
