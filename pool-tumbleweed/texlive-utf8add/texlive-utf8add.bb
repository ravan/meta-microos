SUMMARY = "Additional support for UTF-8 encoded LaTeX input"
DESCRIPTION = "This bundle contains the LaTeX packages utf8add.sty and \
utf8hax.sty. The utf8add package provides additional support \
for the use of UTF-8 encoded input. This is intended for making \
LaTeX input more readable. The utf8hax package is using UTF-8 \
characters for easier access to math in LaTeX, however making \
the LaTeX input less readable."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn61074"

RPM_NAME = "texlive-utf8add-2026.226.svn61074-60.2.noarch.rpm"
RPM_HASH = "819a9329fb3ea1b75ad7984edbf0e74e9374383cee32423ba0852c6f20e6614ce3ee37de7ab168ed4a8bff7fc682e94c9184a0b3ac8e1c71f7ff0fbbc2130c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utf8add.sty \
tex-utf8hax.sty \
texlive-utf8add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-gensymb.sty \
tex-inputenc.sty \
tex-nicefrac.sty \
tex-upgreek.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
