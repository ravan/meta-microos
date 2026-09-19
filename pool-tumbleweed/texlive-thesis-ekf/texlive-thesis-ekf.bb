SUMMARY = "Thesis class for Eszterhazy Karoly Catholic University"
DESCRIPTION = "This bundle provides a LaTeX class for theses and dissertations \
at Eszterhazy Karoly Catholic University (Eger, Hungary). The \
documentation is written in Hungarian."
LICENSE = "LPPL-1.0"

PV = "2026.227.5.0svn77332"

RPM_NAME = "texlive-thesis-ekf-2026.227.5.0svn77332-62.2.noarch.rpm"
RPM_HASH = "ce56d39bcca5f0fbdca4a4738fa8ab0000118feb429caa54c72f721aa3fc1dcc05a8d2cc6181fc6ff3b857a3c9233c785b4b729c8bf0692459f75443f83e8da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-ekcu.cls \
tex-thesis-ekf.cls \
texlive-thesis-ekf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmupint.sty \
tex-fixcmex.sty \
tex-fontsize.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-report.cls \
tex-setspace.sty \
tex-upquote.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
