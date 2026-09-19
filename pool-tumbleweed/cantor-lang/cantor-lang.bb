SUMMARY = "Translations for package cantor"
DESCRIPTION = "Provides translations for the 'cantor' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "cantor-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "6def752ccc29c888b7741f8e1bb4f2e6df4e78b5ce4f5fb74b1f5ea1feb4ec37040cd1f952d57ce915ad4b4ba2f66d8bed29e8b4192266523daa8f62c91592c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantor-lang \
cantor-lang-all \
locale-cantor-ar \
locale-cantor-bs \
locale-cantor-ca \
locale-cantor-ca@valencia \
locale-cantor-cs \
locale-cantor-da \
locale-cantor-de \
locale-cantor-el \
locale-cantor-en-GB \
locale-cantor-eo \
locale-cantor-es \
locale-cantor-et \
locale-cantor-eu \
locale-cantor-fi \
locale-cantor-fr \
locale-cantor-ga \
locale-cantor-gl \
locale-cantor-he \
locale-cantor-hi \
locale-cantor-hr \
locale-cantor-hu \
locale-cantor-ia \
locale-cantor-it \
locale-cantor-ja \
locale-cantor-ka \
locale-cantor-kk \
locale-cantor-ko \
locale-cantor-lt \
locale-cantor-lv \
locale-cantor-ml \
locale-cantor-mr \
locale-cantor-nb \
locale-cantor-nds \
locale-cantor-nl \
locale-cantor-nn \
locale-cantor-pa \
locale-cantor-pl \
locale-cantor-pt \
locale-cantor-pt-BR \
locale-cantor-ro \
locale-cantor-ru \
locale-cantor-sk \
locale-cantor-sl \
locale-cantor-sv \
locale-cantor-ta \
locale-cantor-th \
locale-cantor-tr \
locale-cantor-ug \
locale-cantor-uk \
locale-cantor-zh-CN \
locale-cantor-zh-TW"

RDEPENDS:${PN} += "cantor"

inherit rpm
