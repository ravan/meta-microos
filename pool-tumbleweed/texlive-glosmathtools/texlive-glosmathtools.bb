SUMMARY = "Mathematical nomenclature tools based on the glossaries package"
DESCRIPTION = "This package can be used to generate a mathematical \
nomenclature (also called 'list of symbols' or 'notation'). It \
is based on the glossaries package. Its main features are: \
symbol categories (e.g.: latin, greek) automatic but \
customizable symbol sorting easy subscript management easy \
accentuation management abbreviation support (with first use \
definition) bilingual nomenclatures (for bilingual documents) \
bilingual abbreviations The documentation is based on the \
ulthese class. The package itself depends on glossaries, \
amsmath, amsfonts, and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-2026.226.1.0.0svn55920-60.4.noarch.rpm"
RPM_HASH = "44401f7da69339cc2961073adc0785343bc5ce7f192cb9ceadacde07ac6c4f2d21c8359564d69f3a97618e842bc054710b026365bb9d458c444fbf1cc9aac415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glosmathtools.sty \
texlive-glosmathtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-glossaries.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
