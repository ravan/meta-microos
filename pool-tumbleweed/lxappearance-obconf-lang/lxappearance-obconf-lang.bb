SUMMARY = "Translations for package lxappearance-obconf"
DESCRIPTION = "Provides translations for the 'lxappearance-obconf' package."
LICENSE = "GPL-2.0"

PV = "0.2.3"

RPM_NAME = "lxappearance-obconf-lang-0.2.3-1.36.noarch.rpm"
RPM_HASH = "4edb0a49bc084d5cc5e3a18ab0369f93b82a89f6706fc770d8ac281a4656616224c0b97f08e62e802966e0511c82b2741a5cf9ef0ed462b43fc1758e39a29e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxappearance-obconf-ar \
locale-lxappearance-obconf-be \
locale-lxappearance-obconf-bg \
locale-lxappearance-obconf-bn-IN \
locale-lxappearance-obconf-ca \
locale-lxappearance-obconf-cs \
locale-lxappearance-obconf-da \
locale-lxappearance-obconf-de \
locale-lxappearance-obconf-el \
locale-lxappearance-obconf-en-GB \
locale-lxappearance-obconf-es \
locale-lxappearance-obconf-et \
locale-lxappearance-obconf-eu \
locale-lxappearance-obconf-fa \
locale-lxappearance-obconf-fi \
locale-lxappearance-obconf-fr \
locale-lxappearance-obconf-gl \
locale-lxappearance-obconf-he \
locale-lxappearance-obconf-hr \
locale-lxappearance-obconf-hu \
locale-lxappearance-obconf-id \
locale-lxappearance-obconf-is \
locale-lxappearance-obconf-it \
locale-lxappearance-obconf-ja \
locale-lxappearance-obconf-kk \
locale-lxappearance-obconf-ko \
locale-lxappearance-obconf-lt \
locale-lxappearance-obconf-nb \
locale-lxappearance-obconf-nl \
locale-lxappearance-obconf-pa \
locale-lxappearance-obconf-pl \
locale-lxappearance-obconf-pt \
locale-lxappearance-obconf-pt-BR \
locale-lxappearance-obconf-ro \
locale-lxappearance-obconf-ru \
locale-lxappearance-obconf-sl \
locale-lxappearance-obconf-sr \
locale-lxappearance-obconf-sr@latin \
locale-lxappearance-obconf-sv \
locale-lxappearance-obconf-te \
locale-lxappearance-obconf-tr \
locale-lxappearance-obconf-ug \
locale-lxappearance-obconf-uk \
locale-lxappearance-obconf-vi \
locale-lxappearance-obconf-zh-CN \
locale-lxappearance-obconf-zh-TW \
lxappearance-obconf-lang \
lxappearance-obconf-lang-all"

RDEPENDS:${PN} += "lxappearance-obconf"

inherit rpm
