SUMMARY = "Translations for package folks"
DESCRIPTION = "Provides translations for the 'folks' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "folks-lang-0.15.12-2.4.noarch.rpm"
RPM_HASH = "e5c6fc8177d0aeebccbe5671f27b87f3294ef94934cdf5a568fda894a96096da883e7180d935d1c648b964653fc26dc035ce964a16f42ba30635a748006d7bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folks-lang \
folks-lang-all \
locale-folks-ar \
locale-folks-as \
locale-folks-be \
locale-folks-bg \
locale-folks-bn-IN \
locale-folks-bs \
locale-folks-ca \
locale-folks-ca@valencia \
locale-folks-cs \
locale-folks-da \
locale-folks-de \
locale-folks-el \
locale-folks-en-GB \
locale-folks-eo \
locale-folks-es \
locale-folks-eu \
locale-folks-fa \
locale-folks-fi \
locale-folks-fr \
locale-folks-fur \
locale-folks-gl \
locale-folks-gu \
locale-folks-he \
locale-folks-hi \
locale-folks-hr \
locale-folks-hu \
locale-folks-id \
locale-folks-it \
locale-folks-ja \
locale-folks-ka \
locale-folks-kk \
locale-folks-kn \
locale-folks-ko \
locale-folks-lt \
locale-folks-lv \
locale-folks-ml \
locale-folks-mr \
locale-folks-ms \
locale-folks-nb \
locale-folks-ne \
locale-folks-nl \
locale-folks-oc \
locale-folks-or \
locale-folks-pa \
locale-folks-pl \
locale-folks-pt \
locale-folks-pt-BR \
locale-folks-ro \
locale-folks-ru \
locale-folks-sk \
locale-folks-sl \
locale-folks-sr \
locale-folks-sr@latin \
locale-folks-sv \
locale-folks-ta \
locale-folks-te \
locale-folks-th \
locale-folks-tr \
locale-folks-ug \
locale-folks-uk \
locale-folks-vi \
locale-folks-zh-CN \
locale-folks-zh-HK \
locale-folks-zh-TW"

RDEPENDS:${PN} += "folks"

inherit rpm
