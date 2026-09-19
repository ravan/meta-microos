SUMMARY = "Translations for package kirigami-addons6"
DESCRIPTION = "Provides translations for kirigami-addons6."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "kirigami-addons6-lang-1.13.0-1.2.noarch.rpm"
RPM_HASH = "067ebe183c3c8a0b12394872fcdb1f9f08b06bb725b0692b762c31269f24b8a3d725cb0dde124b1fe24d73866e48f1bbc05a24e2226d54f2bdc8967a6c1919ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-addons6-lang \
kirigami-addons6-lang-all \
locale-kirigami-addons6-ar \
locale-kirigami-addons6-ast \
locale-kirigami-addons6-az \
locale-kirigami-addons6-bg \
locale-kirigami-addons6-ca \
locale-kirigami-addons6-ca@valencia \
locale-kirigami-addons6-cs \
locale-kirigami-addons6-de \
locale-kirigami-addons6-el \
locale-kirigami-addons6-en-GB \
locale-kirigami-addons6-eo \
locale-kirigami-addons6-es \
locale-kirigami-addons6-eu \
locale-kirigami-addons6-fi \
locale-kirigami-addons6-fr \
locale-kirigami-addons6-ga \
locale-kirigami-addons6-gl \
locale-kirigami-addons6-he \
locale-kirigami-addons6-hi \
locale-kirigami-addons6-hu \
locale-kirigami-addons6-ia \
locale-kirigami-addons6-is \
locale-kirigami-addons6-it \
locale-kirigami-addons6-ja \
locale-kirigami-addons6-ka \
locale-kirigami-addons6-ko \
locale-kirigami-addons6-lt \
locale-kirigami-addons6-lv \
locale-kirigami-addons6-nb \
locale-kirigami-addons6-nl \
locale-kirigami-addons6-nn \
locale-kirigami-addons6-pl \
locale-kirigami-addons6-pt \
locale-kirigami-addons6-pt-BR \
locale-kirigami-addons6-ro \
locale-kirigami-addons6-ru \
locale-kirigami-addons6-sk \
locale-kirigami-addons6-sl \
locale-kirigami-addons6-sv \
locale-kirigami-addons6-ta \
locale-kirigami-addons6-tr \
locale-kirigami-addons6-ug \
locale-kirigami-addons6-uk \
locale-kirigami-addons6-zh-CN \
locale-kirigami-addons6-zh-TW"

RDEPENDS:${PN} += "kirigami-addons6"

inherit rpm
