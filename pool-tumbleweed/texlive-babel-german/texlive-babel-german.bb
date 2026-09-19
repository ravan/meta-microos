SUMMARY = "Babel support for documents written in German"
DESCRIPTION = "This bundle is an extension to the babel package for \
multilingual typesetting. It provides all the necessary macros, \
definitions and settings to typeset German documents. The \
bundle includes support for the traditional and reformed German \
orthography as well as for the Austrian and Swiss varieties of \
German."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.99csvn77815"

RPM_NAME = "texlive-babel-german-2026.226.2.99csvn77815-60.2.noarch.rpm"
RPM_HASH = "663491e90da2fe7d6f05643a2ec33c968102e1d145884f87de53b0c7a3ba5dab5a55ce8ca98268e672aacb242bb9eaf5f30f04d7a0eeb42e708a611bb28ef8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-austrian.ldf \
tex-babel-german.def \
tex-german-at-1901.ldf \
tex-german-at.ldf \
tex-german-austria-1901.ldf \
tex-german-austria.ldf \
tex-german-ch-1901.ldf \
tex-german-ch.ldf \
tex-german-de-1901.ldf \
tex-german-de.ldf \
tex-german-germany-1901.ldf \
tex-german-germany.ldf \
tex-german-switzerland-1901.ldf \
tex-german-switzerland.ldf \
tex-german.ldf \
tex-germanb.ldf \
tex-naustrian.ldf \
tex-ngerman.ldf \
tex-ngermanb.ldf \
tex-nswissgerman.ldf \
tex-swissgerman.ldf \
texlive-babel-german"

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
