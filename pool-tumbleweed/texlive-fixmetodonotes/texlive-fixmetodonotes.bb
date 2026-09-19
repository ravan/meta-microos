SUMMARY = "Add notes on document development"
DESCRIPTION = "The package provides tools to highlight FIXME and TODO \
annotations. The command \\listofnotes prints a list of \
outstanding notes, with links to the pages on which they \
appear."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-2026.226.0.0.2.2svn30168-59.2.noarch.rpm"
RPM_HASH = "b7eb6b4df97f27cec7e71fa4f1bc7b82ded394d835971ee6a3cccc8aceb3efcf193e04e10244d0a409ea6dcf246f48426feb4abbbc46394b375d1917ef4377f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixmetodonotes.sty \
texlive-fixmetodonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fix-cm.sty \
tex-graphicx.sty \
tex-tocloft.sty \
tex-transparent.sty \
tex-ulem.sty \
tex-watermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
