SUMMARY = "Translations for package meld"
DESCRIPTION = "Provides translations for the 'meld' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.24.0"

RPM_NAME = "meld-lang-3.24.0-1.2.noarch.rpm"
RPM_HASH = "3a495cd2990f167d1ca4eed75174c7ea42f1b7a5d78da4b709a4acc2828cf49c6bf5843f50448f1c44459c4956c6cd79188e11a2ddb96863d90e50f77b56b364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-meld-ar \
locale-meld-bg \
locale-meld-bs \
locale-meld-ca \
locale-meld-ca@valencia \
locale-meld-cs \
locale-meld-da \
locale-meld-de \
locale-meld-dz \
locale-meld-el \
locale-meld-en-CA \
locale-meld-en-GB \
locale-meld-eo \
locale-meld-es \
locale-meld-eu \
locale-meld-fa \
locale-meld-fi \
locale-meld-fr \
locale-meld-gl \
locale-meld-he \
locale-meld-hi \
locale-meld-hu \
locale-meld-id \
locale-meld-it \
locale-meld-ja \
locale-meld-ka \
locale-meld-kk \
locale-meld-ko \
locale-meld-nb \
locale-meld-ne \
locale-meld-nl \
locale-meld-oc \
locale-meld-pa \
locale-meld-pl \
locale-meld-pt \
locale-meld-pt-BR \
locale-meld-ro \
locale-meld-ru \
locale-meld-sk \
locale-meld-sl \
locale-meld-sq \
locale-meld-sr \
locale-meld-sr@latin \
locale-meld-sv \
locale-meld-tr \
locale-meld-uk \
locale-meld-vi \
locale-meld-zh-CN \
locale-meld-zh-TW \
meld-lang \
meld-lang-all"

RDEPENDS:${PN} += "meld"

inherit rpm
