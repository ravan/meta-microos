SUMMARY = "Support for Thai within babel"
DESCRIPTION = "The package provides support for typesetting Thai text. within \
the babel system."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-2026.226.1.0.0svn30564-60.2.noarch.rpm"
RPM_HASH = "4e54fef194773894f9c5123290c419ba0cb2aa41d1a68ffecb649fa173bdd788e73a2214a3cf12c5a4ad8339cf3fc33e100a2f1cad77d2ceb645bef87b5d4432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lthenc.def \
tex-thai.ldf \
tex-tis620.def \
texlive-babel-thai"

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
