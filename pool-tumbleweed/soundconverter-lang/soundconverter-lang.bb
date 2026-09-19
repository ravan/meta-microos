SUMMARY = "Translations for package soundconverter"
DESCRIPTION = "Provides translations for the 'soundconverter' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "soundconverter-lang-4.0.5-2.2.noarch.rpm"
RPM_HASH = "882ef0748b9f6dc75a985e6a2a0a9bf1783aba5351daabb5b45db2e7faf2b908f19bec4ea324afff3f08548f36e74ad0c5227a67a5593a493591b2740d4b03b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-soundconverter-ar \
locale-soundconverter-ast \
locale-soundconverter-bg \
locale-soundconverter-br \
locale-soundconverter-ca \
locale-soundconverter-cs \
locale-soundconverter-da \
locale-soundconverter-de \
locale-soundconverter-el \
locale-soundconverter-en-AU \
locale-soundconverter-en-CA \
locale-soundconverter-en-GB \
locale-soundconverter-eo \
locale-soundconverter-es \
locale-soundconverter-et \
locale-soundconverter-eu \
locale-soundconverter-fa \
locale-soundconverter-fi \
locale-soundconverter-fr \
locale-soundconverter-fr-CA \
locale-soundconverter-fr-FR \
locale-soundconverter-gl \
locale-soundconverter-he \
locale-soundconverter-hi \
locale-soundconverter-hu \
locale-soundconverter-it \
locale-soundconverter-ja \
locale-soundconverter-ka \
locale-soundconverter-ko \
locale-soundconverter-lt \
locale-soundconverter-lv \
locale-soundconverter-ml \
locale-soundconverter-ms \
locale-soundconverter-nb \
locale-soundconverter-nl \
locale-soundconverter-oc \
locale-soundconverter-pl \
locale-soundconverter-pt \
locale-soundconverter-pt-BR \
locale-soundconverter-ro \
locale-soundconverter-ru \
locale-soundconverter-sk \
locale-soundconverter-sl \
locale-soundconverter-sq \
locale-soundconverter-sr \
locale-soundconverter-sr@latin \
locale-soundconverter-sv \
locale-soundconverter-te \
locale-soundconverter-tr \
locale-soundconverter-uk \
locale-soundconverter-vi \
locale-soundconverter-zh-CN \
locale-soundconverter-zh-TW \
soundconverter-lang \
soundconverter-lang-all"

RDEPENDS:${PN} += "soundconverter"

inherit rpm
