SUMMARY = "Typeset critical editions"
DESCRIPTION = "This is the type example package for typesetting scholarly \
critical editions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.17svn72250"

RPM_NAME = "texlive-edmac-2026.226.3.17svn72250-61.4.noarch.rpm"
RPM_HASH = "8d01b0cc45718d2f5a82dc858f20c33e3893cc8afa2e4c52d74a0875f531a7cd9dd200486d72255e0d630114131ec45c414a3051e8bc85bab64b4d2fd84f2b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edmac.tex \
tex-edmacfss.sty \
tex-edstanza.tex \
tex-tabmac.tex \
texlive-edmac"

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
