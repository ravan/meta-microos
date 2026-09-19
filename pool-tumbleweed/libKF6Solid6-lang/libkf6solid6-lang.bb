SUMMARY = "Translations for package libKF6Solid6"
DESCRIPTION = "Provides translations for the 'libKF6Solid6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Solid6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "6543224972dee13366a48ef1fd13e41bbf1406c3bbb32318655d8be638997a06f8019c208fa053942996e9c90dba9ed316dacbea02bbc2980ef8aec1cb4a083c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Solid6-lang \
libKF6Solid6-lang-all \
locale-libKF6Solid6-ar \
locale-libKF6Solid6-ast \
locale-libKF6Solid6-az \
locale-libKF6Solid6-bg \
locale-libKF6Solid6-bs \
locale-libKF6Solid6-ca \
locale-libKF6Solid6-ca@valencia \
locale-libKF6Solid6-cs \
locale-libKF6Solid6-da \
locale-libKF6Solid6-de \
locale-libKF6Solid6-el \
locale-libKF6Solid6-en-GB \
locale-libKF6Solid6-eo \
locale-libKF6Solid6-es \
locale-libKF6Solid6-et \
locale-libKF6Solid6-eu \
locale-libKF6Solid6-fi \
locale-libKF6Solid6-fr \
locale-libKF6Solid6-ga \
locale-libKF6Solid6-gd \
locale-libKF6Solid6-gl \
locale-libKF6Solid6-he \
locale-libKF6Solid6-hi \
locale-libKF6Solid6-hr \
locale-libKF6Solid6-hu \
locale-libKF6Solid6-ia \
locale-libKF6Solid6-id \
locale-libKF6Solid6-is \
locale-libKF6Solid6-it \
locale-libKF6Solid6-ja \
locale-libKF6Solid6-ka \
locale-libKF6Solid6-kk \
locale-libKF6Solid6-km \
locale-libKF6Solid6-ko \
locale-libKF6Solid6-lt \
locale-libKF6Solid6-lv \
locale-libKF6Solid6-ml \
locale-libKF6Solid6-mr \
locale-libKF6Solid6-ms \
locale-libKF6Solid6-nb \
locale-libKF6Solid6-nds \
locale-libKF6Solid6-nl \
locale-libKF6Solid6-nn \
locale-libKF6Solid6-pa \
locale-libKF6Solid6-pl \
locale-libKF6Solid6-pt \
locale-libKF6Solid6-pt-BR \
locale-libKF6Solid6-ro \
locale-libKF6Solid6-ru \
locale-libKF6Solid6-sk \
locale-libKF6Solid6-sl \
locale-libKF6Solid6-sr \
locale-libKF6Solid6-sr@ijekavian \
locale-libKF6Solid6-sr@ijekavianlatin \
locale-libKF6Solid6-sr@latin \
locale-libKF6Solid6-sv \
locale-libKF6Solid6-ta \
locale-libKF6Solid6-th \
locale-libKF6Solid6-tr \
locale-libKF6Solid6-ug \
locale-libKF6Solid6-uk \
locale-libKF6Solid6-zh-CN \
locale-libKF6Solid6-zh-TW"

RDEPENDS:${PN} += "libKF6Solid6"

inherit rpm
