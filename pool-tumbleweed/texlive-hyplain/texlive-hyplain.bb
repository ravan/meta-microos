SUMMARY = "Basic support for multiple languages in Plain TeX"
DESCRIPTION = "The package offers a means to set up hyphenation suitable for \
several languages and/or dialects, and to select them or switch \
between them while typesetting."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hyplain-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "6c1690206033af3fb882db6d8bb37acf35c510789c5d57932ded22ac0b6af312f7a5a59e70e0009425f43e3e93d03b9b784227620dde91c96fe307405c6d3738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hylang.tex \
tex-hyplain.tex \
tex-hyrules.tex \
texlive-hyplain"

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
