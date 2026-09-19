SUMMARY = "Translations for package bleachbit"
DESCRIPTION = "Provides translations for the 'bleachbit' package."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "bleachbit-lang-6.0.4-1.1.noarch.rpm"
RPM_HASH = "7b75ad963161f20fcc4b0ce7e2c7a1a97e9b5ab6f2c4acc83400a0226af833aa1e1d6a5a5431cdb1bfcd606de96b2e29a9673472ff6abb4ae6b5a10b2cd70326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bleachbit-lang \
bleachbit-lang-all \
locale-bleachbit-af \
locale-bleachbit-ar \
locale-bleachbit-ast \
locale-bleachbit-be \
locale-bleachbit-bg \
locale-bleachbit-bn \
locale-bleachbit-bs \
locale-bleachbit-ca \
locale-bleachbit-cs \
locale-bleachbit-da \
locale-bleachbit-de \
locale-bleachbit-el \
locale-bleachbit-en-AU \
locale-bleachbit-en-CA \
locale-bleachbit-en-GB \
locale-bleachbit-eo \
locale-bleachbit-es \
locale-bleachbit-et \
locale-bleachbit-eu \
locale-bleachbit-fa \
locale-bleachbit-fi \
locale-bleachbit-fr \
locale-bleachbit-ga \
locale-bleachbit-gl \
locale-bleachbit-he \
locale-bleachbit-hi \
locale-bleachbit-hr \
locale-bleachbit-hu \
locale-bleachbit-id \
locale-bleachbit-it \
locale-bleachbit-ja \
locale-bleachbit-ka \
locale-bleachbit-kk \
locale-bleachbit-ko \
locale-bleachbit-lt \
locale-bleachbit-lv \
locale-bleachbit-ms \
locale-bleachbit-nb \
locale-bleachbit-nl \
locale-bleachbit-pl \
locale-bleachbit-pt \
locale-bleachbit-pt-BR \
locale-bleachbit-ro \
locale-bleachbit-ru \
locale-bleachbit-si \
locale-bleachbit-sk \
locale-bleachbit-sl \
locale-bleachbit-sq \
locale-bleachbit-sr \
locale-bleachbit-sv \
locale-bleachbit-ta \
locale-bleachbit-te \
locale-bleachbit-th \
locale-bleachbit-tr \
locale-bleachbit-uk \
locale-bleachbit-vi \
locale-bleachbit-zh-CN \
locale-bleachbit-zh-TW"

RDEPENDS:${PN} += "bleachbit"

inherit rpm
