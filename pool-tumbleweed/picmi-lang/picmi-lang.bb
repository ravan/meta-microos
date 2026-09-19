SUMMARY = "Translations for package picmi"
DESCRIPTION = "Provides translations for the 'picmi' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "picmi-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ae98948086860eff2f20b398db8394e94dab85fb9735f794e992c67affa34dd627ee1441574e25db4c7f49bed6518c08646a21f3a2685a5d8e87fa0fe5dbd910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-picmi-ar \
locale-picmi-ast \
locale-picmi-bs \
locale-picmi-ca \
locale-picmi-ca@valencia \
locale-picmi-cs \
locale-picmi-da \
locale-picmi-de \
locale-picmi-el \
locale-picmi-en-GB \
locale-picmi-eo \
locale-picmi-es \
locale-picmi-et \
locale-picmi-eu \
locale-picmi-fi \
locale-picmi-fr \
locale-picmi-ga \
locale-picmi-gl \
locale-picmi-he \
locale-picmi-hi \
locale-picmi-hu \
locale-picmi-ia \
locale-picmi-it \
locale-picmi-ja \
locale-picmi-ka \
locale-picmi-kk \
locale-picmi-ko \
locale-picmi-lt \
locale-picmi-lv \
locale-picmi-ml \
locale-picmi-mr \
locale-picmi-nb \
locale-picmi-nds \
locale-picmi-nl \
locale-picmi-nn \
locale-picmi-pl \
locale-picmi-pt \
locale-picmi-pt-BR \
locale-picmi-ro \
locale-picmi-ru \
locale-picmi-sk \
locale-picmi-sl \
locale-picmi-sr \
locale-picmi-sr@ijekavian \
locale-picmi-sr@ijekavianlatin \
locale-picmi-sr@latin \
locale-picmi-sv \
locale-picmi-tr \
locale-picmi-ug \
locale-picmi-uk \
locale-picmi-zh-CN \
locale-picmi-zh-TW \
picmi-lang \
picmi-lang-all"

RDEPENDS:${PN} += "picmi"

inherit rpm
