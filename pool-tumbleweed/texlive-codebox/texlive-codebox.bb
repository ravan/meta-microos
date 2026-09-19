SUMMARY = "Highlighted source code in a fancy box"
DESCRIPTION = "This LaTeX3 package provides environments codebox and codeview \
to typeset with an environment body, and macros \\codefile and \
\\cvfile to typeset programming source code from a file in a \
fancy box. Starred versions of these environments and macros \
are provided to add a comment at the bottom of the fancy box. \
The package is based on tcolorbox, minted, and listings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.4svn76924"

RPM_NAME = "texlive-codebox-2026.226.1.0.4svn76924-60.2.noarch.rpm"
RPM_HASH = "43d80ac1ce899a2420cb3afa82221af75bd45c204cc17dc06e7766dabfd73875587a993d1a084ee5c27b0324e4a52fe8f66004cb3fdc87bfc299d912266627b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codebox.sty \
texlive-codebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontawesome5.sty \
tex-l3keys2e.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
