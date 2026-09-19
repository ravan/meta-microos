SUMMARY = "A font that can render all language autonyms"
DESCRIPTION = "If we want to show a large number of languages written in their own scripts \
(autonyms), we cannot apply the usual webfonts to it. This is because since \
each script require a webfonts, we will end up in using a large number of \
webfonts. This can cause large bandwidth usage. \
 \
Autonym font tries to solve this. The font contains glyphs and opentype rules \
for rendering the language autonyms. And it contains only those glyphs for a \
language. For example, for Thai, the font has glyphs required for rendering ไทย \
alone."
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "autonym-fonts-1.0-3.25.noarch.rpm"
RPM_HASH = "3672a5eb5114ef74fcad4ee17626e6f735ee49974a3c84cf819f3f4210dce7567cadfa5bd4bbdf443caedc56ce598fb7ed679c294bd37bfc4c74a6b1cf724ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autonym-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
