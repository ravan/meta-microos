SUMMARY = "Support for the Bengali language"
DESCRIPTION = "The package is based on Velthuis' transliteration scheme, with \
extensions to deal with the Bengali letters that are not in \
Devanagari. The package also supports Assamese."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-bengali-2026.226.svn55475-61.2.noarch.rpm"
RPM_HASH = "bf17f72afc66676df47b88ad9ae003e64c01939033e507b1085b605a4a0d9008001df4a6b6976e6b665b58aabf5fc493720d50d4f0353408afc655abf447b0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beng.sty \
tex-bnr10.tfm \
tex-bnsl10.tfm \
tex-ubn.fd \
tex-ubnx.fd \
tex-xbnr10.tfm \
tex-xbnsl10.tfm \
texlive-bengali"

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
