SUMMARY = "Translations for package palette"
DESCRIPTION = "Provides translations for the 'palette' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "palette-lang-4.0.0-2.9.noarch.rpm"
RPM_HASH = "a7c8afb2a4198a24360a207fb083f338f0efdfaa6344740cfd9b31f28e906c2eea38f899fc5576ecd8cd6880385e760beb45111c8cf097cab7f391fcb528c507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-palette-af \
locale-palette-ar \
locale-palette-as \
locale-palette-ast \
locale-palette-az \
locale-palette-be \
locale-palette-bg \
locale-palette-bn \
locale-palette-br \
locale-palette-bs \
locale-palette-ca \
locale-palette-cs \
locale-palette-cy \
locale-palette-da \
locale-palette-de \
locale-palette-dz \
locale-palette-el \
locale-palette-en-AU \
locale-palette-en-CA \
locale-palette-en-GB \
locale-palette-eo \
locale-palette-es \
locale-palette-et \
locale-palette-eu \
locale-palette-fa \
locale-palette-fi \
locale-palette-fr \
locale-palette-fr-CA \
locale-palette-ga \
locale-palette-gd \
locale-palette-gl \
locale-palette-gu \
locale-palette-he \
locale-palette-hi \
locale-palette-hr \
locale-palette-hu \
locale-palette-ia \
locale-palette-id \
locale-palette-is \
locale-palette-it \
locale-palette-ja \
locale-palette-ka \
locale-palette-kk \
locale-palette-km \
locale-palette-kn \
locale-palette-ko \
locale-palette-lt \
locale-palette-lv \
locale-palette-mk \
locale-palette-ml \
locale-palette-mr \
locale-palette-ms \
locale-palette-nb \
locale-palette-ne \
locale-palette-nl \
locale-palette-nn \
locale-palette-oc \
locale-palette-or \
locale-palette-pa \
locale-palette-pl \
locale-palette-pt \
locale-palette-pt-BR \
locale-palette-ro \
locale-palette-ru \
locale-palette-si \
locale-palette-sk \
locale-palette-sl \
locale-palette-sq \
locale-palette-sr \
locale-palette-sv \
locale-palette-ta \
locale-palette-te \
locale-palette-th \
locale-palette-tr \
locale-palette-ug \
locale-palette-uk \
locale-palette-vi \
locale-palette-wa \
locale-palette-zh \
locale-palette-zh-CN \
locale-palette-zh-HK \
locale-palette-zh-TW \
palette-lang \
palette-lang-all"

RDEPENDS:${PN} += "palette"

inherit rpm
