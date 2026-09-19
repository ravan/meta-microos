SUMMARY = "Record the number of citations in a document"
DESCRIPTION = "The package records the number of citations in a document, and \
provides a command (\\LastBib) to print the number."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn70376"

RPM_NAME = "texlive-lastbib-2026.226.2.1svn70376-63.2.noarch.rpm"
RPM_HASH = "de90773842123804e67f6406fc60930e719abc2be439203c399d7a26114dff20f437e3fdb2aab0f0cf3eb0d32caba49b1efed6307ba213ae3820afc9ced4a605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lastbib.sty \
texlive-lastbib"

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
