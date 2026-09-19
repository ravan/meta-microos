SUMMARY = "Translations for package audacious-plugins"
DESCRIPTION = "Provides translations for the 'audacious-plugins' package."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-only & MIT"

PV = "4.6.1"

RPM_NAME = "audacious-plugins-lang-4.6.1-1.2.noarch.rpm"
RPM_HASH = "01b109342c1e7c2c4819ae15b2bb552ae497dd8cc6f24b3dda4418ed42cabeb8c193976b6d852ca1e7ef275cf46aaccaf9954d8826a696de247fa61e799591dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacious-plugins-lang \
audacious-plugins-lang-all \
locale-audacious-plugins-af \
locale-audacious-plugins-ar \
locale-audacious-plugins-be \
locale-audacious-plugins-bg \
locale-audacious-plugins-ca \
locale-audacious-plugins-cs \
locale-audacious-plugins-da \
locale-audacious-plugins-de \
locale-audacious-plugins-el \
locale-audacious-plugins-en-GB \
locale-audacious-plugins-es \
locale-audacious-plugins-es-AR \
locale-audacious-plugins-es-MX \
locale-audacious-plugins-et \
locale-audacious-plugins-eu \
locale-audacious-plugins-fi \
locale-audacious-plugins-fr \
locale-audacious-plugins-gl \
locale-audacious-plugins-hu \
locale-audacious-plugins-it \
locale-audacious-plugins-ja \
locale-audacious-plugins-ka \
locale-audacious-plugins-ko \
locale-audacious-plugins-lt \
locale-audacious-plugins-lv \
locale-audacious-plugins-ms \
locale-audacious-plugins-nl \
locale-audacious-plugins-pl \
locale-audacious-plugins-pt-BR \
locale-audacious-plugins-pt-PT \
locale-audacious-plugins-ro \
locale-audacious-plugins-ru \
locale-audacious-plugins-si \
locale-audacious-plugins-sk \
locale-audacious-plugins-sl \
locale-audacious-plugins-sq \
locale-audacious-plugins-sr \
locale-audacious-plugins-sv \
locale-audacious-plugins-ta \
locale-audacious-plugins-tr \
locale-audacious-plugins-uk \
locale-audacious-plugins-zh-CN \
locale-audacious-plugins-zh-TW"

RDEPENDS:${PN} += "audacious-plugins"

inherit rpm
