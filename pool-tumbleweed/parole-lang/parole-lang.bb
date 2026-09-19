SUMMARY = "Translations for package parole"
DESCRIPTION = "Provides translations for the 'parole' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "parole-lang-4.20.0-1.5.noarch.rpm"
RPM_HASH = "0c9659a3188f5e5123ed0b2f6774e30f708ca60211d4b7a94a77128d400987090303033b754c59aa377fae2c3e6c20157563e5e217dbbff4ab8aca4e2fd24fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parole-ar \
locale-parole-ast \
locale-parole-be \
locale-parole-bg \
locale-parole-ca \
locale-parole-cs \
locale-parole-da \
locale-parole-de \
locale-parole-el \
locale-parole-en-AU \
locale-parole-en-GB \
locale-parole-es \
locale-parole-et \
locale-parole-eu \
locale-parole-fi \
locale-parole-fr \
locale-parole-gl \
locale-parole-he \
locale-parole-hr \
locale-parole-hu \
locale-parole-id \
locale-parole-is \
locale-parole-it \
locale-parole-ja \
locale-parole-kk \
locale-parole-ko \
locale-parole-lt \
locale-parole-lv \
locale-parole-ms \
locale-parole-nb \
locale-parole-nl \
locale-parole-nn \
locale-parole-oc \
locale-parole-pl \
locale-parole-pt \
locale-parole-pt-BR \
locale-parole-ro \
locale-parole-ru \
locale-parole-sk \
locale-parole-sl \
locale-parole-sq \
locale-parole-sr \
locale-parole-sv \
locale-parole-te \
locale-parole-th \
locale-parole-tr \
locale-parole-ug \
locale-parole-uk \
locale-parole-zh-CN \
locale-parole-zh-TW \
parole-lang \
parole-lang-all"

RDEPENDS:${PN} += "parole"

inherit rpm
