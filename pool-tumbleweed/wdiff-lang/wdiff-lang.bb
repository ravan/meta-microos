SUMMARY = "Translations for package wdiff"
DESCRIPTION = "Provides translations for the 'wdiff' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.3"

RPM_NAME = "wdiff-lang-1.2.3-1.1.noarch.rpm"
RPM_HASH = "0c9879a02406a93d0cf859e3f87cc7f04ae30d93fc9aaefb178ca6c7da2b8e279aa70e709b20153d38b340d278bc7b984002bde7a48c806a2fe92cc428e2c4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wdiff-ca \
locale-wdiff-cs \
locale-wdiff-da \
locale-wdiff-de \
locale-wdiff-en-GB \
locale-wdiff-eo \
locale-wdiff-es \
locale-wdiff-et \
locale-wdiff-fi \
locale-wdiff-fr \
locale-wdiff-ga \
locale-wdiff-gl \
locale-wdiff-hu \
locale-wdiff-id \
locale-wdiff-it \
locale-wdiff-ka \
locale-wdiff-ms \
locale-wdiff-nb \
locale-wdiff-nl \
locale-wdiff-pl \
locale-wdiff-pt-BR \
locale-wdiff-ro \
locale-wdiff-ru \
locale-wdiff-sk \
locale-wdiff-sl \
locale-wdiff-sr \
locale-wdiff-sv \
locale-wdiff-tr \
locale-wdiff-uk \
locale-wdiff-vi \
locale-wdiff-zh-CN \
locale-wdiff-zh-TW \
wdiff-lang \
wdiff-lang-all"

RDEPENDS:${PN} += "wdiff"

inherit rpm
