SUMMARY = "LaTeX in Russian, without babel"
DESCRIPTION = "The package aims to facilitate Russian typesetting (based on \
input using MicroSoft Code Page 1251). Russian hyphenation is \
selected, and various mathematical commands are set up in \
Russian style. Furthermore all Cyrillic letters' catcodes are \
set to 'letter', so that commands with Cyrillic letters in \
their names may be defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25209"

RPM_NAME = "texlive-russ-2026.226.svn25209-60.2.noarch.rpm"
RPM_HASH = "0a43168ad2315c5cbfc114dc8f134779a7681bd4d36161ebd3dcbe450bc3d0e69f0d90ee63b78c2c4cd5ad8319f7e3768ecc4755484357ca2c0ab43ccb0ff74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-russ.sty \
texlive-russ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-t2aenc.def \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
