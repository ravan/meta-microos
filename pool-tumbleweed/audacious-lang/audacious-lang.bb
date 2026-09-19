SUMMARY = "Translations for package audacious"
DESCRIPTION = "Provides translations for the 'audacious' package."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "audacious-lang-4.6.1-1.3.noarch.rpm"
RPM_HASH = "68d62deea8e3eba2123e53f97bb637f40d3cb5b4de62940bd9a91a9c52596e8f3b3e5b02edd0aa5f91435388bb280297674801b5cf19e4e57e0e5233e3e0f6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacious-lang \
audacious-lang-all \
locale-audacious-af \
locale-audacious-ar \
locale-audacious-be \
locale-audacious-bg \
locale-audacious-ca \
locale-audacious-cs \
locale-audacious-da \
locale-audacious-de \
locale-audacious-el \
locale-audacious-en-GB \
locale-audacious-es \
locale-audacious-es-AR \
locale-audacious-es-MX \
locale-audacious-et \
locale-audacious-eu \
locale-audacious-fi \
locale-audacious-fr \
locale-audacious-gl \
locale-audacious-hu \
locale-audacious-it \
locale-audacious-ja \
locale-audacious-ka \
locale-audacious-ko \
locale-audacious-lt \
locale-audacious-lv \
locale-audacious-ms \
locale-audacious-nl \
locale-audacious-pl \
locale-audacious-pt-BR \
locale-audacious-pt-PT \
locale-audacious-ro \
locale-audacious-ru \
locale-audacious-si \
locale-audacious-sk \
locale-audacious-sl \
locale-audacious-sq \
locale-audacious-sr \
locale-audacious-sv \
locale-audacious-ta \
locale-audacious-tr \
locale-audacious-uk \
locale-audacious-zh-CN \
locale-audacious-zh-TW"

RDEPENDS:${PN} += "audacious"

inherit rpm
