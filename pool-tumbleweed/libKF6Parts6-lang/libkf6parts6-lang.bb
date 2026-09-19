SUMMARY = "Translations for package libKF6Parts6"
DESCRIPTION = "Provides translations for the 'libKF6Parts6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Parts6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "8ea69b11918d21799509f7cae0b654945cb8dbc7a25c29f1a6c5b0215ce79e913f51d035d00b306e994b0be2fa249078efb3aa239097ade2bcd038f805109e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Parts6-lang \
libKF6Parts6-lang-all \
locale-libKF6Parts6-af \
locale-libKF6Parts6-ar \
locale-libKF6Parts6-as \
locale-libKF6Parts6-ast \
locale-libKF6Parts6-az \
locale-libKF6Parts6-be \
locale-libKF6Parts6-be@latin \
locale-libKF6Parts6-bg \
locale-libKF6Parts6-bn \
locale-libKF6Parts6-bn-IN \
locale-libKF6Parts6-br \
locale-libKF6Parts6-bs \
locale-libKF6Parts6-ca \
locale-libKF6Parts6-ca@valencia \
locale-libKF6Parts6-cs \
locale-libKF6Parts6-cy \
locale-libKF6Parts6-da \
locale-libKF6Parts6-de \
locale-libKF6Parts6-el \
locale-libKF6Parts6-en-GB \
locale-libKF6Parts6-eo \
locale-libKF6Parts6-es \
locale-libKF6Parts6-et \
locale-libKF6Parts6-eu \
locale-libKF6Parts6-fa \
locale-libKF6Parts6-fi \
locale-libKF6Parts6-fr \
locale-libKF6Parts6-ga \
locale-libKF6Parts6-gd \
locale-libKF6Parts6-gl \
locale-libKF6Parts6-gu \
locale-libKF6Parts6-he \
locale-libKF6Parts6-hi \
locale-libKF6Parts6-hr \
locale-libKF6Parts6-hu \
locale-libKF6Parts6-ia \
locale-libKF6Parts6-id \
locale-libKF6Parts6-is \
locale-libKF6Parts6-it \
locale-libKF6Parts6-ja \
locale-libKF6Parts6-ka \
locale-libKF6Parts6-kk \
locale-libKF6Parts6-km \
locale-libKF6Parts6-kn \
locale-libKF6Parts6-ko \
locale-libKF6Parts6-lt \
locale-libKF6Parts6-lv \
locale-libKF6Parts6-mai \
locale-libKF6Parts6-mk \
locale-libKF6Parts6-ml \
locale-libKF6Parts6-mr \
locale-libKF6Parts6-ms \
locale-libKF6Parts6-nb \
locale-libKF6Parts6-nds \
locale-libKF6Parts6-ne \
locale-libKF6Parts6-nl \
locale-libKF6Parts6-nn \
locale-libKF6Parts6-oc \
locale-libKF6Parts6-or \
locale-libKF6Parts6-pa \
locale-libKF6Parts6-pl \
locale-libKF6Parts6-pt \
locale-libKF6Parts6-pt-BR \
locale-libKF6Parts6-ro \
locale-libKF6Parts6-ru \
locale-libKF6Parts6-si \
locale-libKF6Parts6-sk \
locale-libKF6Parts6-sl \
locale-libKF6Parts6-sq \
locale-libKF6Parts6-sr \
locale-libKF6Parts6-sr@ijekavian \
locale-libKF6Parts6-sr@ijekavianlatin \
locale-libKF6Parts6-sr@latin \
locale-libKF6Parts6-sv \
locale-libKF6Parts6-ta \
locale-libKF6Parts6-te \
locale-libKF6Parts6-th \
locale-libKF6Parts6-tr \
locale-libKF6Parts6-ug \
locale-libKF6Parts6-uk \
locale-libKF6Parts6-vi \
locale-libKF6Parts6-wa \
locale-libKF6Parts6-zh-CN \
locale-libKF6Parts6-zh-HK \
locale-libKF6Parts6-zh-TW"

RDEPENDS:${PN} += "libKF6Parts6"

inherit rpm
