SUMMARY = "Make landscape pages display as landscape"
DESCRIPTION = "The package adds PDF support to the landscape environment of \
package lscape, by setting the PDF /Rotate page attribute. \
Pages with this attribute will be displayed in landscape \
orientation by conforming PDF viewers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.14svn77682"

RPM_NAME = "texlive-pdflscape-2026.226.0.0.14svn77682-58.2.noarch.rpm"
RPM_HASH = "05afbfeffa258b93d9d37bc62fb47a9977d8a7cf227c4f7e7f2b49a83e2da6914dfa9b363dbd5233596f1418630c6ddc612d1b29842a111899f219ca1097e909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdflscape-nometadata.sty \
tex-pdflscape.sty \
texlive-pdflscape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-lscape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
