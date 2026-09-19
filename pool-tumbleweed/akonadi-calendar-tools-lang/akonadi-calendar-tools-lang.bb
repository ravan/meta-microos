SUMMARY = "Translations for package akonadi-calendar-tools"
DESCRIPTION = "Provides translations for the 'akonadi-calendar-tools' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-calendar-tools-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "aa161e8f72a6c88fa11f17ca30516eee6a2acba1885331c0e4d2184110dbed7622ec551d16399a779d8334d5aa25c447086175244b4ed24ffadf5803cb42b51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-calendar-tools-lang \
akonadi-calendar-tools-lang-all \
locale-akonadi-calendar-tools-ar \
locale-akonadi-calendar-tools-ast \
locale-akonadi-calendar-tools-az \
locale-akonadi-calendar-tools-be \
locale-akonadi-calendar-tools-bg \
locale-akonadi-calendar-tools-br \
locale-akonadi-calendar-tools-bs \
locale-akonadi-calendar-tools-ca \
locale-akonadi-calendar-tools-ca@valencia \
locale-akonadi-calendar-tools-cs \
locale-akonadi-calendar-tools-cy \
locale-akonadi-calendar-tools-da \
locale-akonadi-calendar-tools-de \
locale-akonadi-calendar-tools-el \
locale-akonadi-calendar-tools-en-GB \
locale-akonadi-calendar-tools-eo \
locale-akonadi-calendar-tools-es \
locale-akonadi-calendar-tools-et \
locale-akonadi-calendar-tools-eu \
locale-akonadi-calendar-tools-fa \
locale-akonadi-calendar-tools-fi \
locale-akonadi-calendar-tools-fr \
locale-akonadi-calendar-tools-ga \
locale-akonadi-calendar-tools-gl \
locale-akonadi-calendar-tools-he \
locale-akonadi-calendar-tools-hi \
locale-akonadi-calendar-tools-hr \
locale-akonadi-calendar-tools-hu \
locale-akonadi-calendar-tools-ia \
locale-akonadi-calendar-tools-id \
locale-akonadi-calendar-tools-is \
locale-akonadi-calendar-tools-it \
locale-akonadi-calendar-tools-ja \
locale-akonadi-calendar-tools-ka \
locale-akonadi-calendar-tools-kk \
locale-akonadi-calendar-tools-km \
locale-akonadi-calendar-tools-ko \
locale-akonadi-calendar-tools-lt \
locale-akonadi-calendar-tools-lv \
locale-akonadi-calendar-tools-mk \
locale-akonadi-calendar-tools-mr \
locale-akonadi-calendar-tools-ms \
locale-akonadi-calendar-tools-nb \
locale-akonadi-calendar-tools-nds \
locale-akonadi-calendar-tools-ne \
locale-akonadi-calendar-tools-nl \
locale-akonadi-calendar-tools-nn \
locale-akonadi-calendar-tools-pa \
locale-akonadi-calendar-tools-pl \
locale-akonadi-calendar-tools-pt \
locale-akonadi-calendar-tools-pt-BR \
locale-akonadi-calendar-tools-ro \
locale-akonadi-calendar-tools-ru \
locale-akonadi-calendar-tools-sk \
locale-akonadi-calendar-tools-sl \
locale-akonadi-calendar-tools-sq \
locale-akonadi-calendar-tools-sv \
locale-akonadi-calendar-tools-ta \
locale-akonadi-calendar-tools-tr \
locale-akonadi-calendar-tools-ug \
locale-akonadi-calendar-tools-uk \
locale-akonadi-calendar-tools-zh-CN \
locale-akonadi-calendar-tools-zh-TW"

RDEPENDS:${PN} += "akonadi-calendar-tools"

inherit rpm
