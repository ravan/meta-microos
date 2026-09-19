SUMMARY = "Translations for package aurorae6"
DESCRIPTION = "Provides translations for the 'aurorae6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "aurorae6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "974d2a486ba1168cbbf38d77007ba566ba44c1d86729797476f50c719c570995ce0658583bef7aa8f1ce600ca574a4a83b1eadff73d686b91c8b9d5a6c4c92da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aurorae6-lang \
aurorae6-lang-all \
locale-aurorae6-ar \
locale-aurorae6-ca \
locale-aurorae6-ca@valencia \
locale-aurorae6-cs \
locale-aurorae6-de \
locale-aurorae6-en-GB \
locale-aurorae6-es \
locale-aurorae6-eu \
locale-aurorae6-fi \
locale-aurorae6-fr \
locale-aurorae6-ga \
locale-aurorae6-gl \
locale-aurorae6-he \
locale-aurorae6-hu \
locale-aurorae6-ia \
locale-aurorae6-it \
locale-aurorae6-ja \
locale-aurorae6-ka \
locale-aurorae6-ko \
locale-aurorae6-lt \
locale-aurorae6-lv \
locale-aurorae6-nb \
locale-aurorae6-nl \
locale-aurorae6-nn \
locale-aurorae6-pl \
locale-aurorae6-pt-BR \
locale-aurorae6-ro \
locale-aurorae6-ru \
locale-aurorae6-sk \
locale-aurorae6-sl \
locale-aurorae6-sv \
locale-aurorae6-tr \
locale-aurorae6-uk \
locale-aurorae6-zh-CN \
locale-aurorae6-zh-TW"

RDEPENDS:${PN} += "aurorae6"

inherit rpm
