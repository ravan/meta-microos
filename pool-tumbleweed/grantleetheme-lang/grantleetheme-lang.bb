SUMMARY = "Translations for package grantleetheme"
DESCRIPTION = "Provides translations for the 'grantleetheme' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "grantleetheme-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5f3e68e5a08ea5c30661fedb2f9d664557aae567ae03af8b748f272d619a3bc4022399f1927f89713d88215399b65a23a66808aece0496e140f7f8a812e2a750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantleetheme-lang \
grantleetheme-lang-all \
locale-grantleetheme-ar \
locale-grantleetheme-ast \
locale-grantleetheme-bg \
locale-grantleetheme-bs \
locale-grantleetheme-ca \
locale-grantleetheme-ca@valencia \
locale-grantleetheme-cs \
locale-grantleetheme-da \
locale-grantleetheme-de \
locale-grantleetheme-el \
locale-grantleetheme-en-GB \
locale-grantleetheme-eo \
locale-grantleetheme-es \
locale-grantleetheme-et \
locale-grantleetheme-eu \
locale-grantleetheme-fi \
locale-grantleetheme-fr \
locale-grantleetheme-ga \
locale-grantleetheme-gl \
locale-grantleetheme-he \
locale-grantleetheme-hi \
locale-grantleetheme-hu \
locale-grantleetheme-ia \
locale-grantleetheme-it \
locale-grantleetheme-ja \
locale-grantleetheme-ka \
locale-grantleetheme-kk \
locale-grantleetheme-ko \
locale-grantleetheme-lt \
locale-grantleetheme-lv \
locale-grantleetheme-nb \
locale-grantleetheme-nds \
locale-grantleetheme-nl \
locale-grantleetheme-nn \
locale-grantleetheme-pl \
locale-grantleetheme-pt \
locale-grantleetheme-pt-BR \
locale-grantleetheme-ro \
locale-grantleetheme-ru \
locale-grantleetheme-sk \
locale-grantleetheme-sl \
locale-grantleetheme-sr \
locale-grantleetheme-sr@ijekavian \
locale-grantleetheme-sr@ijekavianlatin \
locale-grantleetheme-sr@latin \
locale-grantleetheme-sv \
locale-grantleetheme-ta \
locale-grantleetheme-tr \
locale-grantleetheme-ug \
locale-grantleetheme-uk \
locale-grantleetheme-zh-CN \
locale-grantleetheme-zh-TW"

RDEPENDS:${PN} += "grantleetheme"

inherit rpm
