SUMMARY = "Translate input files on the fly"
DESCRIPTION = "The package preprocesses input files to a Lua(La)TeX run, on \
the fly. The user defines Lua regular expressions to search for \
patterns and modify input lines (or entire paragraphs) \
accordingly, before TeX reads the material. In this way, \
documents may be prepared in a non-TeX language (e.g., some \
lightweight markup language) and turned into 'proper' TeX for \
processing. The source of the documentation is typed in such a \
lightweight language and is thus easily readable in a text \
editor (the PDF file is also available, of course); the \
transformation to TeX syntax via Interpreter's functions is \
explained in the documentation itself. Interpreter is \
implemented using the author's gates (lua version), and works \
for plain TeX and LaTeX, but not ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn27232"

RPM_NAME = "texlive-interpreter-2026.226.1.2svn27232-60.2.noarch.rpm"
RPM_HASH = "a85b7c9c3e0b8371e6b780a94cc8c86a87ee9b96f3b98a6d8e3a5a4196e7c281f126df73cbbd4c3c8a5ed8b6afb27a893b3d24ce6e2e34695df440d6982515d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interpreter.sty \
tex-interpreter.tex \
texlive-interpreter"

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
