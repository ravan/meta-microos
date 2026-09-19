SUMMARY = "Translations for package qrca"
DESCRIPTION = "Provides translations for the 'qrca' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "qrca-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "caf7d5caf1fc43dc6dffe7f62c5ec7cbb5b3a835d05f45c33c34f5522671be67c81df19533f7642478669b4a0b5fb5d776fb5385caf3fd7749b3ef3163cd8710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qrca-ar \
locale-qrca-ast \
locale-qrca-ca \
locale-qrca-ca@valencia \
locale-qrca-cs \
locale-qrca-de \
locale-qrca-en-GB \
locale-qrca-eo \
locale-qrca-es \
locale-qrca-et \
locale-qrca-eu \
locale-qrca-fi \
locale-qrca-fr \
locale-qrca-ga \
locale-qrca-gl \
locale-qrca-he \
locale-qrca-hi \
locale-qrca-hu \
locale-qrca-ia \
locale-qrca-is \
locale-qrca-it \
locale-qrca-ja \
locale-qrca-ka \
locale-qrca-ko \
locale-qrca-lt \
locale-qrca-lv \
locale-qrca-nl \
locale-qrca-nn \
locale-qrca-pa \
locale-qrca-pl \
locale-qrca-pt \
locale-qrca-pt-BR \
locale-qrca-ru \
locale-qrca-sk \
locale-qrca-sl \
locale-qrca-sv \
locale-qrca-tr \
locale-qrca-ug \
locale-qrca-uk \
locale-qrca-zh-CN \
locale-qrca-zh-TW \
qrca-lang \
qrca-lang-all"

RDEPENDS:${PN} += "qrca"

inherit rpm
