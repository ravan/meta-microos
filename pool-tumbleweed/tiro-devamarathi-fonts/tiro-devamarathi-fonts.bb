SUMMARY = "Tiro Devanagari Marathi Fonts"
DESCRIPTION = "Tiro Devanagari Marathi has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-devamarathi-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "1124b8048988537c3cd960ebc9236192c7b96ddf8f6443ab13215ecf3c36a1bab193f30bfe632f55d4d356dff698e9d1fb3bc0904c5638696ac43dc06ba575b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-devamarathi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
