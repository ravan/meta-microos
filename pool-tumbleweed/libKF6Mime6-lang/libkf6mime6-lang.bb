SUMMARY = "Translations for package libKF6Mime6"
DESCRIPTION = "Provides translations for the 'libKF6Mime6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Mime6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "94ba16fd8c5b90cbf8a2bdb3b89900080e62a4bf4548f763d7329959af939fc30f57944b5d7afdc2025f4fad52f695c76c87c3eb5a2e0f45982c5ac30c749c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Mime6-lang \
libKF6Mime6-lang-all \
locale-libKF6Mime6-ar \
locale-libKF6Mime6-ast \
locale-libKF6Mime6-be \
locale-libKF6Mime6-bg \
locale-libKF6Mime6-br \
locale-libKF6Mime6-bs \
locale-libKF6Mime6-ca \
locale-libKF6Mime6-ca@valencia \
locale-libKF6Mime6-cs \
locale-libKF6Mime6-cy \
locale-libKF6Mime6-da \
locale-libKF6Mime6-de \
locale-libKF6Mime6-el \
locale-libKF6Mime6-en-GB \
locale-libKF6Mime6-eo \
locale-libKF6Mime6-es \
locale-libKF6Mime6-et \
locale-libKF6Mime6-eu \
locale-libKF6Mime6-fa \
locale-libKF6Mime6-fi \
locale-libKF6Mime6-fr \
locale-libKF6Mime6-ga \
locale-libKF6Mime6-gl \
locale-libKF6Mime6-he \
locale-libKF6Mime6-hi \
locale-libKF6Mime6-hu \
locale-libKF6Mime6-ia \
locale-libKF6Mime6-is \
locale-libKF6Mime6-it \
locale-libKF6Mime6-ja \
locale-libKF6Mime6-ka \
locale-libKF6Mime6-kk \
locale-libKF6Mime6-km \
locale-libKF6Mime6-ko \
locale-libKF6Mime6-lt \
locale-libKF6Mime6-lv \
locale-libKF6Mime6-mk \
locale-libKF6Mime6-mr \
locale-libKF6Mime6-ms \
locale-libKF6Mime6-nb \
locale-libKF6Mime6-nds \
locale-libKF6Mime6-ne \
locale-libKF6Mime6-nl \
locale-libKF6Mime6-nn \
locale-libKF6Mime6-pa \
locale-libKF6Mime6-pl \
locale-libKF6Mime6-pt \
locale-libKF6Mime6-pt-BR \
locale-libKF6Mime6-ro \
locale-libKF6Mime6-ru \
locale-libKF6Mime6-sk \
locale-libKF6Mime6-sl \
locale-libKF6Mime6-sq \
locale-libKF6Mime6-sr \
locale-libKF6Mime6-sr@ijekavian \
locale-libKF6Mime6-sr@ijekavianlatin \
locale-libKF6Mime6-sr@latin \
locale-libKF6Mime6-sv \
locale-libKF6Mime6-ta \
locale-libKF6Mime6-th \
locale-libKF6Mime6-tr \
locale-libKF6Mime6-ug \
locale-libKF6Mime6-uk \
locale-libKF6Mime6-wa \
locale-libKF6Mime6-zh-CN \
locale-libKF6Mime6-zh-TW"

RDEPENDS:${PN} += "libKF6Mime6"

inherit rpm
