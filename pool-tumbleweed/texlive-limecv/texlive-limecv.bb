SUMMARY = "A (Xe/Lua)LaTeX document class for curriculum vitae"
DESCRIPTION = "limecv is a (Xe/Lua)LaTeX document class to write curriculum \
vitae. It is designed with the following design rules: simple, \
elegant and clean. To this end, it offers several environments \
and macros for convenience."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.12svn75301"

RPM_NAME = "texlive-limecv-2026.226.0.0.1.12svn75301-61.2.noarch.rpm"
RPM_HASH = "fd8ca5d7943ed50adc8ab5a1f8ba28cf84f38770b207be0a63804ba6a323cea1e0fc5ca6109f6c5f6bc7e635a920d1f4372e56585ee4d5d6895e3dc183450521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-limecv.cls \
texlive-limecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fontawesome5.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-parskip.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xeCJK.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
