SUMMARY = "Translations for package libxfce4windowing"
DESCRIPTION = "Provides translations for the 'libxfce4windowing' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "libxfce4windowing-lang-4.20.7-1.1.noarch.rpm"
RPM_HASH = "ad94bfdd079686c7a51bbf4318524620039c746ecb4c9c22fa5a284875392c79d7e43467a12b639f403d843ee7b346a2f1cd27f0ac77f542c3ca1fcee85c9d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4windowing-lang \
libxfce4windowing-lang-all \
locale-libxfce4windowing-ar \
locale-libxfce4windowing-ast \
locale-libxfce4windowing-bg \
locale-libxfce4windowing-ca \
locale-libxfce4windowing-cs \
locale-libxfce4windowing-da \
locale-libxfce4windowing-de \
locale-libxfce4windowing-el \
locale-libxfce4windowing-en-CA \
locale-libxfce4windowing-en-GB \
locale-libxfce4windowing-eo \
locale-libxfce4windowing-es \
locale-libxfce4windowing-et \
locale-libxfce4windowing-fi \
locale-libxfce4windowing-fr \
locale-libxfce4windowing-ga \
locale-libxfce4windowing-gl \
locale-libxfce4windowing-he \
locale-libxfce4windowing-hr \
locale-libxfce4windowing-hu \
locale-libxfce4windowing-id \
locale-libxfce4windowing-it \
locale-libxfce4windowing-ja \
locale-libxfce4windowing-ka \
locale-libxfce4windowing-kk \
locale-libxfce4windowing-ko \
locale-libxfce4windowing-lt \
locale-libxfce4windowing-nb \
locale-libxfce4windowing-nl \
locale-libxfce4windowing-oc \
locale-libxfce4windowing-pl \
locale-libxfce4windowing-pt \
locale-libxfce4windowing-pt-BR \
locale-libxfce4windowing-ro \
locale-libxfce4windowing-ru \
locale-libxfce4windowing-sk \
locale-libxfce4windowing-sl \
locale-libxfce4windowing-sq \
locale-libxfce4windowing-sr \
locale-libxfce4windowing-sv \
locale-libxfce4windowing-th \
locale-libxfce4windowing-tr \
locale-libxfce4windowing-ug \
locale-libxfce4windowing-uk \
locale-libxfce4windowing-vi \
locale-libxfce4windowing-zh-CN \
locale-libxfce4windowing-zh-TW"

RDEPENDS:${PN} += "libxfce4windowing"

inherit rpm
