SUMMARY = "Translations for libKSaneWidgets6 and libKF5Sane6"
DESCRIPTION = "Provides translations for packages libKSaneWidgets6 and libKF5Sane6."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libksane-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "81ba7da4d620b29430c75babd6805bc7adcd6d371dcddd6ed173e7c7905be8d3c5fca3df6fd477abfedcbf8aea914169f6efbf8e02141f251ae8c17f74c4f746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksane-lang \
libksane-lang-all \
locale-libksane-ar \
locale-libksane-be \
locale-libksane-bg \
locale-libksane-bs \
locale-libksane-ca \
locale-libksane-ca@valencia \
locale-libksane-cs \
locale-libksane-da \
locale-libksane-de \
locale-libksane-el \
locale-libksane-en-GB \
locale-libksane-eo \
locale-libksane-es \
locale-libksane-et \
locale-libksane-eu \
locale-libksane-fi \
locale-libksane-fr \
locale-libksane-ga \
locale-libksane-gl \
locale-libksane-he \
locale-libksane-hi \
locale-libksane-hr \
locale-libksane-hu \
locale-libksane-ia \
locale-libksane-id \
locale-libksane-is \
locale-libksane-it \
locale-libksane-ja \
locale-libksane-ka \
locale-libksane-kk \
locale-libksane-km \
locale-libksane-ko \
locale-libksane-lt \
locale-libksane-lv \
locale-libksane-ml \
locale-libksane-mr \
locale-libksane-nb \
locale-libksane-nds \
locale-libksane-nl \
locale-libksane-nn \
locale-libksane-oc \
locale-libksane-pa \
locale-libksane-pl \
locale-libksane-pt \
locale-libksane-pt-BR \
locale-libksane-ro \
locale-libksane-ru \
locale-libksane-sk \
locale-libksane-sl \
locale-libksane-sq \
locale-libksane-sv \
locale-libksane-th \
locale-libksane-tr \
locale-libksane-ug \
locale-libksane-uk \
locale-libksane-wa \
locale-libksane-zh-CN \
locale-libksane-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
