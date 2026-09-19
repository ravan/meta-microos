SUMMARY = "Create equal-widthed parboxes"
DESCRIPTION = "LaTeX users sometimes need to ensure that two or more blocks of \
text occupy the same amount of horizontal space on the page. To \
that end, the eqparbox package defines a new command, \
\\eqparbox, which works just like \\parbox, except that instead \
of specifying a width, one specifies a tag. All eqparboxes with \
the same tag--regardless of where they are in the \
document--will stretch to fit the widest eqparbox with that \
tag. This simple, equal-width mechanism can be used for a \
variety of alignment purposes, as is evidenced by the examples \
in eqparbox's documentation. Various derivatives of \\eqparbox \
are also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1svn77682"

RPM_NAME = "texlive-eqparbox-2026.226.4.1svn77682-61.4.noarch.rpm"
RPM_HASH = "e21a083e110f80e22d8bab913e572fd6ac3c3f9af7047a4d27ca8c56754295e74cc54c1aa626c3f54b7b67effb77abc60c08ae5afd9f7cf881cef4e43c27cfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqparbox.sty \
texlive-eqparbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-environ.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
