SUMMARY = "Translations for package libKPim6TextEdit6"
DESCRIPTION = "Provides translations for the 'libKPim6TextEdit6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6TextEdit6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "65ea418126de9d7bc0ecb1434ea3aca519f649d9b3582e4868b0808f20db2277254466b83c86f71816d9261f9cc78b7a14d00ec2acf79859563dbf050da0e6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim6TextEdit6-lang \
libKPim6TextEdit6-lang-all \
locale-libKPim6TextEdit6-ar \
locale-libKPim6TextEdit6-ast \
locale-libKPim6TextEdit6-az \
locale-libKPim6TextEdit6-bg \
locale-libKPim6TextEdit6-bs \
locale-libKPim6TextEdit6-ca \
locale-libKPim6TextEdit6-ca@valencia \
locale-libKPim6TextEdit6-cs \
locale-libKPim6TextEdit6-da \
locale-libKPim6TextEdit6-de \
locale-libKPim6TextEdit6-el \
locale-libKPim6TextEdit6-en-GB \
locale-libKPim6TextEdit6-eo \
locale-libKPim6TextEdit6-es \
locale-libKPim6TextEdit6-et \
locale-libKPim6TextEdit6-eu \
locale-libKPim6TextEdit6-fi \
locale-libKPim6TextEdit6-fr \
locale-libKPim6TextEdit6-ga \
locale-libKPim6TextEdit6-gl \
locale-libKPim6TextEdit6-he \
locale-libKPim6TextEdit6-hi \
locale-libKPim6TextEdit6-hu \
locale-libKPim6TextEdit6-ia \
locale-libKPim6TextEdit6-it \
locale-libKPim6TextEdit6-ja \
locale-libKPim6TextEdit6-ka \
locale-libKPim6TextEdit6-kk \
locale-libKPim6TextEdit6-km \
locale-libKPim6TextEdit6-ko \
locale-libKPim6TextEdit6-lt \
locale-libKPim6TextEdit6-lv \
locale-libKPim6TextEdit6-mr \
locale-libKPim6TextEdit6-nb \
locale-libKPim6TextEdit6-nds \
locale-libKPim6TextEdit6-nl \
locale-libKPim6TextEdit6-nn \
locale-libKPim6TextEdit6-pa \
locale-libKPim6TextEdit6-pl \
locale-libKPim6TextEdit6-pt \
locale-libKPim6TextEdit6-pt-BR \
locale-libKPim6TextEdit6-ro \
locale-libKPim6TextEdit6-ru \
locale-libKPim6TextEdit6-sk \
locale-libKPim6TextEdit6-sl \
locale-libKPim6TextEdit6-sq \
locale-libKPim6TextEdit6-sr \
locale-libKPim6TextEdit6-sr@ijekavian \
locale-libKPim6TextEdit6-sr@ijekavianlatin \
locale-libKPim6TextEdit6-sr@latin \
locale-libKPim6TextEdit6-sv \
locale-libKPim6TextEdit6-ta \
locale-libKPim6TextEdit6-tr \
locale-libKPim6TextEdit6-ug \
locale-libKPim6TextEdit6-uk \
locale-libKPim6TextEdit6-zh-CN \
locale-libKPim6TextEdit6-zh-TW"

RDEPENDS:${PN} += "libKPim6TextEdit6"

inherit rpm
