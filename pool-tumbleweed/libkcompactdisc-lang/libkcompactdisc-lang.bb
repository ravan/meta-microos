SUMMARY = "Translations for package libkcompactdisc"
DESCRIPTION = "Provides translations for package libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "25.12.3"

RPM_NAME = "libkcompactdisc-lang-25.12.3-1.3.noarch.rpm"
RPM_HASH = "b07e32c0bab59b8986668ab9b06da2683ade5f9af8eb2dc85ae25bf7098ca1f27d7665eace7d06b6ba5b215a52c4f84ce51ac7b16f523c03250326c3178792f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkcompactdisc-lang \
libkcompactdisc-lang-all \
locale-libkcompactdisc-ar \
locale-libkcompactdisc-ast \
locale-libkcompactdisc-be \
locale-libkcompactdisc-bg \
locale-libkcompactdisc-bs \
locale-libkcompactdisc-ca \
locale-libkcompactdisc-ca@valencia \
locale-libkcompactdisc-cs \
locale-libkcompactdisc-da \
locale-libkcompactdisc-de \
locale-libkcompactdisc-el \
locale-libkcompactdisc-en-GB \
locale-libkcompactdisc-eo \
locale-libkcompactdisc-es \
locale-libkcompactdisc-et \
locale-libkcompactdisc-eu \
locale-libkcompactdisc-fi \
locale-libkcompactdisc-fr \
locale-libkcompactdisc-ga \
locale-libkcompactdisc-gl \
locale-libkcompactdisc-he \
locale-libkcompactdisc-hi \
locale-libkcompactdisc-hr \
locale-libkcompactdisc-hu \
locale-libkcompactdisc-ia \
locale-libkcompactdisc-is \
locale-libkcompactdisc-it \
locale-libkcompactdisc-ja \
locale-libkcompactdisc-ka \
locale-libkcompactdisc-kk \
locale-libkcompactdisc-km \
locale-libkcompactdisc-ko \
locale-libkcompactdisc-lt \
locale-libkcompactdisc-lv \
locale-libkcompactdisc-mk \
locale-libkcompactdisc-mr \
locale-libkcompactdisc-nb \
locale-libkcompactdisc-nds \
locale-libkcompactdisc-nl \
locale-libkcompactdisc-nn \
locale-libkcompactdisc-oc \
locale-libkcompactdisc-pa \
locale-libkcompactdisc-pl \
locale-libkcompactdisc-pt \
locale-libkcompactdisc-pt-BR \
locale-libkcompactdisc-ro \
locale-libkcompactdisc-ru \
locale-libkcompactdisc-sk \
locale-libkcompactdisc-sl \
locale-libkcompactdisc-sq \
locale-libkcompactdisc-sr \
locale-libkcompactdisc-sr@ijekavian \
locale-libkcompactdisc-sr@ijekavianlatin \
locale-libkcompactdisc-sr@latin \
locale-libkcompactdisc-sv \
locale-libkcompactdisc-ta \
locale-libkcompactdisc-th \
locale-libkcompactdisc-tr \
locale-libkcompactdisc-ug \
locale-libkcompactdisc-uk \
locale-libkcompactdisc-wa \
locale-libkcompactdisc-zh-CN \
locale-libkcompactdisc-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
