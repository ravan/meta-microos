SUMMARY = "Translations for package tokodon"
DESCRIPTION = "Provides translations for the 'tokodon' package."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "tokodon-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "8a105a3f6ec93b2bac88284f0191fa53508587fd17b1a8de812d38ff0a6c3f5b42047548eb4e541e44b7a05c6524cdb4fd2fa1bd8850e0c52d677658ebfaf85d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tokodon-ar \
locale-tokodon-ast \
locale-tokodon-ca \
locale-tokodon-ca@valencia \
locale-tokodon-cs \
locale-tokodon-de \
locale-tokodon-en-GB \
locale-tokodon-eo \
locale-tokodon-es \
locale-tokodon-eu \
locale-tokodon-fa \
locale-tokodon-fi \
locale-tokodon-fr \
locale-tokodon-ga \
locale-tokodon-gl \
locale-tokodon-he \
locale-tokodon-hi \
locale-tokodon-hu \
locale-tokodon-ia \
locale-tokodon-id \
locale-tokodon-is \
locale-tokodon-it \
locale-tokodon-ja \
locale-tokodon-ka \
locale-tokodon-ko \
locale-tokodon-lt \
locale-tokodon-lv \
locale-tokodon-nl \
locale-tokodon-nn \
locale-tokodon-pa \
locale-tokodon-pl \
locale-tokodon-pt \
locale-tokodon-pt-BR \
locale-tokodon-ru \
locale-tokodon-sk \
locale-tokodon-sl \
locale-tokodon-sq \
locale-tokodon-sv \
locale-tokodon-tr \
locale-tokodon-ug \
locale-tokodon-uk \
locale-tokodon-zh-CN \
locale-tokodon-zh-TW \
tokodon-lang \
tokodon-lang-all"

RDEPENDS:${PN} += "tokodon"

inherit rpm
