SUMMARY = "A faithful recreation of the original DOS font"
DESCRIPTION = "BlockZone is a faithful, pixel-perfect recreation of the original IBM VGA font. \
It contains each of the 256 characters, including those in the 128-255 range, \
referred to as extended ASCII. \
BlockZone is capabable of rendering ANSI and ASCII art, in fact that is the \
purpose it was created for. It supports a wide range of codepages, the legendary \
codepage 437 (MS-DOS Latin US) as well as Baltic, Cyrillic, French Canadian, \
Greek, Hebrew, Icelandic, Latin-1, Latin-2, Nordic, Portuguese, Turkish charsets, \
Windows codepage 1252 and even more. \
All characters are mapped to their Unicode equivalents. You get the best results \
when anti-aliasing (font smoothing) is disabled."
LICENSE = "OFL-1.1"

PV = "1.004"

RPM_NAME = "blockzone-fonts-1.004-1.18.noarch.rpm"
RPM_HASH = "da73f4af17e92cb870fa7b828760bfecc66451d5bd87a53102386b3b077e53d0b55c27fdb81b43fc3c9c6ca8b99c26c83be36bd30da68e0f9c8a842795507241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blockzone-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
