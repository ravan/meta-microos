SUMMARY = "To-do notes in a document"
DESCRIPTION = "The package provides to-do notes throughout a document, and \
will provide an index of things to do."
LICENSE = "Apache-1.0"

PV = "2026.226.svn32677"

RPM_NAME = "texlive-easy-todo-2026.226.svn32677-61.4.noarch.rpm"
RPM_HASH = "8ba5f5afdf8dea0a9e2d80f9ce11ff7750a619b01287688396f4ce0e13ca1bc84f8a3feb966940bbf3a18265acd65f5cfb1120e8634108543ced21e3da619136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy-todo.sty \
texlive-easy-todo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifdraft.sty \
tex-ifthen.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
