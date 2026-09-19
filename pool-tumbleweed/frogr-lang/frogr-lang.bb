SUMMARY = "Translations for package frogr"
DESCRIPTION = "Provides translations for the 'frogr' package."
LICENSE = "GPL-3.0-only"

PV = "1.8.1"

RPM_NAME = "frogr-lang-1.8.1-1.13.noarch.rpm"
RPM_HASH = "9fbeeaece24fe1046b9b50face44dc0e3c25afe08bf3ffc603bf85095a473ce44aa77354c6f73f9dff86feabbe386f39966abc8189f6f819aac4ad1036436e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frogr-lang \
frogr-lang-all \
locale-frogr-bs \
locale-frogr-ca \
locale-frogr-cs \
locale-frogr-da \
locale-frogr-de \
locale-frogr-el \
locale-frogr-en-GB \
locale-frogr-es \
locale-frogr-eu \
locale-frogr-fi \
locale-frogr-fr \
locale-frogr-fur \
locale-frogr-gl \
locale-frogr-hu \
locale-frogr-id \
locale-frogr-is \
locale-frogr-it \
locale-frogr-ja \
locale-frogr-lv \
locale-frogr-nb \
locale-frogr-nl \
locale-frogr-nn \
locale-frogr-oc \
locale-frogr-pl \
locale-frogr-pt \
locale-frogr-pt-BR \
locale-frogr-ro \
locale-frogr-ru \
locale-frogr-sl \
locale-frogr-sr \
locale-frogr-sr@latin \
locale-frogr-sv \
locale-frogr-te \
locale-frogr-tr \
locale-frogr-uk \
locale-frogr-zh-CN"

RDEPENDS:${PN} += "frogr"

inherit rpm
