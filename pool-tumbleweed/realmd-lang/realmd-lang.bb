SUMMARY = "Translations for package realmd"
DESCRIPTION = "Provides translations for the 'realmd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.1"

RPM_NAME = "realmd-lang-0.17.1-4.8.noarch.rpm"
RPM_HASH = "f6a8743c5d8cba5fbe0fcbcdcf2029d3e4d3864fefe013a0460348d4de047e097318eb9eb5432b962bd8e909c6f2e5c9b90d0e0d4968d35117dedeef779dfdc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-realmd-ar \
locale-realmd-as \
locale-realmd-az \
locale-realmd-bg \
locale-realmd-bn-IN \
locale-realmd-ca \
locale-realmd-ca@valencia \
locale-realmd-cs \
locale-realmd-cy \
locale-realmd-da \
locale-realmd-de \
locale-realmd-el \
locale-realmd-en-GB \
locale-realmd-eo \
locale-realmd-es \
locale-realmd-et \
locale-realmd-eu \
locale-realmd-fa \
locale-realmd-fi \
locale-realmd-fr \
locale-realmd-ga \
locale-realmd-gl \
locale-realmd-gu \
locale-realmd-he \
locale-realmd-hi \
locale-realmd-hr \
locale-realmd-hu \
locale-realmd-ia \
locale-realmd-id \
locale-realmd-it \
locale-realmd-ja \
locale-realmd-ka \
locale-realmd-kk \
locale-realmd-kn \
locale-realmd-ko \
locale-realmd-lt \
locale-realmd-lv \
locale-realmd-ml \
locale-realmd-mr \
locale-realmd-ms \
locale-realmd-nb \
locale-realmd-nl \
locale-realmd-nn \
locale-realmd-oc \
locale-realmd-or \
locale-realmd-pa \
locale-realmd-pl \
locale-realmd-pt \
locale-realmd-pt-BR \
locale-realmd-ro \
locale-realmd-ru \
locale-realmd-si \
locale-realmd-sk \
locale-realmd-sl \
locale-realmd-sq \
locale-realmd-sr@latin \
locale-realmd-sv \
locale-realmd-ta \
locale-realmd-te \
locale-realmd-th \
locale-realmd-tr \
locale-realmd-uk \
locale-realmd-vi \
locale-realmd-wa \
locale-realmd-zh-CN \
locale-realmd-zh-HK \
locale-realmd-zh-TW \
realmd-lang \
realmd-lang-all"

RDEPENDS:${PN} += "realmd"

inherit rpm
