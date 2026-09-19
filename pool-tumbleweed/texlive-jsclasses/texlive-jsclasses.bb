SUMMARY = "Classes tailored for use with Japanese"
DESCRIPTION = "Classes jsarticle and jsbook are provided, together with \
packages okumacro and okuverb. These classes are designed to \
work under ASCII Corporation's Japanese TeX system ptex."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-jsclasses-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "ac9c081fadf7cb1bbb69b7b74e0e4f48dc68bfb49e291660112e5d0095eb7d0eaba18f7944afe9d31971c13408505c1661dc575ae56cba46d3f95f29c38f31ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jsarticle.cls \
tex-jsbook.cls \
tex-jslogo.sty \
tex-jspf.cls \
tex-jsreport.cls \
tex-jsverb.sty \
tex-kiyou.cls \
tex-minijs.sty \
tex-okumacro.sty \
tex-okuverb.sty \
texlive-jsclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ts1enc.def \
tex-type1cm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
