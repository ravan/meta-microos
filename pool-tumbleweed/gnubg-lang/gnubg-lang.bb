SUMMARY = "Translations for package gnubg"
DESCRIPTION = "Provides translations for the 'gnubg' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.08.003"

RPM_NAME = "gnubg-lang-1.08.003-1.6.noarch.rpm"
RPM_HASH = "7e9deedc2ea6a32c915f2061db7e5fcbc4616328c2ff6483ecf49361236dac5d26a78b6cac8ed5e54a16fe34366f8d25c4503904cbbdd9ef0f460eb1350e4600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-lang \
gnubg-lang-all \
locale-gnubg-cs \
locale-gnubg-da \
locale-gnubg-de \
locale-gnubg-el \
locale-gnubg-en-GB \
locale-gnubg-en-US \
locale-gnubg-es \
locale-gnubg-fi \
locale-gnubg-fr \
locale-gnubg-is \
locale-gnubg-it \
locale-gnubg-ja \
locale-gnubg-ro \
locale-gnubg-ru \
locale-gnubg-tr"

RDEPENDS:${PN} += "gnubg"

inherit rpm
