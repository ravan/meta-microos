SUMMARY = "Translations for package gtick"
DESCRIPTION = "Provides translations for the 'gtick' package."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-lang-0.5.5-2.7.noarch.rpm"
RPM_HASH = "82071e810806f5816f1239ace3ae6f7f4076a0f44159282fd3c54149933f016ae49d819749f8c81720d6fa20fa7ced9421b50f08392281e010cc38a8929df808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtick-lang \
gtick-lang-all \
locale-gtick-af \
locale-gtick-ca \
locale-gtick-cs \
locale-gtick-da \
locale-gtick-de \
locale-gtick-en@boldquot \
locale-gtick-en@quot \
locale-gtick-eo \
locale-gtick-es \
locale-gtick-eu \
locale-gtick-fa \
locale-gtick-fi \
locale-gtick-fr \
locale-gtick-ga \
locale-gtick-gl \
locale-gtick-hu \
locale-gtick-id \
locale-gtick-it \
locale-gtick-ko \
locale-gtick-nl \
locale-gtick-pl \
locale-gtick-pt-BR \
locale-gtick-ro \
locale-gtick-ru \
locale-gtick-sk \
locale-gtick-sr \
locale-gtick-sv \
locale-gtick-uk \
locale-gtick-vi \
locale-gtick-zh-CN"

RDEPENDS:${PN} += "gtick"

inherit rpm
