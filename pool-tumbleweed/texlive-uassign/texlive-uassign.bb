SUMMARY = "Environments and options for typesetting university assignments"
DESCRIPTION = "The purpose of this package is to provide simple question and \
solution style environments for typesetting university \
assignments."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn38459"

RPM_NAME = "texlive-uassign-2026.226.1.01svn38459-59.2.noarch.rpm"
RPM_HASH = "a8d46808669eda6c8873cee9effc414410abf79d8f249cf742929e1b8b5223bc9a357b0792c6158f1ccc0adae5347cff713934a09ee51870e3c201935a528b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uassign.sty \
texlive-uassign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-bookmark.sty \
tex-color.sty \
tex-enumerate.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
