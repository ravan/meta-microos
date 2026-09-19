SUMMARY = "Translations for package libKF6ConfigCore6"
DESCRIPTION = "Provides translations for the 'libKF6ConfigCore6' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ConfigCore6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "00b796c24daf3f4336f51cf90fca4b168b243131de7f77f5d1142892d1cde146d6d750936af3d1893af728d00de6d26f3b79d667a9f58c919e5a706aacb54101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6ConfigCore6-lang \
libKF6ConfigCore6-lang-all \
locale-libKF6ConfigCore6-af \
locale-libKF6ConfigCore6-ar \
locale-libKF6ConfigCore6-ast \
locale-libKF6ConfigCore6-az \
locale-libKF6ConfigCore6-be \
locale-libKF6ConfigCore6-be@latin \
locale-libKF6ConfigCore6-bg \
locale-libKF6ConfigCore6-bn \
locale-libKF6ConfigCore6-bn-IN \
locale-libKF6ConfigCore6-br \
locale-libKF6ConfigCore6-bs \
locale-libKF6ConfigCore6-ca \
locale-libKF6ConfigCore6-ca@valencia \
locale-libKF6ConfigCore6-cs \
locale-libKF6ConfigCore6-cy \
locale-libKF6ConfigCore6-da \
locale-libKF6ConfigCore6-de \
locale-libKF6ConfigCore6-el \
locale-libKF6ConfigCore6-en-GB \
locale-libKF6ConfigCore6-eo \
locale-libKF6ConfigCore6-es \
locale-libKF6ConfigCore6-et \
locale-libKF6ConfigCore6-eu \
locale-libKF6ConfigCore6-fa \
locale-libKF6ConfigCore6-fi \
locale-libKF6ConfigCore6-fr \
locale-libKF6ConfigCore6-ga \
locale-libKF6ConfigCore6-gd \
locale-libKF6ConfigCore6-gl \
locale-libKF6ConfigCore6-gu \
locale-libKF6ConfigCore6-he \
locale-libKF6ConfigCore6-hi \
locale-libKF6ConfigCore6-hr \
locale-libKF6ConfigCore6-hu \
locale-libKF6ConfigCore6-ia \
locale-libKF6ConfigCore6-id \
locale-libKF6ConfigCore6-is \
locale-libKF6ConfigCore6-it \
locale-libKF6ConfigCore6-ja \
locale-libKF6ConfigCore6-ka \
locale-libKF6ConfigCore6-kk \
locale-libKF6ConfigCore6-km \
locale-libKF6ConfigCore6-kn \
locale-libKF6ConfigCore6-ko \
locale-libKF6ConfigCore6-lt \
locale-libKF6ConfigCore6-lv \
locale-libKF6ConfigCore6-mai \
locale-libKF6ConfigCore6-mk \
locale-libKF6ConfigCore6-ml \
locale-libKF6ConfigCore6-mr \
locale-libKF6ConfigCore6-ms \
locale-libKF6ConfigCore6-nb \
locale-libKF6ConfigCore6-nds \
locale-libKF6ConfigCore6-ne \
locale-libKF6ConfigCore6-nl \
locale-libKF6ConfigCore6-nn \
locale-libKF6ConfigCore6-or \
locale-libKF6ConfigCore6-pa \
locale-libKF6ConfigCore6-pl \
locale-libKF6ConfigCore6-pt \
locale-libKF6ConfigCore6-pt-BR \
locale-libKF6ConfigCore6-ro \
locale-libKF6ConfigCore6-ru \
locale-libKF6ConfigCore6-si \
locale-libKF6ConfigCore6-sk \
locale-libKF6ConfigCore6-sl \
locale-libKF6ConfigCore6-sq \
locale-libKF6ConfigCore6-sr \
locale-libKF6ConfigCore6-sr@ijekavian \
locale-libKF6ConfigCore6-sr@ijekavianlatin \
locale-libKF6ConfigCore6-sr@latin \
locale-libKF6ConfigCore6-sv \
locale-libKF6ConfigCore6-ta \
locale-libKF6ConfigCore6-te \
locale-libKF6ConfigCore6-th \
locale-libKF6ConfigCore6-tr \
locale-libKF6ConfigCore6-ug \
locale-libKF6ConfigCore6-uk \
locale-libKF6ConfigCore6-vi \
locale-libKF6ConfigCore6-wa \
locale-libKF6ConfigCore6-zh-CN \
locale-libKF6ConfigCore6-zh-TW"

RDEPENDS:${PN} += "libKF6ConfigCore6"

inherit rpm
