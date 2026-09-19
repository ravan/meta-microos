SUMMARY = "Typeset Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The package defines maths mode commands for typesetting Gottlob \
Frege's concept-script in the style of his 'Grundgesetze der \
Arithmetik' (Basic Laws of Arithmetic)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.03svn58997"

RPM_NAME = "texlive-grundgesetze-2026.226.1.03svn58997-60.4.noarch.rpm"
RPM_HASH = "97a0c069508dc6917d0beaac2177e6c492db5d49eba5f9c7b88f49353823f88fe8477a061fd3b8917a8fdf2520b9514c3e14dd48f563b1013c0197f9d2c094e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grundgesetze.sty \
texlive-grundgesetze"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bguq.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
