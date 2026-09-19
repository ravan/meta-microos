SUMMARY = "Retain float number across several floats"
DESCRIPTION = "The captcont package provides the ability to continue the \
numbering in your float environment (figure, table, etc.) with \
minimal overhead. This package adds three commands: \\caption*, \
\\captcont, and \\captcont*. Along with the \\caption command, \
these give full control over the caption numbering, caption \
text and the entries in the list-of pages. The \\caption and \
\\captcont commands generate list-of page entries. The \\caption \
and \\caption* commands increment the figure or table counter. \
Captcont also fully supports the subfigure package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-captcont-2026.226.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "387135b6c97eabfccc5d4b87600da6f95b1840ee839cf261795b801a3d4dacf837df5211ae5fea5fc356ea7f3ea252cdae8e50c944605bb1b83a5a43b8a4cdc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-captcont.sty \
texlive-captcont"

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
