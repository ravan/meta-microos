SUMMARY = "Display the value of a LaTeX counter in a variety of formats"
DESCRIPTION = "The package provides commands that display the value of a LaTeX \
counter in a variety of formats (ordinal, text, hexadecimal, \
decimal, octal, binary etc). The package offers some \
multilingual support; configurations for use in English (both \
British and American usage), French (including Belgian and \
Swiss variants), German, Italian, Portuguese and Spanish \
documents are provided. This package was originally provided as \
part of the author's datetime package, but is now distributed \
separately."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.12svn77682"

RPM_NAME = "texlive-fmtcount-2026.226.3.12svn77682-60.2.noarch.rpm"
RPM_HASH = "081528e382aa8104831008ed3f363fad4ddb0046c2667cb612adc6cb4d54db46a4295f7be3280842264d3513c3728784a45aa64922c4183d949f5c836de98638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fc-UKenglish.def \
tex-fc-USenglish.def \
tex-fc-american.def \
tex-fc-brazilian.def \
tex-fc-british.def \
tex-fc-dutch.def \
tex-fc-english.def \
tex-fc-francais.def \
tex-fc-french.def \
tex-fc-frenchb.def \
tex-fc-german.def \
tex-fc-germanb.def \
tex-fc-italian.def \
tex-fc-ngerman.def \
tex-fc-ngermanb.def \
tex-fc-portuges.def \
tex-fc-portuguese.def \
tex-fc-spanish.def \
tex-fcnumparser.sty \
tex-fcprefix.sty \
tex-fmtcount.sty \
texlive-fmtcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-itnumpar.sty \
tex-keyval.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
