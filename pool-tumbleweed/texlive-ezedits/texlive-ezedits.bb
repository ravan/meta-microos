SUMMARY = "Commands for tracking document changes and notes"
DESCRIPTION = "This is a package built for collaboratively editing LaTeX \
documents and tracking changes. Through highly customizable \
commands, the user can choose how their and their \
collaborators' modifications appear in the document. Additional \
tools are provided to help keep track of where the edits are \
made within the pdf."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn72849"

RPM_NAME = "texlive-ezedits-2026.226.1.1svn72849-59.2.noarch.rpm"
RPM_HASH = "9eca292ce9c772662fd40ee6b638f65472cfc9f247819d29fe359b38f3ef8fdbf8fb03f92a5a4cbe349ea017cb4e72a203ba1bc63d6adb282448c661300185c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ezedits.sty \
texlive-ezedits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-marginnote.sty \
tex-pdfcomment.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
