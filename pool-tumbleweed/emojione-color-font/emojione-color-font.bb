SUMMARY = "Colored Emoji Font"
DESCRIPTION = "A color and B&W emoji SVGinOT font built from EmojiOne artwork with support \
for ZWJ, skin tone diversity and country flags. \
 \
The font works in all operating systems, but will currently only show color \
emoji in Firefox, Thunderbird and other Mozilla Gecko-based applications. \
This is not a limitation of the font, but of the operating systems and \
applications. Regular B&W outline emoji are included for backwards/fallback \
compatibility."
LICENSE = "CC-BY-4.0"

PV = "1.3"

RPM_NAME = "emojione-color-font-1.3-2.22.noarch.rpm"
RPM_HASH = "3317f9e4e9c1c2143acf4df76844b7385120b1cc4de2cf015091a4aacc43e693a0a93dbd8d78e33949f73c82cee95950c47ab24ccfd54120ab041143b5e1a21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emojione-color-font"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
