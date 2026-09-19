SUMMARY = "Translations for package kup-backup"
DESCRIPTION = "Provides translations for the 'kup-backup' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "kup-backup-lang-0.10.0-2.5.noarch.rpm"
RPM_HASH = "57f2daeb047ab65c87e58dc4270562d33f7695875d667382fb2798414fb5b40e33b01cc78d06b6879b0f9b2dd1e6b02cecf1fbf41897d2e78136ab3e4bf8e5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kup-backup-lang \
kup-backup-lang-all \
locale-kup-backup-ar \
locale-kup-backup-bg \
locale-kup-backup-bs \
locale-kup-backup-ca \
locale-kup-backup-ca@valencia \
locale-kup-backup-cs \
locale-kup-backup-da \
locale-kup-backup-de \
locale-kup-backup-en-GB \
locale-kup-backup-eo \
locale-kup-backup-es \
locale-kup-backup-et \
locale-kup-backup-eu \
locale-kup-backup-fi \
locale-kup-backup-fr \
locale-kup-backup-hu \
locale-kup-backup-it \
locale-kup-backup-ja \
locale-kup-backup-ka \
locale-kup-backup-ko \
locale-kup-backup-lt \
locale-kup-backup-nl \
locale-kup-backup-pl \
locale-kup-backup-pt \
locale-kup-backup-pt-BR \
locale-kup-backup-ru \
locale-kup-backup-sk \
locale-kup-backup-sl \
locale-kup-backup-sv \
locale-kup-backup-tr \
locale-kup-backup-uk \
locale-kup-backup-zh-CN \
locale-kup-backup-zh-TW"

RDEPENDS:${PN} += "kup-backup"

inherit rpm
