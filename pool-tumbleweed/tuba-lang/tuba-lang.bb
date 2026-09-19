SUMMARY = "Translations for package tuba"
DESCRIPTION = "Provides translations for the 'tuba' package."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "tuba-lang-0.11.0-1.1.noarch.rpm"
RPM_HASH = "c8067411530e5362f00ced9cfd12621bb3ad555eec133ab4362ef5a31d5b1899cd9cfbf9bf4075928dceaf0f7528307c2974e06c2004978b911f1a7c9a3571f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tuba-ar \
locale-tuba-be \
locale-tuba-bg \
locale-tuba-ca \
locale-tuba-cs \
locale-tuba-cy \
locale-tuba-da \
locale-tuba-de-DE \
locale-tuba-el \
locale-tuba-en-GB \
locale-tuba-eo \
locale-tuba-es \
locale-tuba-et \
locale-tuba-eu \
locale-tuba-fa \
locale-tuba-fi \
locale-tuba-fr \
locale-tuba-gl \
locale-tuba-he \
locale-tuba-hi \
locale-tuba-hr \
locale-tuba-hu \
locale-tuba-ia \
locale-tuba-id \
locale-tuba-it \
locale-tuba-ja \
locale-tuba-ka \
locale-tuba-ko \
locale-tuba-lt \
locale-tuba-nb-NO \
locale-tuba-nl \
locale-tuba-nn \
locale-tuba-oc \
locale-tuba-pl \
locale-tuba-pt \
locale-tuba-pt-BR \
locale-tuba-ru \
locale-tuba-sk \
locale-tuba-sv \
locale-tuba-ta \
locale-tuba-th \
locale-tuba-tr \
locale-tuba-uk \
locale-tuba-zh-CN \
locale-tuba-zh-Hant \
tuba-lang \
tuba-lang-all"

RDEPENDS:${PN} += "tuba"

inherit rpm
