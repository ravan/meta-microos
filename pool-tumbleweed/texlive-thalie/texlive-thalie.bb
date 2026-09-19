SUMMARY = "Typeset drama plays"
DESCRIPTION = "The package provides tools to typeset drama plays. It defines \
commands to introduce characters' lines, to render stage \
directions, to divide a play into acts and scenes and to build \
the dramatis personae automatically."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-2026.227.0.0.13asvn65249-62.2.noarch.rpm"
RPM_HASH = "6f970cc7faa6f52c0174ef64e1875b83db0866147147ad1fb8d7dccd565419c73e6e3944a70c66be84124d7e579624eaf8f70eb44d9c182086086a09b91ca1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thalie.sty \
texlive-thalie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-suffix.sty \
tex-tabularx.sty \
tex-translations.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
