SUMMARY = "Translations for package aria2"
DESCRIPTION = "Provides translations for the 'aria2' package."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception"

PV = "1.37.0"

RPM_NAME = "aria2-lang-1.37.0-2.2.noarch.rpm"
RPM_HASH = "5e3ddea748ea9de45d78ebb785f052a38a913f5aec263e1ab1eee4c9c3ed8050f25d1dfc6a3f9c9c142b18bce65b244510f1c249ff3e89b7144b6632e181804f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aria2-lang \
aria2-lang-all \
locale-aria2-ar \
locale-aria2-bg \
locale-aria2-bn \
locale-aria2-ca \
locale-aria2-da \
locale-aria2-de \
locale-aria2-el \
locale-aria2-en@boldquot \
locale-aria2-en@quot \
locale-aria2-es \
locale-aria2-fa \
locale-aria2-fi \
locale-aria2-fr \
locale-aria2-he \
locale-aria2-hr \
locale-aria2-hu \
locale-aria2-id \
locale-aria2-it \
locale-aria2-ja \
locale-aria2-kk \
locale-aria2-ko \
locale-aria2-ms \
locale-aria2-nb \
locale-aria2-nl \
locale-aria2-nn \
locale-aria2-oc \
locale-aria2-pl \
locale-aria2-pt \
locale-aria2-pt-BR \
locale-aria2-ro \
locale-aria2-ru \
locale-aria2-sk \
locale-aria2-sr \
locale-aria2-sv \
locale-aria2-th \
locale-aria2-tr \
locale-aria2-uk \
locale-aria2-vi \
locale-aria2-zh-CN \
locale-aria2-zh-HK \
locale-aria2-zh-TW"

RDEPENDS:${PN} += "aria2"

inherit rpm
