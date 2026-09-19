SUMMARY = "Font using Twitter’s color emoji"
DESCRIPTION = "A color and monochrome emoji SVG-in-OpenType font built from the \
Twitter Emoji for Everyone artwork with support for ZWJ, \
skin tone diversity and country flags. \
 \
The font works in all operating systems, but will currently only \
show color emoji in Firefox, Thunderbird and other Mozilla Gecko-based \
applications. This is not a limitation of the font but of the \
operating systems and applications. Regular monochrome outline \
emoji are included for backwards/fallback compatibility."
LICENSE = "CC-BY-4.0"

PV = "15.1.0"

RPM_NAME = "twemoji-color-font-15.1.0-1.6.noarch.rpm"
RPM_HASH = "9cafeabacfd93d65da263b9a2ec8c9f74a1f06cc65b6107df369b5482337406284b2d79ea09af8117a01c157869c0029da8160778a82ded98944530cff1a3873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "twemoji-color-font"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
