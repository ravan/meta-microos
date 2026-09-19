SUMMARY = "Attach arbitrary files to a PDF document"
DESCRIPTION = "Starting with PDF 1.3 (Adobe Acrobat 4.0), PDF files can \
contain file attachments -- arbitrary files that a reader can \
extract, just like attachments to an e-mail message. The \
attachfile package brings this functionality to pdfLaTeX and \
provides some additional features not available in Acrobat, \
such as the ability to use arbitrary LaTeX code for the file \
icon -- including things like \\includegraphics, tabular, and \
mathematics. Settings can be made either globally or on a \
per-attachment basis. Attachfile makes it easy to attach files \
and customize their appearance in the enclosing document. The \
package supports the Created, Modified, and Size keys in the \
EmbeddedFile's Params dictionary."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-attachfile-2026.226.1.9svn77682-60.2.noarch.rpm"
RPM_HASH = "1dd65775900ce0ff4f1cf7f8441015cfbc30bb14be414c6b5a87c61640b71c5bc9612f10c4f2a3335cfd6e48219580ee91b6b2c48880c604bc72509734e0d213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-attachfile.sty \
texlive-attachfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
