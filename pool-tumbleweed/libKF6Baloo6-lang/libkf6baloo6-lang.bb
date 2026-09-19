SUMMARY = "Translations for package libKF6Baloo6"
DESCRIPTION = "Provides translations for the 'libKF6Baloo6' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6Baloo6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "f8e2b2d0d12b7835ff5c3ab9f10520bf6d69d9793fb7383ff336ff7da1b4567d2d2fbb1be78598230452c11ac913376e58c2318f8508b36e926c7a14356b45db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Baloo6-lang \
libKF6Baloo6-lang-all \
locale-libKF6Baloo6-ar \
locale-libKF6Baloo6-ast \
locale-libKF6Baloo6-az \
locale-libKF6Baloo6-bg \
locale-libKF6Baloo6-bs \
locale-libKF6Baloo6-ca \
locale-libKF6Baloo6-ca@valencia \
locale-libKF6Baloo6-cs \
locale-libKF6Baloo6-da \
locale-libKF6Baloo6-de \
locale-libKF6Baloo6-el \
locale-libKF6Baloo6-en-GB \
locale-libKF6Baloo6-eo \
locale-libKF6Baloo6-es \
locale-libKF6Baloo6-et \
locale-libKF6Baloo6-eu \
locale-libKF6Baloo6-fi \
locale-libKF6Baloo6-fr \
locale-libKF6Baloo6-ga \
locale-libKF6Baloo6-gd \
locale-libKF6Baloo6-gl \
locale-libKF6Baloo6-he \
locale-libKF6Baloo6-hi \
locale-libKF6Baloo6-hr \
locale-libKF6Baloo6-hu \
locale-libKF6Baloo6-ia \
locale-libKF6Baloo6-id \
locale-libKF6Baloo6-is \
locale-libKF6Baloo6-it \
locale-libKF6Baloo6-ja \
locale-libKF6Baloo6-ka \
locale-libKF6Baloo6-ko \
locale-libKF6Baloo6-lt \
locale-libKF6Baloo6-lv \
locale-libKF6Baloo6-ml \
locale-libKF6Baloo6-nb \
locale-libKF6Baloo6-nds \
locale-libKF6Baloo6-nl \
locale-libKF6Baloo6-nn \
locale-libKF6Baloo6-pa \
locale-libKF6Baloo6-pl \
locale-libKF6Baloo6-pt \
locale-libKF6Baloo6-pt-BR \
locale-libKF6Baloo6-ro \
locale-libKF6Baloo6-ru \
locale-libKF6Baloo6-sk \
locale-libKF6Baloo6-sl \
locale-libKF6Baloo6-sr \
locale-libKF6Baloo6-sr@ijekavian \
locale-libKF6Baloo6-sr@ijekavianlatin \
locale-libKF6Baloo6-sr@latin \
locale-libKF6Baloo6-sv \
locale-libKF6Baloo6-ta \
locale-libKF6Baloo6-tr \
locale-libKF6Baloo6-ug \
locale-libKF6Baloo6-uk \
locale-libKF6Baloo6-zh-CN \
locale-libKF6Baloo6-zh-TW"

RDEPENDS:${PN} += "libKF6Baloo6"

inherit rpm
