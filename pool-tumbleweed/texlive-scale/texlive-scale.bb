SUMMARY = "Scale document by sqrt(2) or magstep(2)"
DESCRIPTION = "A package to scale a document by sqrt(2) (or by \\magstep{2}). \
This is useful if you are preparing a document on, for example, \
A5 paper and want to print on A4 paper to achieve a better \
resolution."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.2svn15878"

RPM_NAME = "texlive-scale-2026.226.1.1.2svn15878-60.2.noarch.rpm"
RPM_HASH = "25c6b0d05bda03faac09749cf8bb97de6050935a486a78ee7765844e7187f3623036c1db962ab1e4dfcea094a3d0fba888673660996579da2fc4718713f819ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scale.sty \
texlive-scale"

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
