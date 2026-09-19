SUMMARY = "Translations for package pantheon-settings-daemon"
DESCRIPTION = "Provides translations for the 'pantheon-settings-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.5.0"

RPM_NAME = "pantheon-settings-daemon-lang-8.5.0-1.4.noarch.rpm"
RPM_HASH = "29e6c6d97e398462880533804c88cadf37d394f89e29ebb149c244adf8b7f2434a37b02411a467f1f5711d47df698e4d2548b58e24273e100f1572fa341ae199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-settings-daemon-af \
locale-pantheon-settings-daemon-ar \
locale-pantheon-settings-daemon-as \
locale-pantheon-settings-daemon-ast \
locale-pantheon-settings-daemon-az \
locale-pantheon-settings-daemon-be \
locale-pantheon-settings-daemon-bg \
locale-pantheon-settings-daemon-bn \
locale-pantheon-settings-daemon-br \
locale-pantheon-settings-daemon-bs \
locale-pantheon-settings-daemon-ca \
locale-pantheon-settings-daemon-ca@valencia \
locale-pantheon-settings-daemon-cs \
locale-pantheon-settings-daemon-cy \
locale-pantheon-settings-daemon-da \
locale-pantheon-settings-daemon-de \
locale-pantheon-settings-daemon-dz \
locale-pantheon-settings-daemon-el \
locale-pantheon-settings-daemon-en-AU \
locale-pantheon-settings-daemon-en-CA \
locale-pantheon-settings-daemon-en-GB \
locale-pantheon-settings-daemon-eo \
locale-pantheon-settings-daemon-es \
locale-pantheon-settings-daemon-et \
locale-pantheon-settings-daemon-eu \
locale-pantheon-settings-daemon-fa \
locale-pantheon-settings-daemon-fi \
locale-pantheon-settings-daemon-fr \
locale-pantheon-settings-daemon-fr-CA \
locale-pantheon-settings-daemon-ga \
locale-pantheon-settings-daemon-gd \
locale-pantheon-settings-daemon-gl \
locale-pantheon-settings-daemon-gu \
locale-pantheon-settings-daemon-he \
locale-pantheon-settings-daemon-hi \
locale-pantheon-settings-daemon-hr \
locale-pantheon-settings-daemon-hu \
locale-pantheon-settings-daemon-ia \
locale-pantheon-settings-daemon-id \
locale-pantheon-settings-daemon-is \
locale-pantheon-settings-daemon-it \
locale-pantheon-settings-daemon-ja \
locale-pantheon-settings-daemon-ka \
locale-pantheon-settings-daemon-kk \
locale-pantheon-settings-daemon-km \
locale-pantheon-settings-daemon-kn \
locale-pantheon-settings-daemon-ko \
locale-pantheon-settings-daemon-lt \
locale-pantheon-settings-daemon-lv \
locale-pantheon-settings-daemon-mk \
locale-pantheon-settings-daemon-ml \
locale-pantheon-settings-daemon-mr \
locale-pantheon-settings-daemon-ms \
locale-pantheon-settings-daemon-nb \
locale-pantheon-settings-daemon-ne \
locale-pantheon-settings-daemon-nl \
locale-pantheon-settings-daemon-nn \
locale-pantheon-settings-daemon-oc \
locale-pantheon-settings-daemon-or \
locale-pantheon-settings-daemon-pa \
locale-pantheon-settings-daemon-pl \
locale-pantheon-settings-daemon-pt \
locale-pantheon-settings-daemon-pt-BR \
locale-pantheon-settings-daemon-ro \
locale-pantheon-settings-daemon-ru \
locale-pantheon-settings-daemon-si \
locale-pantheon-settings-daemon-sk \
locale-pantheon-settings-daemon-sl \
locale-pantheon-settings-daemon-sq \
locale-pantheon-settings-daemon-sr \
locale-pantheon-settings-daemon-sr@latin \
locale-pantheon-settings-daemon-sv \
locale-pantheon-settings-daemon-ta \
locale-pantheon-settings-daemon-te \
locale-pantheon-settings-daemon-th \
locale-pantheon-settings-daemon-tr \
locale-pantheon-settings-daemon-ug \
locale-pantheon-settings-daemon-uk \
locale-pantheon-settings-daemon-vi \
locale-pantheon-settings-daemon-wa \
locale-pantheon-settings-daemon-zh \
locale-pantheon-settings-daemon-zh-CN \
locale-pantheon-settings-daemon-zh-HK \
locale-pantheon-settings-daemon-zh-TW \
pantheon-settings-daemon-lang \
pantheon-settings-daemon-lang-all"

RDEPENDS:${PN} += "pantheon-settings-daemon"

inherit rpm
