SUMMARY = "Simple language-dependent settings based on language codes"
DESCRIPTION = "The package provides a command \\uselangcode{<code>} to adjust \
language-dependent settings such as key words, typographical \
conventions and language codes (ISO 639-1). The package \
provides a means of selecting macros according to the specified \
code, for preparing a document that is to be separately typeset \
in different languages. The package is dependent on the \
plainpkg package, and is already in use in the morehype and \
catcodes packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-langcode-2026.226.0.0.2svn76924-63.2.noarch.rpm"
RPM_HASH = "ee2875301ef85726873f4fef4be21c70ef3132ab5742551d8e64fcd27b85e58b8c7b3773d5025f4c0abecb9c55d6a95db802b67c3eaf23a25ec03cc9350f6917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langcode.sty \
texlive-langcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dowith.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
