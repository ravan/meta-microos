SUMMARY = "Extra fonts and scripts for CJK LaTeX"
DESCRIPTION = "This package contains some extra font setup files and scripts to \
automatically generate fonts and setup files to use with CJK LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "20070515"

RPM_NAME = "texlive-cjk-latex-extras-20070515-195.6.noarch.rpm"
RPM_HASH = "3c015f463ef70acbc205cd4221a37de67eb268740bb13c9c4b5d89236273b364d9de599340e4ac459540b59e5661c59db057e5be0a0bc1a0bd021ccf53e3a712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cjk-ja;ko;zh \
texlive-cjk-latex-extras"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/touch \
/usr/bin/ttf2tfm \
/usr/bin/updmap \
texlive-cjk \
texlive-latex"

inherit rpm
