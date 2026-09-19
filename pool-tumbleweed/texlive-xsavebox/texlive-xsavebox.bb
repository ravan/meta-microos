SUMMARY = "Saveboxes for repeating content without code replication, based on PDF Form XObjects"
DESCRIPTION = "The package defines commands for saving content that can be \
repeatedly placed into the document without replicating DVI/PDF \
code in the output file, allowing for smaller file size of the \
final PDF and improved content caching for faster display in \
certain PDF viewers. The method makes use of 'Form XObjects' \
defined in the PDF specification. The user commands are \
modelled after the standard LaTeX commands \\savebox, \\sbox, \
\\usebox and the lrbox environment. All common TeX engines and \
back-ends are supported: pdfLaTeX, LuaLaTeX LaTeX - dvips - \
ps2pdf/Distiller (Xe)LaTeX - (x)dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.18svn77682"

RPM_NAME = "texlive-xsavebox-2026.226.0.0.18svn77682-59.4.noarch.rpm"
RPM_HASH = "f19ff1abb765633e82db8b7f54a8e00a24bc65d3d55993ae1a06efe9dea902331da2c83cdca82ad79bceab875b9f81fce98e9b5c034ef3e9c60e812c70198a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xsavebox.sty \
texlive-xsavebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
