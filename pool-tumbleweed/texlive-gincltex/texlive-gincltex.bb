SUMMARY = "Include TeX files as graphics (.tex support for \\includegraphics)"
DESCRIPTION = "The package builds on the standard LaTeX packages graphics \
and/or graphicx and allows external LaTeX source files to be \
included, in the same way as graphic files, by \
\\includegraphics. In effect, then package adds support for the \
.tex extension. Some of the lower level operations like \
clipping and trimming are implemented using the adjustbox \
package which includes native pdfLaTeX support and uses the pgf \
package for other output formats."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-gincltex-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "99cfde143361a3c315b3a53858cb326a21f5996fc5ab13171921552a92fc1e515ed9622b4c309fcf3073025b3b2d05d26e928d887466f27c46c8db93fed28584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gincltex.sty \
texlive-gincltex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
