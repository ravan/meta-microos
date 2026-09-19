SUMMARY = "Translations for package ksshaskpass6"
DESCRIPTION = "Provides translations for the 'ksshaskpass6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "ksshaskpass6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "012d1b10795df5ef8a94343d5320ffe4aa716c10bc284cfe7e5e6a098d4df90eeff425f317ca042c05386ed17298da9ac42bdaf31751168c4ca0c48e10330cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksshaskpass6-lang \
ksshaskpass6-lang-all \
locale-ksshaskpass6-ar \
locale-ksshaskpass6-ast \
locale-ksshaskpass6-bg \
locale-ksshaskpass6-bs \
locale-ksshaskpass6-ca \
locale-ksshaskpass6-ca@valencia \
locale-ksshaskpass6-cs \
locale-ksshaskpass6-da \
locale-ksshaskpass6-de \
locale-ksshaskpass6-el \
locale-ksshaskpass6-en-GB \
locale-ksshaskpass6-eo \
locale-ksshaskpass6-es \
locale-ksshaskpass6-et \
locale-ksshaskpass6-eu \
locale-ksshaskpass6-fi \
locale-ksshaskpass6-fr \
locale-ksshaskpass6-ga \
locale-ksshaskpass6-gl \
locale-ksshaskpass6-he \
locale-ksshaskpass6-hi \
locale-ksshaskpass6-hu \
locale-ksshaskpass6-ia \
locale-ksshaskpass6-id \
locale-ksshaskpass6-is \
locale-ksshaskpass6-it \
locale-ksshaskpass6-ja \
locale-ksshaskpass6-ka \
locale-ksshaskpass6-ko \
locale-ksshaskpass6-lt \
locale-ksshaskpass6-lv \
locale-ksshaskpass6-ml \
locale-ksshaskpass6-nb \
locale-ksshaskpass6-nl \
locale-ksshaskpass6-nn \
locale-ksshaskpass6-pa \
locale-ksshaskpass6-pl \
locale-ksshaskpass6-pt \
locale-ksshaskpass6-pt-BR \
locale-ksshaskpass6-ro \
locale-ksshaskpass6-ru \
locale-ksshaskpass6-sk \
locale-ksshaskpass6-sl \
locale-ksshaskpass6-sr \
locale-ksshaskpass6-sr@ijekavian \
locale-ksshaskpass6-sr@ijekavianlatin \
locale-ksshaskpass6-sr@latin \
locale-ksshaskpass6-sv \
locale-ksshaskpass6-tr \
locale-ksshaskpass6-uk \
locale-ksshaskpass6-vi \
locale-ksshaskpass6-zh-CN \
locale-ksshaskpass6-zh-TW"

RDEPENDS:${PN} += "ksshaskpass6"

inherit rpm
