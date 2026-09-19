SUMMARY = "Translations for package dnf4"
DESCRIPTION = "Provides translations for the 'dnf4' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.23.0"

RPM_NAME = "dnf4-lang-4.23.0-2.4.noarch.rpm"
RPM_HASH = "b09474a40c9b6856485d868d23b5481671f91194155961767bb7cdfe16694e35970e0663143ba81338e9865704d060c830032c58e8f30b35667a4d1aa9fa7ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf4-lang \
dnf4-lang-all \
locale-dnf4-ar \
locale-dnf4-be \
locale-dnf4-bg \
locale-dnf4-bn \
locale-dnf4-bn-IN \
locale-dnf4-ca \
locale-dnf4-cs \
locale-dnf4-da \
locale-dnf4-de \
locale-dnf4-el \
locale-dnf4-en-GB \
locale-dnf4-eo \
locale-dnf4-es \
locale-dnf4-eu \
locale-dnf4-fa \
locale-dnf4-fi \
locale-dnf4-fr \
locale-dnf4-fur \
locale-dnf4-gd \
locale-dnf4-gu \
locale-dnf4-he \
locale-dnf4-hi \
locale-dnf4-hr \
locale-dnf4-hu \
locale-dnf4-id \
locale-dnf4-it \
locale-dnf4-ja \
locale-dnf4-ka \
locale-dnf4-kk \
locale-dnf4-ko \
locale-dnf4-lt \
locale-dnf4-ml \
locale-dnf4-mr \
locale-dnf4-ms \
locale-dnf4-nb \
locale-dnf4-nl \
locale-dnf4-or \
locale-dnf4-pa \
locale-dnf4-pl \
locale-dnf4-pt \
locale-dnf4-pt-BR \
locale-dnf4-ru \
locale-dnf4-si \
locale-dnf4-sk \
locale-dnf4-sl \
locale-dnf4-sq \
locale-dnf4-sr \
locale-dnf4-sr@latin \
locale-dnf4-sv \
locale-dnf4-th \
locale-dnf4-tr \
locale-dnf4-uk \
locale-dnf4-vi \
locale-dnf4-zh-CN \
locale-dnf4-zh-Hans \
locale-dnf4-zh-TW"

RDEPENDS:${PN} += "dnf4"

inherit rpm
