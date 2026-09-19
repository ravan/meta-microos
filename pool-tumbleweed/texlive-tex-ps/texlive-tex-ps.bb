SUMMARY = "TeX to PostScript generic macros and add-ons"
DESCRIPTION = "TeX to PostScript generic macros and add-ons: transformations \
of EPS files, prepress preparation, color separation, mirror, \
etc."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-tex-ps-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "d4713f253f9f94f27b8fb848e6fa05280775a986dd617e95a3b1c0deeb147f1ce5ea95e693ce69891000ba78c48cdbaf18c025e2a4e27c62a368c070214a5c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmyk-hax.tex \
tex-epsfx.tex \
tex-poligraf.sty \
tex-trans.tex \
texlive-tex-ps"

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
