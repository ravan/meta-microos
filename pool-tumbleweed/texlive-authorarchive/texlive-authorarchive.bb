SUMMARY = "Adds self-archiving information to scientific papers"
DESCRIPTION = "This is a LaTeX style for producing author self-archiving \
copies of (academic) papers. The following layout-styles are \
pre-defined: ACM for the two-column layout used by many ACM \
conferences IEEE for the two-column layout used by many IEEE \
conferences LNCS for the LNCS layout (as used by Springer) LNI \
for the Lecture Notes in Informatics, published by the GI ENTCS \
for the Elsevier ENTCS layout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn77171"

RPM_NAME = "texlive-authorarchive-2026.226.1.3.1svn77171-60.2.noarch.rpm"
RPM_HASH = "765001734b4a04f01cdcdb39b2b2aaec4d3f8ff1b5b31b9550305f3163015df1532c56744dd8a1fbdddcaa53460f1373f1dfd9163d87fe43d4e9f866e78b8571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authorarchive.sty \
texlive-authorarchive"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-intopdf.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-orcidlink.sty \
tex-qrcode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
