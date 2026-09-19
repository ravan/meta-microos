SUMMARY = "Translations for package mc"
DESCRIPTION = "Provides translations for the 'mc' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.33"

RPM_NAME = "mc-lang-4.8.33-2.6.noarch.rpm"
RPM_HASH = "3f8a710dbd279cf98ec272b54d9e103b3625ac9a7db534eb52d8e7ce47f2d1d91ef37177c4152afd072d8019d616cab051b14a75641d0375924770382a05ebf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mc-af \
locale-mc-ar \
locale-mc-az \
locale-mc-be \
locale-mc-bg \
locale-mc-br \
locale-mc-ca \
locale-mc-cs \
locale-mc-da \
locale-mc-de \
locale-mc-de-CH \
locale-mc-el \
locale-mc-en-GB \
locale-mc-eo \
locale-mc-es \
locale-mc-et \
locale-mc-eu \
locale-mc-fa \
locale-mc-fi \
locale-mc-fr \
locale-mc-fr-CA \
locale-mc-ga \
locale-mc-gl \
locale-mc-he \
locale-mc-hr \
locale-mc-hu \
locale-mc-ia \
locale-mc-id \
locale-mc-it \
locale-mc-ja \
locale-mc-ka \
locale-mc-kk \
locale-mc-ko \
locale-mc-lt \
locale-mc-lv \
locale-mc-nb \
locale-mc-nl \
locale-mc-nl-BE \
locale-mc-pl \
locale-mc-pt \
locale-mc-pt-BR \
locale-mc-ro \
locale-mc-ru \
locale-mc-sk \
locale-mc-sl \
locale-mc-sr \
locale-mc-sv \
locale-mc-ta \
locale-mc-te \
locale-mc-tr \
locale-mc-uk \
locale-mc-vi \
locale-mc-wa \
locale-mc-zh-CN \
locale-mc-zh-TW \
mc-lang \
mc-lang-all"

RDEPENDS:${PN} += "mc"

inherit rpm
