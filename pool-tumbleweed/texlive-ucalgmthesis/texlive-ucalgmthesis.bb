SUMMARY = "LaTeX thesis class for University of Calgary Faculty of Graduate Studies"
DESCRIPTION = "ucalgmthesis.cls is a LaTeX class file that produces documents \
according to the thesis guidelines of the University of Calgary \
Faculty of Graduate Studies. It uses the memoir class, which \
provides very powerful and flexible mechanisms for book design \
and layout. All memoir commands for changing chapter and \
section headings, page layout, fancy foot- and endnotes, \
typesetting poems, etc., can be used. (Memoir is meant as a \
replacement for the standard LaTeX classes, so all standard \
LaTeX commands such as \\chapter, \\section, etc., still work.) \
Likewise, any of memoir's class options can be passed as \
options to ucalgmthesis, in particular 12pt to select 12 point \
type (11 point is the default)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66602"

RPM_NAME = "texlive-ucalgmthesis-2026.226.svn66602-59.2.noarch.rpm"
RPM_HASH = "7034b84c068c633c7cebe67e78f1dca800906cafdf0ead6b8080946ae90476583ec1b702bcc86cffbd37462aa449492fff389e6c6207362c9d939c68617204a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucalgmthesis.cls \
texlive-ucalgmthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-erewhon.sty \
tex-fontenc.sty \
tex-libertine.sty \
tex-memoir.cls \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
