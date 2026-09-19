SUMMARY = "Translations for package screencast"
DESCRIPTION = "Provides translations for the 'screencast' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "screencast-lang-1.0.0-3.8.noarch.rpm"
RPM_HASH = "2901140fcede6c07fbf42d94d8c641840e11f749003b47b8665f91b8f96d7ab887600f007b0b495e3de89ba407c0a89a30119107b5d6d2f933184a49a7b4d873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-screencast-af \
locale-screencast-ar \
locale-screencast-as \
locale-screencast-ast \
locale-screencast-az \
locale-screencast-be \
locale-screencast-bg \
locale-screencast-bn \
locale-screencast-br \
locale-screencast-bs \
locale-screencast-ca \
locale-screencast-cs \
locale-screencast-cy \
locale-screencast-da \
locale-screencast-de \
locale-screencast-dz \
locale-screencast-el \
locale-screencast-en-AU \
locale-screencast-en-CA \
locale-screencast-en-GB \
locale-screencast-eo \
locale-screencast-es \
locale-screencast-et \
locale-screencast-eu \
locale-screencast-fa \
locale-screencast-fi \
locale-screencast-fr \
locale-screencast-fr-CA \
locale-screencast-ga \
locale-screencast-gd \
locale-screencast-gl \
locale-screencast-gu \
locale-screencast-he \
locale-screencast-hi \
locale-screencast-hr \
locale-screencast-hu \
locale-screencast-ia \
locale-screencast-id \
locale-screencast-is \
locale-screencast-it \
locale-screencast-ja \
locale-screencast-ka \
locale-screencast-kk \
locale-screencast-km \
locale-screencast-kn \
locale-screencast-ko \
locale-screencast-lt \
locale-screencast-lv \
locale-screencast-mk \
locale-screencast-ml \
locale-screencast-mr \
locale-screencast-ms \
locale-screencast-nb \
locale-screencast-ne \
locale-screencast-nl \
locale-screencast-nn \
locale-screencast-oc \
locale-screencast-or \
locale-screencast-pa \
locale-screencast-pl \
locale-screencast-pt \
locale-screencast-pt-BR \
locale-screencast-ro \
locale-screencast-ru \
locale-screencast-si \
locale-screencast-sk \
locale-screencast-sl \
locale-screencast-sq \
locale-screencast-sr \
locale-screencast-sv \
locale-screencast-ta \
locale-screencast-te \
locale-screencast-th \
locale-screencast-tr \
locale-screencast-ug \
locale-screencast-uk \
locale-screencast-vi \
locale-screencast-wa \
locale-screencast-zh \
locale-screencast-zh-HK \
locale-screencast-zh-TW \
screencast-lang \
screencast-lang-all"

RDEPENDS:${PN} += "screencast"

inherit rpm
