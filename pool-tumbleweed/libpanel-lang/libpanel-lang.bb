SUMMARY = "Translations for package libpanel"
DESCRIPTION = "Provides translations for the 'libpanel' package."
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "libpanel-lang-1.10.4-2.3.noarch.rpm"
RPM_HASH = "7d9ad4dfeda2bbcde599eb9eb30b6fa69cc009f6c27439141c7a431b2eabf2d7c38552abd45480658e389eb26fad96f60d79ce41153cd291c33a14909ce4096e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpanel-lang \
libpanel-lang-all \
locale-libpanel-be \
locale-libpanel-bg \
locale-libpanel-ca \
locale-libpanel-cs \
locale-libpanel-da \
locale-libpanel-de \
locale-libpanel-el \
locale-libpanel-en-GB \
locale-libpanel-eo \
locale-libpanel-es \
locale-libpanel-eu \
locale-libpanel-fa \
locale-libpanel-fi \
locale-libpanel-fr \
locale-libpanel-fur \
locale-libpanel-gl \
locale-libpanel-he \
locale-libpanel-hi \
locale-libpanel-hr \
locale-libpanel-hu \
locale-libpanel-id \
locale-libpanel-is \
locale-libpanel-it \
locale-libpanel-ka \
locale-libpanel-kk \
locale-libpanel-ko \
locale-libpanel-lt \
locale-libpanel-lv \
locale-libpanel-nb \
locale-libpanel-ne \
locale-libpanel-nl \
locale-libpanel-oc \
locale-libpanel-pa \
locale-libpanel-pl \
locale-libpanel-pt \
locale-libpanel-pt-BR \
locale-libpanel-ro \
locale-libpanel-ru \
locale-libpanel-sk \
locale-libpanel-sl \
locale-libpanel-sr \
locale-libpanel-sv \
locale-libpanel-tr \
locale-libpanel-ug \
locale-libpanel-uk \
locale-libpanel-zh-CN \
locale-libpanel-zh-TW"

RDEPENDS:${PN} += "libpanel"

inherit rpm
