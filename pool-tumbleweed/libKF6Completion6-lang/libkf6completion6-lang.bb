SUMMARY = "Translations for package libKF6Completion6"
DESCRIPTION = "Provides translations for the 'libKF6Completion6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Completion6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "6596fe77cc97df5a9ad2a2ca7db17617ebb97699dddea7740e8459f275be5c8556efbdc7b227e339fd48bf06c67d7576d4208086c7897808d5764e340e892263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Completion6-lang \
libKF6Completion6-lang-all \
locale-libKF6Completion6-af \
locale-libKF6Completion6-ar \
locale-libKF6Completion6-as \
locale-libKF6Completion6-ast \
locale-libKF6Completion6-az \
locale-libKF6Completion6-be \
locale-libKF6Completion6-be@latin \
locale-libKF6Completion6-bg \
locale-libKF6Completion6-bn \
locale-libKF6Completion6-bn-IN \
locale-libKF6Completion6-br \
locale-libKF6Completion6-bs \
locale-libKF6Completion6-ca \
locale-libKF6Completion6-ca@valencia \
locale-libKF6Completion6-cs \
locale-libKF6Completion6-cy \
locale-libKF6Completion6-da \
locale-libKF6Completion6-de \
locale-libKF6Completion6-el \
locale-libKF6Completion6-en-GB \
locale-libKF6Completion6-eo \
locale-libKF6Completion6-es \
locale-libKF6Completion6-et \
locale-libKF6Completion6-eu \
locale-libKF6Completion6-fa \
locale-libKF6Completion6-fi \
locale-libKF6Completion6-fr \
locale-libKF6Completion6-ga \
locale-libKF6Completion6-gd \
locale-libKF6Completion6-gl \
locale-libKF6Completion6-gu \
locale-libKF6Completion6-he \
locale-libKF6Completion6-hi \
locale-libKF6Completion6-hr \
locale-libKF6Completion6-hu \
locale-libKF6Completion6-ia \
locale-libKF6Completion6-id \
locale-libKF6Completion6-is \
locale-libKF6Completion6-it \
locale-libKF6Completion6-ja \
locale-libKF6Completion6-ka \
locale-libKF6Completion6-kk \
locale-libKF6Completion6-km \
locale-libKF6Completion6-kn \
locale-libKF6Completion6-ko \
locale-libKF6Completion6-lt \
locale-libKF6Completion6-lv \
locale-libKF6Completion6-mai \
locale-libKF6Completion6-mk \
locale-libKF6Completion6-ml \
locale-libKF6Completion6-mr \
locale-libKF6Completion6-ms \
locale-libKF6Completion6-nb \
locale-libKF6Completion6-nds \
locale-libKF6Completion6-ne \
locale-libKF6Completion6-nl \
locale-libKF6Completion6-nn \
locale-libKF6Completion6-oc \
locale-libKF6Completion6-or \
locale-libKF6Completion6-pa \
locale-libKF6Completion6-pl \
locale-libKF6Completion6-pt \
locale-libKF6Completion6-pt-BR \
locale-libKF6Completion6-ro \
locale-libKF6Completion6-ru \
locale-libKF6Completion6-si \
locale-libKF6Completion6-sk \
locale-libKF6Completion6-sl \
locale-libKF6Completion6-sq \
locale-libKF6Completion6-sr \
locale-libKF6Completion6-sr@ijekavian \
locale-libKF6Completion6-sr@ijekavianlatin \
locale-libKF6Completion6-sr@latin \
locale-libKF6Completion6-sv \
locale-libKF6Completion6-ta \
locale-libKF6Completion6-te \
locale-libKF6Completion6-th \
locale-libKF6Completion6-tr \
locale-libKF6Completion6-ug \
locale-libKF6Completion6-uk \
locale-libKF6Completion6-vi \
locale-libKF6Completion6-wa \
locale-libKF6Completion6-zh-CN \
locale-libKF6Completion6-zh-HK \
locale-libKF6Completion6-zh-TW"

RDEPENDS:${PN} += "libKF6Completion6"

inherit rpm
