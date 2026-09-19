SUMMARY = "Translations for package simple-scan"
DESCRIPTION = "Provides translations for the 'simple-scan' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "simple-scan-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "1ffacbd235eed38cef139cda6ea0179286d52baad52543a807f6508842d3f697e3a6a6f11de6d8c036b2badc80b23c55078c4f9985954eb6ec7594d4763d72ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-simple-scan-af \
locale-simple-scan-ar \
locale-simple-scan-ast \
locale-simple-scan-az \
locale-simple-scan-be \
locale-simple-scan-bg \
locale-simple-scan-bn \
locale-simple-scan-ca \
locale-simple-scan-ca@valencia \
locale-simple-scan-cs \
locale-simple-scan-da \
locale-simple-scan-de \
locale-simple-scan-el \
locale-simple-scan-en-GB \
locale-simple-scan-eo \
locale-simple-scan-es \
locale-simple-scan-et \
locale-simple-scan-eu \
locale-simple-scan-fa \
locale-simple-scan-fi \
locale-simple-scan-fr \
locale-simple-scan-fur \
locale-simple-scan-gd \
locale-simple-scan-gl \
locale-simple-scan-he \
locale-simple-scan-hi \
locale-simple-scan-hr \
locale-simple-scan-hu \
locale-simple-scan-id \
locale-simple-scan-is \
locale-simple-scan-it \
locale-simple-scan-ja \
locale-simple-scan-ka \
locale-simple-scan-kk \
locale-simple-scan-km \
locale-simple-scan-ko \
locale-simple-scan-lt \
locale-simple-scan-lv \
locale-simple-scan-ml \
locale-simple-scan-ms \
locale-simple-scan-nb \
locale-simple-scan-ne \
locale-simple-scan-nl \
locale-simple-scan-oc \
locale-simple-scan-pa \
locale-simple-scan-pl \
locale-simple-scan-pt \
locale-simple-scan-pt-BR \
locale-simple-scan-ro \
locale-simple-scan-ru \
locale-simple-scan-sk \
locale-simple-scan-sl \
locale-simple-scan-sq \
locale-simple-scan-sr \
locale-simple-scan-sr@latin \
locale-simple-scan-sv \
locale-simple-scan-ta \
locale-simple-scan-te \
locale-simple-scan-th \
locale-simple-scan-tr \
locale-simple-scan-ug \
locale-simple-scan-uk \
locale-simple-scan-vi \
locale-simple-scan-zh-CN \
locale-simple-scan-zh-HK \
locale-simple-scan-zh-TW \
simple-scan-lang \
simple-scan-lang-all"

RDEPENDS:${PN} += "simple-scan"

inherit rpm
