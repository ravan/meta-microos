SUMMARY = "Translations for package planify"
DESCRIPTION = "Provides translations for the 'planify' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.5"

RPM_NAME = "planify-lang-4.19.5-1.1.noarch.rpm"
RPM_HASH = "a8874b563630a9d5bf5ed75fec92cb98d82380217a6f24157597d41de567d7d7cfc4bc5a3174841d1d72836a5f4de87d3c4e4df884efacf33b39adee85ac655e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-planify-af \
locale-planify-ar \
locale-planify-az \
locale-planify-be \
locale-planify-bg \
locale-planify-bn \
locale-planify-bs \
locale-planify-ca \
locale-planify-cs \
locale-planify-da \
locale-planify-de \
locale-planify-el \
locale-planify-en-GB \
locale-planify-eo \
locale-planify-es \
locale-planify-et \
locale-planify-eu \
locale-planify-fa \
locale-planify-fi \
locale-planify-fr \
locale-planify-ga \
locale-planify-gl \
locale-planify-he \
locale-planify-hi \
locale-planify-hr \
locale-planify-hu \
locale-planify-id \
locale-planify-is \
locale-planify-it \
locale-planify-ja \
locale-planify-ka \
locale-planify-kk \
locale-planify-kn \
locale-planify-ko \
locale-planify-lt \
locale-planify-lv \
locale-planify-mk \
locale-planify-mr \
locale-planify-ms \
locale-planify-nb \
locale-planify-nl \
locale-planify-nn \
locale-planify-pa \
locale-planify-pl \
locale-planify-pt-BR \
locale-planify-pt-PT \
locale-planify-ro \
locale-planify-ru \
locale-planify-si \
locale-planify-sk \
locale-planify-sl \
locale-planify-sq \
locale-planify-sr \
locale-planify-sv \
locale-planify-ta \
locale-planify-te \
locale-planify-th \
locale-planify-tr \
locale-planify-ug \
locale-planify-uk \
locale-planify-vi \
locale-planify-zh \
locale-planify-zh-Hant \
planify-lang \
planify-lang-all"

RDEPENDS:${PN} += "planify"

inherit rpm
