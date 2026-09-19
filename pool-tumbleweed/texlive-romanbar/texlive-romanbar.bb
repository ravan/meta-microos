SUMMARY = "Write roman number with 'bars'"
DESCRIPTION = "'Bars', in the present context, are lines above and below text \
that abut with the text. Barred roman numerals are sometimes \
found in publications. The package provides a function that \
prints barred roman numerals (converting arabic numerals if \
necessary). The package also provides a predicate \\ifnumeric."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0gsvn77682"

RPM_NAME = "texlive-romanbar-2026.226.1.0gsvn77682-60.2.noarch.rpm"
RPM_HASH = "5b6593d2d3e65da512720258907fbbb9f8edc73917406cfbc1df18e86504cd1efac45cdbd59ec4c32a86d5af8e20ed1a2bd62450838cdf84749a15978f9786e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanbar.sty \
texlive-romanbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trimclip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
