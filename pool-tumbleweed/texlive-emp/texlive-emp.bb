SUMMARY = "'Encapsulate' MetaPost figures in a document"
DESCRIPTION = "Emp is a package for encapsulating MetaPost figures in LaTeX: \
the package provides environments where you can place MetaPost \
commands, and means of using that code as fragments for \
building up figures to include in your document. So, with emp, \
the procedure is to run your document with LaTeX, run MetaPost, \
and then complete running your document in the normal way. Emp \
is therefore useful for keeping illustrations in synchrony with \
the text. It also frees you from inventing descriptive names \
for PostScript files that fit into the confines of file system \
conventions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn23483"

RPM_NAME = "texlive-emp-2026.226.svn23483-61.4.noarch.rpm"
RPM_HASH = "a2aac041bf1e405a1108e3769948031c3f1797557aeb4632be29f46bbd94d7362a8046c0b63666db5e573a4751092dc015d1b2b24b57e4e3130681f0dd293982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emp.sty \
texlive-emp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
