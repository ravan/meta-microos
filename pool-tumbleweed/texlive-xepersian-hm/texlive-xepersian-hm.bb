SUMMARY = "Fixes kashida feature in xepersian package"
DESCRIPTION = "The kashida feature in xepersian has problems with some fonts \
such as the HM Series fonts and the XB Series fonts. This \
package fixes these problems. The package requires xepersian \
and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-xepersian-hm-2026.226.1.1asvn77682-59.4.noarch.rpm"
RPM_HASH = "68604890a6a97a9ca5f674f4b2147ed7307523ca1ca06ade24e05d35d74b5a7d79243a0512c123eeb6953f94a0dd61b77b5747648bec6bef531b9773fb25ad65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xepersian-hm-common-kashida.tex \
tex-xepersian-hm-kashida.tex \
tex-xepersian-hm.sty \
texlive-xepersian-hm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-xcolor.sty \
tex-xepersian.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
