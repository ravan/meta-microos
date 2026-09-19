SUMMARY = "Macros for entering futhark runes"
DESCRIPTION = "This package provides simple macros for entering both younger- \
and elder futhark runes using the allrunesy package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76480"

RPM_NAME = "texlive-futharksymb-2026.226.1.0.1svn76480-60.2.noarch.rpm"
RPM_HASH = "b4455fe87f686c19739aeb8a1726ae7e79b4f89adefba8ebf82b5148c8840c81f849410718b955cdd7952703820fe659df695d017eb92cef25916dec0fb5a9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-futharksymb.sty \
texlive-futharksymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-allrunes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
