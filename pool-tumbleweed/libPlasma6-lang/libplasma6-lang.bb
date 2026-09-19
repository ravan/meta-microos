SUMMARY = "Translations for package libPlasma6"
DESCRIPTION = "Provides translations for the 'libPlasma7' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasma6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "7051ae48b7bea88cd77ba3086f7ca17eed4a5c5bc039a72c1b742f94614bd8e4a95e80b262c9e0a902826235f0e5eff2962d93add33a4c4ab3b061f7f48533b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libPlasma6-lang \
libPlasma7-lang-all \
locale-libPlasma6-ar \
locale-libPlasma6-ast \
locale-libPlasma6-az \
locale-libPlasma6-be \
locale-libPlasma6-bg \
locale-libPlasma6-bs \
locale-libPlasma6-ca \
locale-libPlasma6-ca@valencia \
locale-libPlasma6-cs \
locale-libPlasma6-da \
locale-libPlasma6-de \
locale-libPlasma6-el \
locale-libPlasma6-en-GB \
locale-libPlasma6-eo \
locale-libPlasma6-es \
locale-libPlasma6-et \
locale-libPlasma6-eu \
locale-libPlasma6-fi \
locale-libPlasma6-fr \
locale-libPlasma6-ga \
locale-libPlasma6-gd \
locale-libPlasma6-gl \
locale-libPlasma6-he \
locale-libPlasma6-hi \
locale-libPlasma6-hu \
locale-libPlasma6-ia \
locale-libPlasma6-id \
locale-libPlasma6-is \
locale-libPlasma6-it \
locale-libPlasma6-ja \
locale-libPlasma6-ka \
locale-libPlasma6-ko \
locale-libPlasma6-lt \
locale-libPlasma6-lv \
locale-libPlasma6-ml \
locale-libPlasma6-mr \
locale-libPlasma6-nb \
locale-libPlasma6-nds \
locale-libPlasma6-nl \
locale-libPlasma6-nn \
locale-libPlasma6-pa \
locale-libPlasma6-pl \
locale-libPlasma6-pt \
locale-libPlasma6-pt-BR \
locale-libPlasma6-ro \
locale-libPlasma6-ru \
locale-libPlasma6-sk \
locale-libPlasma6-sl \
locale-libPlasma6-sr \
locale-libPlasma6-sr@ijekavian \
locale-libPlasma6-sr@ijekavianlatin \
locale-libPlasma6-sr@latin \
locale-libPlasma6-sv \
locale-libPlasma6-ta \
locale-libPlasma6-tr \
locale-libPlasma6-ug \
locale-libPlasma6-uk \
locale-libPlasma6-vi \
locale-libPlasma6-zh-CN \
locale-libPlasma6-zh-TW \
plasma6-framework-lang"

RDEPENDS:${PN} += "libPlasma7"

inherit rpm
