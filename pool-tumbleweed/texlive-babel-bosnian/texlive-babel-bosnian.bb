SUMMARY = "Babel contrib support for Bosnian"
DESCRIPTION = "The package provides a language definition file that enables \
support of Bosnian with babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-babel-bosnian-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "68dd7a2a61fd39f7679e528f0effec8f7c950bc0868d4d873e7d75a96296260fda90dc39c27f818c757ac63a69b679373384a74f95ba8081822b1b092dd7b2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bosnian.ldf \
texlive-babel-bosnian"

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
