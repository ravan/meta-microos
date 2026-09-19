SUMMARY = "Translations for package libadwaita"
DESCRIPTION = "Provides translations for the 'libadwaita' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.3"

RPM_NAME = "libadwaita-lang-1.9.3-1.1.noarch.rpm"
RPM_HASH = "18ff8a2a61543d4c960f01be3050b309afe54a77321f5ad41fdef5844ca10bbe73ccafb2ab2654cee2df8184840e4985a34db354a1f742f97e92af473f04058e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-lang \
libadwaita-lang-all \
locale-libadwaita-be \
locale-libadwaita-bg \
locale-libadwaita-ca \
locale-libadwaita-cs \
locale-libadwaita-da \
locale-libadwaita-de \
locale-libadwaita-el \
locale-libadwaita-en-GB \
locale-libadwaita-eo \
locale-libadwaita-es \
locale-libadwaita-eu \
locale-libadwaita-fa \
locale-libadwaita-fi \
locale-libadwaita-fr \
locale-libadwaita-fur \
locale-libadwaita-gl \
locale-libadwaita-he \
locale-libadwaita-hi \
locale-libadwaita-hr \
locale-libadwaita-hu \
locale-libadwaita-ia \
locale-libadwaita-id \
locale-libadwaita-it \
locale-libadwaita-ja \
locale-libadwaita-ka \
locale-libadwaita-kk \
locale-libadwaita-ko \
locale-libadwaita-lt \
locale-libadwaita-lv \
locale-libadwaita-nb \
locale-libadwaita-ne \
locale-libadwaita-nl \
locale-libadwaita-nn \
locale-libadwaita-oc \
locale-libadwaita-pa \
locale-libadwaita-pl \
locale-libadwaita-pt \
locale-libadwaita-pt-BR \
locale-libadwaita-ro \
locale-libadwaita-ru \
locale-libadwaita-sk \
locale-libadwaita-sl \
locale-libadwaita-sr \
locale-libadwaita-sr@latin \
locale-libadwaita-sv \
locale-libadwaita-th \
locale-libadwaita-tr \
locale-libadwaita-ug \
locale-libadwaita-uk \
locale-libadwaita-vi \
locale-libadwaita-zh-CN \
locale-libadwaita-zh-TW"

RDEPENDS:${PN} += "libadwaita"

inherit rpm
