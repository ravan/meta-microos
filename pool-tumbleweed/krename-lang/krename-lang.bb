SUMMARY = "Translations for package krename"
DESCRIPTION = "Provides translations for the 'krename' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2git.20250321T014623~262bdbe"

RPM_NAME = "krename-lang-5.0.2git.20250321T014623~262bdbe-1.6.noarch.rpm"
RPM_HASH = "9501a68bf52f0bff080ebb63e579f95217e1be68204a35f7a9e5d4ebd70de1464f0625c6046bcdba38f072ff6f66e9ae6351a589f3cdf3782f311b7e82de17d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krename-lang \
krename-lang-all \
locale-krename-ar \
locale-krename-bs \
locale-krename-ca \
locale-krename-ca@valencia \
locale-krename-cs \
locale-krename-da \
locale-krename-de \
locale-krename-el \
locale-krename-en-GB \
locale-krename-eo \
locale-krename-es \
locale-krename-et \
locale-krename-eu \
locale-krename-fi \
locale-krename-fr \
locale-krename-gl \
locale-krename-hu \
locale-krename-ia \
locale-krename-id \
locale-krename-it \
locale-krename-ja \
locale-krename-ka \
locale-krename-ko \
locale-krename-lt \
locale-krename-nl \
locale-krename-nn \
locale-krename-pa \
locale-krename-pl \
locale-krename-pt \
locale-krename-pt-BR \
locale-krename-ro \
locale-krename-ru \
locale-krename-sk \
locale-krename-sl \
locale-krename-sv \
locale-krename-tr \
locale-krename-uk \
locale-krename-zh-CN \
locale-krename-zh-TW"

RDEPENDS:${PN} += "krename"

inherit rpm
