SUMMARY = "Translations for package kongress"
DESCRIPTION = "Provides translations for the 'kongress' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kongress-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "9bd809476a43eca53801aa65a9d5bf57d12c701e75ec2a349febc8e9184b49357fedc8e37d26013cec1e49008288848dd9f4050411d4ed2e67d6744856cef962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kongress-lang \
kongress-lang-all \
locale-kongress-ar \
locale-kongress-ast \
locale-kongress-ca \
locale-kongress-ca@valencia \
locale-kongress-cs \
locale-kongress-da \
locale-kongress-de \
locale-kongress-el \
locale-kongress-en-GB \
locale-kongress-eo \
locale-kongress-es \
locale-kongress-et \
locale-kongress-eu \
locale-kongress-fi \
locale-kongress-fr \
locale-kongress-ga \
locale-kongress-gl \
locale-kongress-he \
locale-kongress-hi \
locale-kongress-ia \
locale-kongress-it \
locale-kongress-ja \
locale-kongress-ka \
locale-kongress-ko \
locale-kongress-lt \
locale-kongress-lv \
locale-kongress-nl \
locale-kongress-nn \
locale-kongress-pa \
locale-kongress-pl \
locale-kongress-pt \
locale-kongress-pt-BR \
locale-kongress-ro \
locale-kongress-ru \
locale-kongress-sk \
locale-kongress-sl \
locale-kongress-sv \
locale-kongress-tr \
locale-kongress-ug \
locale-kongress-uk \
locale-kongress-zh-CN \
locale-kongress-zh-TW"

RDEPENDS:${PN} += "kongress"

inherit rpm
