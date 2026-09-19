SUMMARY = "An ArabTeX-like interface for XeLaTeX"
DESCRIPTION = "ArabXeTeX provides a convenient ArabTeX-like user-interface for \
typesetting languages using the Arabic script in XeLaTeX, with \
flexible access to font features. Input in ArabTeX notation can \
be set in three different vocalization modes or in roman \
transliteration. Direct UTF-8 input is also supported. The \
parsing and converting of ArabTeX input to Unicode is done by \
means of TECkit mappings. Version 1.0 provides support for \
Arabic, Maghribi Arabic, Farsi (Persian), Urdu, Sindhi, \
Kashmiri, Ottoman Turkish, Kurdish, Jawi (Malay) and Uighur. \
The documentation covers topics such as typesetting the Holy \
Quran and typesetting bidirectional critical editions with the \
package ednotes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn77682"

RPM_NAME = "texlive-arabxetex-2026.226.1.2.1svn77682-61.2.noarch.rpm"
RPM_HASH = "0e9c195beb11d6d9bd5ac8a747d497fe04aa37c8b8ae296ebc12774e620fead11fd824d409f3608ea5fd991a5b785a6d7e2ab9bc548e7cec6c66ab27a2fc8957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabicdigits.map \
tex-arabtex-farsi-fullvoc.map \
tex-arabtex-farsi-novoc.map \
tex-arabtex-farsi-trans-loc.map \
tex-arabtex-farsi-voc.map \
tex-arabtex-fullvoc.map \
tex-arabtex-kashmiri-fullvoc.map \
tex-arabtex-kashmiri-novoc.map \
tex-arabtex-kashmiri-voc.map \
tex-arabtex-kurdish.map \
tex-arabtex-maghribi-fullvoc.map \
tex-arabtex-maghribi-novoc.map \
tex-arabtex-maghribi-voc.map \
tex-arabtex-malay-fullvoc.map \
tex-arabtex-malay-novoc.map \
tex-arabtex-malay-voc.map \
tex-arabtex-novoc.map \
tex-arabtex-pashto-fullvoc.map \
tex-arabtex-pashto-novoc.map \
tex-arabtex-pashto-trans-loc.map \
tex-arabtex-pashto-voc.map \
tex-arabtex-sindhi-fullvoc.map \
tex-arabtex-sindhi-novoc.map \
tex-arabtex-sindhi-trans-loc.map \
tex-arabtex-sindhi-voc.map \
tex-arabtex-trans-dmg.map \
tex-arabtex-trans-loc.map \
tex-arabtex-turk-fullvoc.map \
tex-arabtex-turk-novoc.map \
tex-arabtex-turk-voc.map \
tex-arabtex-uighur.map \
tex-arabtex-urdu-fullvoc.map \
tex-arabtex-urdu-novoc.map \
tex-arabtex-urdu-trans-loc.map \
tex-arabtex-urdu-voc.map \
tex-arabtex-voc.map \
tex-arabxetex.sty \
tex-farsidigits.map \
tex-fixlamalif.map \
tex-mirrorpunct.map \
texlive-arabxetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bidi.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
