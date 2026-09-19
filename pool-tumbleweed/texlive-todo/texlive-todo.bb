SUMMARY = "Make a to-do list for a document"
DESCRIPTION = "The package allows you to insert 'to do' marks in your \
document, to make lists of such items, and to cross-reference \
to them."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.142svn17746"

RPM_NAME = "texlive-todo-2026.226.2.142svn17746-59.2.noarch.rpm"
RPM_HASH = "a5f75faa051ea01d039b8411af2f25d88af1168e2087d34981559439053a7e98ef519b2c7bada96726b70e9ab498bdda4d8b3e5406d210de1c291fe5d25e59b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-todo.sty \
texlive-todo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
