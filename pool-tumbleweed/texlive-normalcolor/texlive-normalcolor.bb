SUMMARY = "Changing \\normalcolor"
DESCRIPTION = "This package provides a command \\setnormalcolor with the same \
syntax as the command \\color either of package color or of \
package xcolor. However, \\setnormalcolor will not change the \
current colour but the normal / default color."
LICENSE = "LPPL-1.0"

PV = "2026.226.r11svn77682"

RPM_NAME = "texlive-normalcolor-2026.226.r11svn77682-61.2.noarch.rpm"
RPM_HASH = "f1b92bca4100a9ce1673c9bcf44345991fa33a369bc78e45822984d568c184eaede7ba87703bec254e4c3fd0e2a16a7ace1dbee9e473f9fd2156d21e31168b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-normalcolor.sty \
texlive-normalcolor"

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
