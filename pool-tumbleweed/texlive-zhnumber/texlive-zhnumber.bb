SUMMARY = "Typeset Chinese representations of numbers"
DESCRIPTION = "The package provides commands to typeset Chinese \
representations of numbers. The main difference between this \
package and CJKnumb is that the commands provided are \
expandable in the 'proper' way."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-zhnumber-2026.226.3.0svn77682-59.4.noarch.rpm"
RPM_HASH = "fd36314678c2c9c15a20e8560c47cbd8722d403c179b395b78ee58925254d45b83b78dd5a148d74fc0e8abb736e302a0b107c0cc707d673fca9f99a6e8c2aa78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhnumber-big5.cfg \
tex-zhnumber-gbk.cfg \
tex-zhnumber-utf8.cfg \
tex-zhnumber.sty \
texlive-zhnumber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
