SUMMARY = "Typesetting Ecclesiastic Latin"
DESCRIPTION = "The package modifies the way the latin option to babel operates \
when typesetting Latin. The style is somewhat 'frenchified' in \
respect of punctuation spacings and footnote style; shortcuts \
are available in order to set accents on all vowels, including \
y and the diphthongs ae and oe."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-2026.226.0.0.3svn38172-61.4.noarch.rpm"
RPM_HASH = "80729e0d77f0151ccebbbb57729ceeec7e44e00ae661981128c7285d91aa9e53f02ba2e0ef0aea2fbd5595968f580d926b4326d33a56bf8998821d2ee31bf9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecclesiastic.sty \
texlive-ecclesiastic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
