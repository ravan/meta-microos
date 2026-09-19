SUMMARY = "Translations for package libKPim6SMTP6"
DESCRIPTION = "Provides translations for the 'libKPim6SMTP6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6SMTP6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "13a1ec33a44e72b982a562db3e87cd376d4fe4ad00403782faf7e7e4b61f10c31b4ec3bb23369e47987a0e6efd268e32b1cd812c0739d7a29b8c2c61724f7528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim6SMTP6-lang \
libKPim6SMTP6-lang-all \
locale-libKPim6SMTP6-ar \
locale-libKPim6SMTP6-ast \
locale-libKPim6SMTP6-bg \
locale-libKPim6SMTP6-bs \
locale-libKPim6SMTP6-ca \
locale-libKPim6SMTP6-ca@valencia \
locale-libKPim6SMTP6-cs \
locale-libKPim6SMTP6-de \
locale-libKPim6SMTP6-en-GB \
locale-libKPim6SMTP6-eo \
locale-libKPim6SMTP6-es \
locale-libKPim6SMTP6-et \
locale-libKPim6SMTP6-eu \
locale-libKPim6SMTP6-fi \
locale-libKPim6SMTP6-fr \
locale-libKPim6SMTP6-ga \
locale-libKPim6SMTP6-gl \
locale-libKPim6SMTP6-he \
locale-libKPim6SMTP6-hi \
locale-libKPim6SMTP6-hu \
locale-libKPim6SMTP6-ia \
locale-libKPim6SMTP6-is \
locale-libKPim6SMTP6-it \
locale-libKPim6SMTP6-ja \
locale-libKPim6SMTP6-ka \
locale-libKPim6SMTP6-km \
locale-libKPim6SMTP6-ko \
locale-libKPim6SMTP6-lt \
locale-libKPim6SMTP6-lv \
locale-libKPim6SMTP6-mr \
locale-libKPim6SMTP6-nds \
locale-libKPim6SMTP6-nl \
locale-libKPim6SMTP6-nn \
locale-libKPim6SMTP6-pl \
locale-libKPim6SMTP6-pt \
locale-libKPim6SMTP6-pt-BR \
locale-libKPim6SMTP6-ro \
locale-libKPim6SMTP6-ru \
locale-libKPim6SMTP6-sk \
locale-libKPim6SMTP6-sl \
locale-libKPim6SMTP6-sr \
locale-libKPim6SMTP6-sr@ijekavian \
locale-libKPim6SMTP6-sr@ijekavianlatin \
locale-libKPim6SMTP6-sr@latin \
locale-libKPim6SMTP6-sv \
locale-libKPim6SMTP6-ta \
locale-libKPim6SMTP6-tr \
locale-libKPim6SMTP6-ug \
locale-libKPim6SMTP6-uk \
locale-libKPim6SMTP6-zh-CN \
locale-libKPim6SMTP6-zh-TW"

RDEPENDS:${PN} += "libKPim6SMTP6"

inherit rpm
