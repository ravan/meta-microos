SUMMARY = "Translations for package atomix"
DESCRIPTION = "Provides translations for the 'atomix' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "atomix-lang-44.0-1.12.noarch.rpm"
RPM_HASH = "77d1d6d4bd589d1827d9994abda522ca614e1a79f58d4758f7f0a746a93c228113988691f3aa9495230bb91a1fed5833122f285915ff440d631a0effced04313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atomix-lang \
atomix-lang-all \
locale-atomix-af \
locale-atomix-ar \
locale-atomix-az \
locale-atomix-be \
locale-atomix-bg \
locale-atomix-bn \
locale-atomix-bs \
locale-atomix-ca \
locale-atomix-cs \
locale-atomix-da \
locale-atomix-de \
locale-atomix-dz \
locale-atomix-el \
locale-atomix-en-CA \
locale-atomix-en-GB \
locale-atomix-eo \
locale-atomix-es \
locale-atomix-et \
locale-atomix-eu \
locale-atomix-fa \
locale-atomix-fi \
locale-atomix-fr \
locale-atomix-fur \
locale-atomix-ga \
locale-atomix-gl \
locale-atomix-gu \
locale-atomix-he \
locale-atomix-hi \
locale-atomix-hu \
locale-atomix-id \
locale-atomix-is \
locale-atomix-it \
locale-atomix-ja \
locale-atomix-ka \
locale-atomix-kn \
locale-atomix-ko \
locale-atomix-lt \
locale-atomix-lv \
locale-atomix-mk \
locale-atomix-ml \
locale-atomix-ms \
locale-atomix-nb \
locale-atomix-ne \
locale-atomix-nl \
locale-atomix-oc \
locale-atomix-pa \
locale-atomix-pl \
locale-atomix-pt \
locale-atomix-pt-BR \
locale-atomix-ro \
locale-atomix-ru \
locale-atomix-sk \
locale-atomix-sl \
locale-atomix-sq \
locale-atomix-sr \
locale-atomix-sr@latin \
locale-atomix-sv \
locale-atomix-ta \
locale-atomix-th \
locale-atomix-tr \
locale-atomix-uk \
locale-atomix-vi \
locale-atomix-wa \
locale-atomix-zh-CN \
locale-atomix-zh-HK \
locale-atomix-zh-TW"

RDEPENDS:${PN} += "atomix"

inherit rpm
