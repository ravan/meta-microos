SUMMARY = "Translations for package plasma6-print-manager"
DESCRIPTION = "Provides translations for the 'plasma6-print-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-print-manager-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "51c9b8dbc85e3ad52d420a92106259d007820451a831861d7c2176c9601228ea7db693a2901768c93f454e1c5b690c329847b5f62f36d7a3ffd8e0fb78a59c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-print-manager-ar \
locale-plasma6-print-manager-ast \
locale-plasma6-print-manager-az \
locale-plasma6-print-manager-be \
locale-plasma6-print-manager-bg \
locale-plasma6-print-manager-bs \
locale-plasma6-print-manager-ca \
locale-plasma6-print-manager-ca@valencia \
locale-plasma6-print-manager-cs \
locale-plasma6-print-manager-da \
locale-plasma6-print-manager-de \
locale-plasma6-print-manager-el \
locale-plasma6-print-manager-en-GB \
locale-plasma6-print-manager-eo \
locale-plasma6-print-manager-es \
locale-plasma6-print-manager-et \
locale-plasma6-print-manager-eu \
locale-plasma6-print-manager-fi \
locale-plasma6-print-manager-fr \
locale-plasma6-print-manager-ga \
locale-plasma6-print-manager-gl \
locale-plasma6-print-manager-he \
locale-plasma6-print-manager-hi \
locale-plasma6-print-manager-hu \
locale-plasma6-print-manager-ia \
locale-plasma6-print-manager-id \
locale-plasma6-print-manager-is \
locale-plasma6-print-manager-it \
locale-plasma6-print-manager-ja \
locale-plasma6-print-manager-ka \
locale-plasma6-print-manager-kk \
locale-plasma6-print-manager-km \
locale-plasma6-print-manager-ko \
locale-plasma6-print-manager-lt \
locale-plasma6-print-manager-lv \
locale-plasma6-print-manager-mr \
locale-plasma6-print-manager-nb \
locale-plasma6-print-manager-nds \
locale-plasma6-print-manager-nl \
locale-plasma6-print-manager-nn \
locale-plasma6-print-manager-pa \
locale-plasma6-print-manager-pl \
locale-plasma6-print-manager-pt \
locale-plasma6-print-manager-pt-BR \
locale-plasma6-print-manager-ro \
locale-plasma6-print-manager-ru \
locale-plasma6-print-manager-sk \
locale-plasma6-print-manager-sl \
locale-plasma6-print-manager-sr \
locale-plasma6-print-manager-sr@ijekavian \
locale-plasma6-print-manager-sr@ijekavianlatin \
locale-plasma6-print-manager-sr@latin \
locale-plasma6-print-manager-sv \
locale-plasma6-print-manager-ta \
locale-plasma6-print-manager-tr \
locale-plasma6-print-manager-ug \
locale-plasma6-print-manager-uk \
locale-plasma6-print-manager-zh-CN \
locale-plasma6-print-manager-zh-TW \
plasma6-print-manager-lang \
plasma6-print-manager-lang-all"

RDEPENDS:${PN} += "plasma6-print-manager"

inherit rpm
