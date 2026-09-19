SUMMARY = "Translations for package libpeas"
DESCRIPTION = "Provides translations for the 'libpeas' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "libpeas-lang-1.38.1-1.3.noarch.rpm"
RPM_HASH = "a76447a20603ec8f9d58081d73070283b2a2292e96a90d20143a945222f59a2f55896256bafbac20ad50a29f4f06014a8564c3a0bea2133d122ea7b273dc82ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpeas-lang \
libpeas-lang-all \
locale-libpeas-ar \
locale-libpeas-as \
locale-libpeas-ast \
locale-libpeas-be \
locale-libpeas-bg \
locale-libpeas-bn-IN \
locale-libpeas-bs \
locale-libpeas-ca \
locale-libpeas-ca@valencia \
locale-libpeas-cs \
locale-libpeas-da \
locale-libpeas-de \
locale-libpeas-el \
locale-libpeas-en-GB \
locale-libpeas-eo \
locale-libpeas-es \
locale-libpeas-et \
locale-libpeas-eu \
locale-libpeas-fa \
locale-libpeas-fi \
locale-libpeas-fr \
locale-libpeas-fur \
locale-libpeas-gl \
locale-libpeas-gu \
locale-libpeas-he \
locale-libpeas-hi \
locale-libpeas-hr \
locale-libpeas-hu \
locale-libpeas-id \
locale-libpeas-is \
locale-libpeas-it \
locale-libpeas-ja \
locale-libpeas-ka \
locale-libpeas-kk \
locale-libpeas-kn \
locale-libpeas-ko \
locale-libpeas-lt \
locale-libpeas-lv \
locale-libpeas-ml \
locale-libpeas-mr \
locale-libpeas-ms \
locale-libpeas-nb \
locale-libpeas-nds \
locale-libpeas-ne \
locale-libpeas-nl \
locale-libpeas-oc \
locale-libpeas-or \
locale-libpeas-pa \
locale-libpeas-pl \
locale-libpeas-pt \
locale-libpeas-pt-BR \
locale-libpeas-ro \
locale-libpeas-ru \
locale-libpeas-sk \
locale-libpeas-sl \
locale-libpeas-sr \
locale-libpeas-sr@latin \
locale-libpeas-sv \
locale-libpeas-ta \
locale-libpeas-te \
locale-libpeas-th \
locale-libpeas-tr \
locale-libpeas-ug \
locale-libpeas-uk \
locale-libpeas-vi \
locale-libpeas-zh-CN \
locale-libpeas-zh-HK \
locale-libpeas-zh-TW"

RDEPENDS:${PN} += "libpeas"

inherit rpm
