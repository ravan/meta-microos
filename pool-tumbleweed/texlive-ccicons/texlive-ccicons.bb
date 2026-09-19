SUMMARY = "LaTeX support for Creative Commons icons"
DESCRIPTION = "The package provides the means to typeset Creative Commons \
icons, in documents licensed under CC licences. A font (in \
Adobe Type 1 format) and LaTeX support macros are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-ccicons-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "b1876f773d92b6b6b6756341f5ff5cc52a57c3bb236f974cb8aa9a37c8e8b6259399ec7ee4d7c44399291b594dc046a78642423a18cbb660798bcbf65cf5fdbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccicons-u.enc \
tex-ccicons.map \
tex-ccicons.sty \
tex-ccicons.tfm \
texlive-ccicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-ccicons-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
