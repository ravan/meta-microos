SUMMARY = "Translations for package NetworkManager-iodine"
DESCRIPTION = "Provides translations for the 'NetworkManager-iodine' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-lang-1.2.0-12.5.noarch.rpm"
RPM_HASH = "6e1a15653873755a38af3ce678e516e00f6837005b88231496213db9e514e45ce081d2e795179913c016ca7779e9241829a40eca5b7415b11137cdad21909b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-iodine-lang \
NetworkManager-iodine-lang-all \
locale-NetworkManager-iodine-bs \
locale-NetworkManager-iodine-ca \
locale-NetworkManager-iodine-cs \
locale-NetworkManager-iodine-de \
locale-NetworkManager-iodine-el \
locale-NetworkManager-iodine-es \
locale-NetworkManager-iodine-hu \
locale-NetworkManager-iodine-id \
locale-NetworkManager-iodine-it \
locale-NetworkManager-iodine-ja \
locale-NetworkManager-iodine-lt \
locale-NetworkManager-iodine-lv \
locale-NetworkManager-iodine-pa \
locale-NetworkManager-iodine-pl \
locale-NetworkManager-iodine-pt \
locale-NetworkManager-iodine-pt-BR \
locale-NetworkManager-iodine-sl \
locale-NetworkManager-iodine-sr \
locale-NetworkManager-iodine-sr@latin \
locale-NetworkManager-iodine-sv \
locale-NetworkManager-iodine-tr"

RDEPENDS:${PN} += "NetworkManager-iodine"

inherit rpm
