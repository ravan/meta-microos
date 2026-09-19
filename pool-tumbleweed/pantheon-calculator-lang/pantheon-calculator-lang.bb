SUMMARY = "Translations for package pantheon-calculator"
DESCRIPTION = "Provides translations for the 'pantheon-calculator' package."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "pantheon-calculator-lang-8.0.1-1.4.noarch.rpm"
RPM_HASH = "f8893ec145dd52ea69c80583fb7cd83af300f18fad8cda8ca592aa2628e9302c5047ab6b2aac7ba09a0228bd1fa5401ec79894b3505fa44747ac6b7561513f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-calculator-af \
locale-pantheon-calculator-ar \
locale-pantheon-calculator-az \
locale-pantheon-calculator-be \
locale-pantheon-calculator-bg \
locale-pantheon-calculator-bn \
locale-pantheon-calculator-bs \
locale-pantheon-calculator-ca \
locale-pantheon-calculator-cs \
locale-pantheon-calculator-da \
locale-pantheon-calculator-de \
locale-pantheon-calculator-el \
locale-pantheon-calculator-en-AU \
locale-pantheon-calculator-en-CA \
locale-pantheon-calculator-en-GB \
locale-pantheon-calculator-eo \
locale-pantheon-calculator-es \
locale-pantheon-calculator-et \
locale-pantheon-calculator-eu \
locale-pantheon-calculator-fa \
locale-pantheon-calculator-fi \
locale-pantheon-calculator-fr \
locale-pantheon-calculator-fr-CA \
locale-pantheon-calculator-ga \
locale-pantheon-calculator-gl \
locale-pantheon-calculator-he \
locale-pantheon-calculator-hi \
locale-pantheon-calculator-hr \
locale-pantheon-calculator-hu \
locale-pantheon-calculator-id \
locale-pantheon-calculator-is \
locale-pantheon-calculator-it \
locale-pantheon-calculator-ja \
locale-pantheon-calculator-ka \
locale-pantheon-calculator-kn \
locale-pantheon-calculator-ko \
locale-pantheon-calculator-lt \
locale-pantheon-calculator-lv \
locale-pantheon-calculator-mk \
locale-pantheon-calculator-mr \
locale-pantheon-calculator-ms \
locale-pantheon-calculator-nb \
locale-pantheon-calculator-nb-NO \
locale-pantheon-calculator-nl \
locale-pantheon-calculator-nn \
locale-pantheon-calculator-pa \
locale-pantheon-calculator-pl \
locale-pantheon-calculator-pt \
locale-pantheon-calculator-pt-BR \
locale-pantheon-calculator-ro \
locale-pantheon-calculator-ru \
locale-pantheon-calculator-si \
locale-pantheon-calculator-sk \
locale-pantheon-calculator-sl \
locale-pantheon-calculator-sq \
locale-pantheon-calculator-sr \
locale-pantheon-calculator-sv \
locale-pantheon-calculator-ta \
locale-pantheon-calculator-te \
locale-pantheon-calculator-th \
locale-pantheon-calculator-tr \
locale-pantheon-calculator-ug \
locale-pantheon-calculator-uk \
locale-pantheon-calculator-vi \
locale-pantheon-calculator-zh \
locale-pantheon-calculator-zh-CN \
locale-pantheon-calculator-zh-TW \
pantheon-calculator-lang \
pantheon-calculator-lang-all"

RDEPENDS:${PN} += "pantheon-calculator"

inherit rpm
