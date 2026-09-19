SUMMARY = "Translations for package libKF6Contacts6"
DESCRIPTION = "Provides translations for the 'libKF6Contacts6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Contacts6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "b0ef563eab379c9b64dbbedb87d0d305c56ef0b5620379b134acb83b3ef8b834730c5f4e922e096f47f63c25906045ca4920bdee5683baeaec25eb20b48a2ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Contacts6-lang \
libKF6Contacts6-lang-all \
locale-libKF6Contacts6-ar \
locale-libKF6Contacts6-ast \
locale-libKF6Contacts6-az \
locale-libKF6Contacts6-be \
locale-libKF6Contacts6-bg \
locale-libKF6Contacts6-bs \
locale-libKF6Contacts6-ca \
locale-libKF6Contacts6-ca@valencia \
locale-libKF6Contacts6-cs \
locale-libKF6Contacts6-da \
locale-libKF6Contacts6-de \
locale-libKF6Contacts6-el \
locale-libKF6Contacts6-en-GB \
locale-libKF6Contacts6-eo \
locale-libKF6Contacts6-es \
locale-libKF6Contacts6-et \
locale-libKF6Contacts6-eu \
locale-libKF6Contacts6-fi \
locale-libKF6Contacts6-fr \
locale-libKF6Contacts6-ga \
locale-libKF6Contacts6-gl \
locale-libKF6Contacts6-he \
locale-libKF6Contacts6-hi \
locale-libKF6Contacts6-hu \
locale-libKF6Contacts6-ia \
locale-libKF6Contacts6-id \
locale-libKF6Contacts6-it \
locale-libKF6Contacts6-ja \
locale-libKF6Contacts6-ka \
locale-libKF6Contacts6-kk \
locale-libKF6Contacts6-km \
locale-libKF6Contacts6-ko \
locale-libKF6Contacts6-lt \
locale-libKF6Contacts6-lv \
locale-libKF6Contacts6-mai \
locale-libKF6Contacts6-ml \
locale-libKF6Contacts6-mr \
locale-libKF6Contacts6-nb \
locale-libKF6Contacts6-nds \
locale-libKF6Contacts6-nl \
locale-libKF6Contacts6-nn \
locale-libKF6Contacts6-pa \
locale-libKF6Contacts6-pl \
locale-libKF6Contacts6-pt \
locale-libKF6Contacts6-pt-BR \
locale-libKF6Contacts6-ro \
locale-libKF6Contacts6-ru \
locale-libKF6Contacts6-sk \
locale-libKF6Contacts6-sl \
locale-libKF6Contacts6-sq \
locale-libKF6Contacts6-sr \
locale-libKF6Contacts6-sr@ijekavian \
locale-libKF6Contacts6-sr@ijekavianlatin \
locale-libKF6Contacts6-sr@latin \
locale-libKF6Contacts6-sv \
locale-libKF6Contacts6-ta \
locale-libKF6Contacts6-th \
locale-libKF6Contacts6-tr \
locale-libKF6Contacts6-ug \
locale-libKF6Contacts6-uk \
locale-libKF6Contacts6-zh-CN \
locale-libKF6Contacts6-zh-TW"

RDEPENDS:${PN} += "libKF6Contacts6"

inherit rpm
