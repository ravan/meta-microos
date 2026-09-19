SUMMARY = "IPA (Japanese) fonts"
DESCRIPTION = "The fonts provide fixed-width glyphs for Kana and Kanji \
characters, proportional width glyphs for Western characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-ipaex-2026.226.svn61719-63.2.noarch.rpm"
RPM_HASH = "71899eb5b5fb71d27001c0e082da36285da34dd3b743c0e70fe1184932d299ef9b6e3f14a1d328a4a8ea4877edef690243764ee344b3ed07cd82bcbc97008db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-ipaex-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
