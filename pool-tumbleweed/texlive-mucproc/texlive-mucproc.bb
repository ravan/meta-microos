SUMMARY = "Conference proceedings for the German MuC-conference"
DESCRIPTION = "The mucproc.cls is a document class to support the formatting \
guidelines for submissions to the German Mensch und Computer \
conference. This work consists of the files mucproc.dtx and \
mucproc.ins and the derived files mucproc.cls, \
mucfontsize10pt.clo. A compilable demonstration file using the \
mucproc class can be found on \
https://github.com/Blubu/mucproc/. This example fulfills the \
formatting guidelines for MuC 2017."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn43445"

RPM_NAME = "texlive-mucproc-2026.226.1.02svn43445-61.2.noarch.rpm"
RPM_HASH = "b492601722a6d82d28c28130d592e9a203d6ef39558648b93058c2374ae9f7a7ef7bad965c322e48dc1173a82f3734114ab82e993fcbe868e5f9df1cf7fa3a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mucfontsize10pt.clo \
tex-mucproc.cls \
texlive-mucproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-biblatex.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-pdfx.sty \
tex-scrartcl.cls \
tex-scrbase.sty \
tex-scrlayer-scrpage.sty \
tex-txfonts.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
