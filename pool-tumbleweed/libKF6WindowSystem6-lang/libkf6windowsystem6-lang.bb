SUMMARY = "Translations for package libKF6WindowSystem6"
DESCRIPTION = "Provides translations for the 'libKF6WindowSystem6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6WindowSystem6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "6c2c151abb9d54f3976437b1eb982398536c08fa33e1bb7736c8b06c6cfe5147277ec22edfa67819d2b8b2b9b1a50a5898e8bfcbd45c1a12783ef495a9b71884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6WindowSystem6-lang \
libKF6WindowSystem6-lang-all \
locale-libKF6WindowSystem6-af \
locale-libKF6WindowSystem6-ar \
locale-libKF6WindowSystem6-as \
locale-libKF6WindowSystem6-ast \
locale-libKF6WindowSystem6-az \
locale-libKF6WindowSystem6-be \
locale-libKF6WindowSystem6-be@latin \
locale-libKF6WindowSystem6-bg \
locale-libKF6WindowSystem6-bn \
locale-libKF6WindowSystem6-bn-IN \
locale-libKF6WindowSystem6-br \
locale-libKF6WindowSystem6-bs \
locale-libKF6WindowSystem6-ca \
locale-libKF6WindowSystem6-ca@valencia \
locale-libKF6WindowSystem6-cs \
locale-libKF6WindowSystem6-cy \
locale-libKF6WindowSystem6-da \
locale-libKF6WindowSystem6-de \
locale-libKF6WindowSystem6-el \
locale-libKF6WindowSystem6-en-GB \
locale-libKF6WindowSystem6-eo \
locale-libKF6WindowSystem6-es \
locale-libKF6WindowSystem6-et \
locale-libKF6WindowSystem6-eu \
locale-libKF6WindowSystem6-fa \
locale-libKF6WindowSystem6-fi \
locale-libKF6WindowSystem6-fr \
locale-libKF6WindowSystem6-ga \
locale-libKF6WindowSystem6-gd \
locale-libKF6WindowSystem6-gl \
locale-libKF6WindowSystem6-gu \
locale-libKF6WindowSystem6-he \
locale-libKF6WindowSystem6-hi \
locale-libKF6WindowSystem6-hr \
locale-libKF6WindowSystem6-hu \
locale-libKF6WindowSystem6-ia \
locale-libKF6WindowSystem6-id \
locale-libKF6WindowSystem6-is \
locale-libKF6WindowSystem6-it \
locale-libKF6WindowSystem6-ja \
locale-libKF6WindowSystem6-ka \
locale-libKF6WindowSystem6-kk \
locale-libKF6WindowSystem6-km \
locale-libKF6WindowSystem6-kn \
locale-libKF6WindowSystem6-ko \
locale-libKF6WindowSystem6-lt \
locale-libKF6WindowSystem6-lv \
locale-libKF6WindowSystem6-mai \
locale-libKF6WindowSystem6-mk \
locale-libKF6WindowSystem6-ml \
locale-libKF6WindowSystem6-mr \
locale-libKF6WindowSystem6-ms \
locale-libKF6WindowSystem6-nb \
locale-libKF6WindowSystem6-nds \
locale-libKF6WindowSystem6-ne \
locale-libKF6WindowSystem6-nl \
locale-libKF6WindowSystem6-nn \
locale-libKF6WindowSystem6-oc \
locale-libKF6WindowSystem6-or \
locale-libKF6WindowSystem6-pa \
locale-libKF6WindowSystem6-pl \
locale-libKF6WindowSystem6-pt \
locale-libKF6WindowSystem6-pt-BR \
locale-libKF6WindowSystem6-ro \
locale-libKF6WindowSystem6-ru \
locale-libKF6WindowSystem6-si \
locale-libKF6WindowSystem6-sk \
locale-libKF6WindowSystem6-sl \
locale-libKF6WindowSystem6-sq \
locale-libKF6WindowSystem6-sr \
locale-libKF6WindowSystem6-sr@ijekavian \
locale-libKF6WindowSystem6-sr@ijekavianlatin \
locale-libKF6WindowSystem6-sr@latin \
locale-libKF6WindowSystem6-sv \
locale-libKF6WindowSystem6-ta \
locale-libKF6WindowSystem6-te \
locale-libKF6WindowSystem6-th \
locale-libKF6WindowSystem6-tr \
locale-libKF6WindowSystem6-ug \
locale-libKF6WindowSystem6-uk \
locale-libKF6WindowSystem6-vi \
locale-libKF6WindowSystem6-wa \
locale-libKF6WindowSystem6-zh-CN \
locale-libKF6WindowSystem6-zh-HK \
locale-libKF6WindowSystem6-zh-TW"

RDEPENDS:${PN} += "libKF6WindowSystem6"

inherit rpm
