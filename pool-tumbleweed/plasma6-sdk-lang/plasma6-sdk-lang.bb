SUMMARY = "Translations for package plasma6-sdk"
DESCRIPTION = "Provides translations for the 'plasma6-sdk' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-sdk-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "c1085eb69922e9c23052f74e744982781ff02860fc64442a09ab63e4661eac8778616e6d494eff126644426058707c78cb96a34057820e0f07edde9ff2499e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-sdk-ar \
locale-plasma6-sdk-ast \
locale-plasma6-sdk-az \
locale-plasma6-sdk-be \
locale-plasma6-sdk-be@latin \
locale-plasma6-sdk-bg \
locale-plasma6-sdk-bn-IN \
locale-plasma6-sdk-bs \
locale-plasma6-sdk-ca \
locale-plasma6-sdk-ca@valencia \
locale-plasma6-sdk-cs \
locale-plasma6-sdk-da \
locale-plasma6-sdk-de \
locale-plasma6-sdk-el \
locale-plasma6-sdk-en-GB \
locale-plasma6-sdk-eo \
locale-plasma6-sdk-es \
locale-plasma6-sdk-et \
locale-plasma6-sdk-eu \
locale-plasma6-sdk-fa \
locale-plasma6-sdk-fi \
locale-plasma6-sdk-fr \
locale-plasma6-sdk-ga \
locale-plasma6-sdk-gl \
locale-plasma6-sdk-gu \
locale-plasma6-sdk-he \
locale-plasma6-sdk-hi \
locale-plasma6-sdk-hr \
locale-plasma6-sdk-hu \
locale-plasma6-sdk-ia \
locale-plasma6-sdk-id \
locale-plasma6-sdk-is \
locale-plasma6-sdk-it \
locale-plasma6-sdk-ja \
locale-plasma6-sdk-ka \
locale-plasma6-sdk-kk \
locale-plasma6-sdk-km \
locale-plasma6-sdk-kn \
locale-plasma6-sdk-ko \
locale-plasma6-sdk-lt \
locale-plasma6-sdk-lv \
locale-plasma6-sdk-mai \
locale-plasma6-sdk-mk \
locale-plasma6-sdk-ml \
locale-plasma6-sdk-mr \
locale-plasma6-sdk-ms \
locale-plasma6-sdk-nb \
locale-plasma6-sdk-nds \
locale-plasma6-sdk-ne \
locale-plasma6-sdk-nl \
locale-plasma6-sdk-nn \
locale-plasma6-sdk-oc \
locale-plasma6-sdk-or \
locale-plasma6-sdk-pa \
locale-plasma6-sdk-pl \
locale-plasma6-sdk-pt \
locale-plasma6-sdk-pt-BR \
locale-plasma6-sdk-ro \
locale-plasma6-sdk-ru \
locale-plasma6-sdk-si \
locale-plasma6-sdk-sk \
locale-plasma6-sdk-sl \
locale-plasma6-sdk-sq \
locale-plasma6-sdk-sr \
locale-plasma6-sdk-sr@ijekavian \
locale-plasma6-sdk-sr@ijekavianlatin \
locale-plasma6-sdk-sr@latin \
locale-plasma6-sdk-sv \
locale-plasma6-sdk-ta \
locale-plasma6-sdk-te \
locale-plasma6-sdk-th \
locale-plasma6-sdk-tr \
locale-plasma6-sdk-ug \
locale-plasma6-sdk-uk \
locale-plasma6-sdk-wa \
locale-plasma6-sdk-zh-CN \
locale-plasma6-sdk-zh-TW \
plasma6-sdk-lang \
plasma6-sdk-lang-all"

RDEPENDS:${PN} += "plasma6-sdk"

inherit rpm
