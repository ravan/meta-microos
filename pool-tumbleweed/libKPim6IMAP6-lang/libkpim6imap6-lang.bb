SUMMARY = "Translations for package libKPim6IMAP6"
DESCRIPTION = "Provides translations for the 'libKPim6IMAP6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IMAP6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2c42d3c2c3ec934ee4b6285ed0fab175bd349ba3adfc4859d77fd6b0fb68effcdd664347f5e8fb7eb665f4260e347813fe0f4277bc39af48a72aeec46c2ffb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim6IMAP6-lang \
libKPim6IMAP6-lang-all \
locale-libKPim6IMAP6-ar \
locale-libKPim6IMAP6-ast \
locale-libKPim6IMAP6-bs \
locale-libKPim6IMAP6-ca \
locale-libKPim6IMAP6-ca@valencia \
locale-libKPim6IMAP6-cs \
locale-libKPim6IMAP6-da \
locale-libKPim6IMAP6-de \
locale-libKPim6IMAP6-el \
locale-libKPim6IMAP6-en-GB \
locale-libKPim6IMAP6-eo \
locale-libKPim6IMAP6-es \
locale-libKPim6IMAP6-et \
locale-libKPim6IMAP6-eu \
locale-libKPim6IMAP6-fi \
locale-libKPim6IMAP6-fr \
locale-libKPim6IMAP6-ga \
locale-libKPim6IMAP6-gl \
locale-libKPim6IMAP6-he \
locale-libKPim6IMAP6-hi \
locale-libKPim6IMAP6-hu \
locale-libKPim6IMAP6-ia \
locale-libKPim6IMAP6-it \
locale-libKPim6IMAP6-ja \
locale-libKPim6IMAP6-ka \
locale-libKPim6IMAP6-kk \
locale-libKPim6IMAP6-km \
locale-libKPim6IMAP6-ko \
locale-libKPim6IMAP6-lt \
locale-libKPim6IMAP6-lv \
locale-libKPim6IMAP6-mr \
locale-libKPim6IMAP6-nb \
locale-libKPim6IMAP6-nds \
locale-libKPim6IMAP6-nl \
locale-libKPim6IMAP6-nn \
locale-libKPim6IMAP6-pa \
locale-libKPim6IMAP6-pl \
locale-libKPim6IMAP6-pt \
locale-libKPim6IMAP6-pt-BR \
locale-libKPim6IMAP6-ro \
locale-libKPim6IMAP6-ru \
locale-libKPim6IMAP6-sk \
locale-libKPim6IMAP6-sl \
locale-libKPim6IMAP6-sq \
locale-libKPim6IMAP6-sr \
locale-libKPim6IMAP6-sr@ijekavian \
locale-libKPim6IMAP6-sr@ijekavianlatin \
locale-libKPim6IMAP6-sr@latin \
locale-libKPim6IMAP6-sv \
locale-libKPim6IMAP6-ta \
locale-libKPim6IMAP6-tr \
locale-libKPim6IMAP6-ug \
locale-libKPim6IMAP6-uk \
locale-libKPim6IMAP6-zh-CN \
locale-libKPim6IMAP6-zh-TW"

RDEPENDS:${PN} += "libKPim6IMAP6"

inherit rpm
