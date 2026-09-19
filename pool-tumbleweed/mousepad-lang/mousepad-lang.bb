SUMMARY = "Translations for package mousepad"
DESCRIPTION = "Provides translations for the 'mousepad' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "mousepad-lang-0.7.0-1.2.noarch.rpm"
RPM_HASH = "e43f6746cbb65734090b404f9a001083222d559e56189b756b63fc99e97f25160563a9a595f857a5a743be9b19755952b9cc36e172ef69a98e5b8faed77ba9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mousepad-ar \
locale-mousepad-ast \
locale-mousepad-be \
locale-mousepad-bg \
locale-mousepad-ca \
locale-mousepad-cs \
locale-mousepad-da \
locale-mousepad-de \
locale-mousepad-el \
locale-mousepad-en-AU \
locale-mousepad-en-GB \
locale-mousepad-es \
locale-mousepad-et \
locale-mousepad-eu \
locale-mousepad-fi \
locale-mousepad-fr \
locale-mousepad-gl \
locale-mousepad-he \
locale-mousepad-hr \
locale-mousepad-hu \
locale-mousepad-id \
locale-mousepad-is \
locale-mousepad-it \
locale-mousepad-ja \
locale-mousepad-kk \
locale-mousepad-ko \
locale-mousepad-lt \
locale-mousepad-ms \
locale-mousepad-nb \
locale-mousepad-nl \
locale-mousepad-nn \
locale-mousepad-oc \
locale-mousepad-pl \
locale-mousepad-pt \
locale-mousepad-pt-BR \
locale-mousepad-ro \
locale-mousepad-ru \
locale-mousepad-sk \
locale-mousepad-sl \
locale-mousepad-sq \
locale-mousepad-sr \
locale-mousepad-sv \
locale-mousepad-te \
locale-mousepad-th \
locale-mousepad-tr \
locale-mousepad-ug \
locale-mousepad-uk \
locale-mousepad-vi \
locale-mousepad-zh-CN \
locale-mousepad-zh-TW \
mousepad-lang \
mousepad-lang-all"

RDEPENDS:${PN} += "mousepad"

inherit rpm
