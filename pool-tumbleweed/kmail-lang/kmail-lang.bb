SUMMARY = "Translations for package kmail"
DESCRIPTION = "Provides translations for the 'kmail' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kmail-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "18347bf5efe2c89a458240e9f84541ae2879539e3ecfd981df1b312c2b88dc8238714c725ae8936680f0488e189620cdd5648fc69b0c594927d756da81f195cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmail-lang \
kmail-lang-all \
locale-kmail-af \
locale-kmail-ar \
locale-kmail-ast \
locale-kmail-az \
locale-kmail-be \
locale-kmail-bg \
locale-kmail-bn \
locale-kmail-br \
locale-kmail-bs \
locale-kmail-ca \
locale-kmail-ca@valencia \
locale-kmail-cs \
locale-kmail-cy \
locale-kmail-da \
locale-kmail-de \
locale-kmail-el \
locale-kmail-en-GB \
locale-kmail-eo \
locale-kmail-es \
locale-kmail-et \
locale-kmail-eu \
locale-kmail-fa \
locale-kmail-fi \
locale-kmail-fr \
locale-kmail-ga \
locale-kmail-gl \
locale-kmail-he \
locale-kmail-hi \
locale-kmail-hr \
locale-kmail-hu \
locale-kmail-ia \
locale-kmail-id \
locale-kmail-is \
locale-kmail-it \
locale-kmail-ja \
locale-kmail-ka \
locale-kmail-kk \
locale-kmail-km \
locale-kmail-ko \
locale-kmail-lt \
locale-kmail-lv \
locale-kmail-mk \
locale-kmail-mr \
locale-kmail-ms \
locale-kmail-nb \
locale-kmail-nds \
locale-kmail-ne \
locale-kmail-nl \
locale-kmail-nn \
locale-kmail-pa \
locale-kmail-pl \
locale-kmail-pt \
locale-kmail-pt-BR \
locale-kmail-ro \
locale-kmail-ru \
locale-kmail-si \
locale-kmail-sk \
locale-kmail-sl \
locale-kmail-sq \
locale-kmail-sr \
locale-kmail-sr@ijekavian \
locale-kmail-sr@ijekavianlatin \
locale-kmail-sr@latin \
locale-kmail-sv \
locale-kmail-ta \
locale-kmail-th \
locale-kmail-tr \
locale-kmail-ug \
locale-kmail-uk \
locale-kmail-wa \
locale-kmail-zh-CN \
locale-kmail-zh-TW"

RDEPENDS:${PN} += "kmail"

inherit rpm
