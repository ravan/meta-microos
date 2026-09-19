SUMMARY = "Macros for constructing interactive LaTeX scripts"
DESCRIPTION = "Gathers together a bunch of code and examples about how to \
write macros to carry on a dialogue with the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28946"

RPM_NAME = "texlive-dialogl-2026.226.svn28946-59.2.noarch.rpm"
RPM_HASH = "055c2122554bcc34729a21aef74a487271255702de1a7cf148f894c52cc7e5dad99a2034ea8be3a63ab0772cd72814a739a86b609971b527fe2e314547b7c0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dialog.sty \
tex-grabhedr.sty \
tex-listout.tex \
tex-menus.sty \
texlive-dialogl"

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
