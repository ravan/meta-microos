SUMMARY = "Translations for package gparted"
DESCRIPTION = "Provides translations for the 'gparted' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "gparted-lang-1.8.1-2.3.noarch.rpm"
RPM_HASH = "0fcc41f7f66651cc57747a8740c92c95b33ece34c36bc2dae433af70973f07924282ee5704f1e59fa07ebd5f3b9cd26f78940beca26f057ae9ae03278f0f8c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gparted-lang \
gparted-lang-all \
locale-gparted-ar \
locale-gparted-be \
locale-gparted-bg \
locale-gparted-br \
locale-gparted-bs \
locale-gparted-ca \
locale-gparted-ca@valencia \
locale-gparted-cs \
locale-gparted-da \
locale-gparted-de \
locale-gparted-dz \
locale-gparted-el \
locale-gparted-en-CA \
locale-gparted-en-GB \
locale-gparted-eo \
locale-gparted-es \
locale-gparted-et \
locale-gparted-eu \
locale-gparted-fa \
locale-gparted-fi \
locale-gparted-fr \
locale-gparted-fur \
locale-gparted-gd \
locale-gparted-gl \
locale-gparted-gu \
locale-gparted-he \
locale-gparted-hi \
locale-gparted-hr \
locale-gparted-hu \
locale-gparted-id \
locale-gparted-is \
locale-gparted-it \
locale-gparted-ja \
locale-gparted-ka \
locale-gparted-kk \
locale-gparted-ko \
locale-gparted-lt \
locale-gparted-lv \
locale-gparted-mk \
locale-gparted-ml \
locale-gparted-nb \
locale-gparted-ne \
locale-gparted-nl \
locale-gparted-nn \
locale-gparted-oc \
locale-gparted-pa \
locale-gparted-pl \
locale-gparted-pt \
locale-gparted-pt-BR \
locale-gparted-ro \
locale-gparted-ru \
locale-gparted-si \
locale-gparted-sk \
locale-gparted-sl \
locale-gparted-sr \
locale-gparted-sr@latin \
locale-gparted-sv \
locale-gparted-te \
locale-gparted-th \
locale-gparted-tr \
locale-gparted-uk \
locale-gparted-vi \
locale-gparted-zh-CN \
locale-gparted-zh-HK \
locale-gparted-zh-TW"

RDEPENDS:${PN} += "gparted"

inherit rpm
