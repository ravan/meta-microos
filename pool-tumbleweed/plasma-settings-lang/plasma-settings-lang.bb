SUMMARY = "Translations for package plasma-settings"
DESCRIPTION = "Provides translations for the 'plasma-settings' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-settings-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4b07f0145e808019fbc8fdbef877ee41501d0620268b9d2a290a0d00a45c4f74eaa6ed31ddb561263fd64b31c9b1ab0e918404a309b0fdb5b5c247e176b96883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-settings-ar \
locale-plasma-settings-ast \
locale-plasma-settings-az \
locale-plasma-settings-be \
locale-plasma-settings-ca \
locale-plasma-settings-ca@valencia \
locale-plasma-settings-cs \
locale-plasma-settings-da \
locale-plasma-settings-de \
locale-plasma-settings-el \
locale-plasma-settings-en-GB \
locale-plasma-settings-eo \
locale-plasma-settings-es \
locale-plasma-settings-et \
locale-plasma-settings-eu \
locale-plasma-settings-fi \
locale-plasma-settings-fr \
locale-plasma-settings-ga \
locale-plasma-settings-gl \
locale-plasma-settings-he \
locale-plasma-settings-hi \
locale-plasma-settings-hu \
locale-plasma-settings-ia \
locale-plasma-settings-id \
locale-plasma-settings-is \
locale-plasma-settings-it \
locale-plasma-settings-ja \
locale-plasma-settings-ka \
locale-plasma-settings-ko \
locale-plasma-settings-lt \
locale-plasma-settings-lv \
locale-plasma-settings-nl \
locale-plasma-settings-nn \
locale-plasma-settings-pa \
locale-plasma-settings-pl \
locale-plasma-settings-pt \
locale-plasma-settings-pt-BR \
locale-plasma-settings-ro \
locale-plasma-settings-ru \
locale-plasma-settings-sk \
locale-plasma-settings-sl \
locale-plasma-settings-sv \
locale-plasma-settings-ta \
locale-plasma-settings-th \
locale-plasma-settings-tr \
locale-plasma-settings-ug \
locale-plasma-settings-uk \
locale-plasma-settings-vi \
locale-plasma-settings-zh-CN \
locale-plasma-settings-zh-TW \
plasma-settings-lang \
plasma-settings-lang-all"

RDEPENDS:${PN} += "plasma-settings"

inherit rpm
