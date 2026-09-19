SUMMARY = "Translations for package balsa"
DESCRIPTION = "Provides translations for the 'balsa' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "balsa-lang-2.6.5-1.6.noarch.rpm"
RPM_HASH = "5c49e91f15965e0c86b370a82c5e311c2851d5e5fcddc3b08cc495726ef3d8cdf9eebc198fd27fc1842ce403d6b8c395b27416b647580b3a45a649c7079eed3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "balsa-lang \
balsa-lang-all \
locale-balsa-ar \
locale-balsa-az \
locale-balsa-bg \
locale-balsa-ca \
locale-balsa-cs \
locale-balsa-da \
locale-balsa-de \
locale-balsa-dz \
locale-balsa-el \
locale-balsa-en-CA \
locale-balsa-en-GB \
locale-balsa-es \
locale-balsa-et \
locale-balsa-eu \
locale-balsa-fi \
locale-balsa-fr \
locale-balsa-ga \
locale-balsa-gl \
locale-balsa-he \
locale-balsa-hi \
locale-balsa-hr \
locale-balsa-hu \
locale-balsa-id \
locale-balsa-it \
locale-balsa-ja \
locale-balsa-ka \
locale-balsa-ko \
locale-balsa-lt \
locale-balsa-lv \
locale-balsa-mk \
locale-balsa-ml \
locale-balsa-ms \
locale-balsa-nb \
locale-balsa-ne \
locale-balsa-nl \
locale-balsa-nn \
locale-balsa-oc \
locale-balsa-pa \
locale-balsa-pl \
locale-balsa-pt \
locale-balsa-pt-BR \
locale-balsa-ro \
locale-balsa-ru \
locale-balsa-sk \
locale-balsa-sl \
locale-balsa-sq \
locale-balsa-sr \
locale-balsa-sr@latin \
locale-balsa-sv \
locale-balsa-tr \
locale-balsa-uk \
locale-balsa-vi \
locale-balsa-wa \
locale-balsa-zh-CN \
locale-balsa-zh-HK \
locale-balsa-zh-TW"

RDEPENDS:${PN} += "balsa"

inherit rpm
