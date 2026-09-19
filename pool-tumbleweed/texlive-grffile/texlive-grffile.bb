SUMMARY = "Extended file name support for graphics (legacy package)"
DESCRIPTION = "The original package extended the file name processing of \
package graphics to support a larger range of file names. The \
base LaTeX code now supports multiple dots and spaces, and this \
package by default is a stub that just loads graphicx. However, \
\\usepackage{grffile}[=v1] may be used to access version 1(.18) \
of the package if that is needed."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78101"

RPM_NAME = "texlive-grffile-2026.226.2.1svn78101-60.4.noarch.rpm"
RPM_HASH = "4ce13774ef523d730c92d7901682c9684be01d4d2ed3256f201b326c25ce02befbf2214ae8da995f12cc586ca856d2b14522be66845ac451e4c34a0e79964f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grffile-2017-06-30.sty \
tex-grffile.sty \
texlive-grffile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
