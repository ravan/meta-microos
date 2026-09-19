SUMMARY = "Translations for package xfce4-calculator-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-calculator-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "xfce4-calculator-plugin-lang-0.8.0-1.4.noarch.rpm"
RPM_HASH = "427b5446a8aab726821787d3db36849145365a446d159b3c5f7afa061218a9a2ccbb16801d000ec50936b171c8e623d69a2acaec7f29dcfb3292dbbcb35b1ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-calculator-plugin-be \
locale-xfce4-calculator-plugin-bg \
locale-xfce4-calculator-plugin-ca \
locale-xfce4-calculator-plugin-cs \
locale-xfce4-calculator-plugin-da \
locale-xfce4-calculator-plugin-de \
locale-xfce4-calculator-plugin-el \
locale-xfce4-calculator-plugin-en-AU \
locale-xfce4-calculator-plugin-en-CA \
locale-xfce4-calculator-plugin-en-GB \
locale-xfce4-calculator-plugin-es \
locale-xfce4-calculator-plugin-et \
locale-xfce4-calculator-plugin-eu \
locale-xfce4-calculator-plugin-fi \
locale-xfce4-calculator-plugin-fr \
locale-xfce4-calculator-plugin-gl \
locale-xfce4-calculator-plugin-he \
locale-xfce4-calculator-plugin-hi \
locale-xfce4-calculator-plugin-hr \
locale-xfce4-calculator-plugin-hu \
locale-xfce4-calculator-plugin-id \
locale-xfce4-calculator-plugin-is \
locale-xfce4-calculator-plugin-it \
locale-xfce4-calculator-plugin-ja \
locale-xfce4-calculator-plugin-ko \
locale-xfce4-calculator-plugin-lt \
locale-xfce4-calculator-plugin-ms \
locale-xfce4-calculator-plugin-nb \
locale-xfce4-calculator-plugin-nl \
locale-xfce4-calculator-plugin-pl \
locale-xfce4-calculator-plugin-pt \
locale-xfce4-calculator-plugin-pt-BR \
locale-xfce4-calculator-plugin-ro \
locale-xfce4-calculator-plugin-ru \
locale-xfce4-calculator-plugin-sk \
locale-xfce4-calculator-plugin-sl \
locale-xfce4-calculator-plugin-sq \
locale-xfce4-calculator-plugin-sr \
locale-xfce4-calculator-plugin-sv \
locale-xfce4-calculator-plugin-tr \
locale-xfce4-calculator-plugin-uk \
locale-xfce4-calculator-plugin-vi \
locale-xfce4-calculator-plugin-zh-CN \
locale-xfce4-calculator-plugin-zh-TW \
xfce4-calculator-plugin-lang \
xfce4-calculator-plugin-lang-all \
xfce4-panel-plugin-calculator-lang"

RDEPENDS:${PN} += "xfce4-calculator-plugin"

inherit rpm
