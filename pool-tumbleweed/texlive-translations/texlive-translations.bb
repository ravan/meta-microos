SUMMARY = "Internationalisation of LaTeX2e packages"
DESCRIPTION = "This package (once part of the exsheets package), provides a \
framework for providing multilingual features to a LaTeX \
package. The package has its own basic dictionaries for \
English, Brazilian, Catalan, Dutch, French, German and Spanish; \
it aims to use translation material for English, Dutch, French, \
German, Italian, Spanish, Catalan, Turkish, Croatian, \
Hungarian, Danish and Portuguese from babel or polyglossia if \
either is in use in the document. (Additional languages from \
the multilingual packages may be possible: ask the author.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-translations-2026.226.1.12svn77682-59.2.noarch.rpm"
RPM_HASH = "b8488135119acb1fb11f162b9b68ff1a0c748c1eed129ab305bcb391fa2bb05edffcfc819f57a152762979ae9e8d444179bfb4aa140222efea9d5c23e8b02e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-translations.sty \
texlive-translations"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
