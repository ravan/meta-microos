SUMMARY = "A LaTeX package for displaying Post-it notes"
DESCRIPTION = "This package provides some commands and options for creating \
Post-it-like boxes with tcolorbox: an environment PostIt with \
customizations; a command \\MiniPostIt to display a simple \
Post-It."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.5svn75925"

RPM_NAME = "texlive-postit-2026.226.0.0.1.5svn75925-59.2.noarch.rpm"
RPM_HASH = "9c104311f8d38e1c393f7cadfedb72f9f1b8680c8052503e8109dc0d6fee9882ae0720457edd460408e794b9685a7bc85febcdcb6348b1ae94235c87e3224e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postit.sty \
texlive-postit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-settobox.sty \
tex-simplekv.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
