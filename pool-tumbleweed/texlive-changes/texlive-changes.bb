SUMMARY = "Manual change markup"
DESCRIPTION = "The package allows the user to manually markup changes of text, \
such as additions, deletions, or replacements. Changed text is \
shown in a different color; deleted text is striked out. \
Additionally, text can be highlighted and/or commented. The \
package allows free definition of additional authors and their \
associated color. It also allows you to change the markup of \
changes, authors, highlights or comments. A Python script is \
provided for removing the changes."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2.1svn77682"

RPM_NAME = "texlive-changes-2026.226.4.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "b2ab7a06dbd25733f444bd387c647bf236fe13ba30a657e2018a075cf0c8be47c4619cfb8b58f7f85155b515b07e5610977af1af44d8e9cfb9cb3bf50c29f0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changes.sty \
texlive-changes"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-todonotes.sty \
tex-truncate.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
