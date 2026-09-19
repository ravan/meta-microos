SUMMARY = "Amiri is a body text Naskh typeface"
DESCRIPTION = "Amiri is a classical Arabic typeface in Naskh style for typesetting \
books and other running text. Amiri is a revival of the beautiful typeface \
pioneered in early 20th century by Bulaq Press in Cairo, also known as \
Amiria Press, after which the font is named. Amiri project aims at the \
revival of the aesthetics and traditions of Arabic typesetting, and adapting \
it to the era of digital typesetting, in a publicly available form."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "aliftype-amiri-fonts-1.000-1.10.noarch.rpm"
RPM_HASH = "62b18b45efa1a2592d729f62f845c5de0616261820d46af8161ae4eae81a5c152e9fd3fa3569e1613834ef6002a8f9d4606fff4861cf33b409bdad7c6480ddf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aliftype-amiri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
