SUMMARY = "Show label commands in the margin"
DESCRIPTION = "This package helps you keep track of all the labels you define, \
by putting the name of new labels into the margin whenever the \
\\label command is used. The package allows you to do the same \
thing for other commands. The only one for which this is \
obviously useful is the \\cite command, but it's easy to do it \
for others, such as the \\ref or \\begin commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.3svn77682"

RPM_NAME = "texlive-showlabels-2026.226.1.9.3svn77682-60.2.noarch.rpm"
RPM_HASH = "bd2a35d567ca8daec7dc5dac40fb72ae23d5b67079db919b0bdf08d1dbb2e4232f099cae01efdc3551c14b77a36c5d34264294d6a6ff244d63a60ead2dbedfd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showlabels.sty \
texlive-showlabels"

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
