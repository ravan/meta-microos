SUMMARY = "Translations for package hexchat"
DESCRIPTION = "Provides translations for the 'hexchat' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.2"

RPM_NAME = "hexchat-lang-2.16.2-4.1.noarch.rpm"
RPM_HASH = "b1f9941cbf1cbad3e75173e53e74b69043b5915595de3b5a8d24ca098aec89662213a083314ab341d6dc3e1341c1d3e3a14101266dcc9e1691d75db5a02774c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hexchat-lang \
hexchat-lang-all \
locale-hexchat-af \
locale-hexchat-ast \
locale-hexchat-az \
locale-hexchat-be \
locale-hexchat-bg \
locale-hexchat-ca \
locale-hexchat-cs \
locale-hexchat-da \
locale-hexchat-de \
locale-hexchat-el \
locale-hexchat-en-GB \
locale-hexchat-es \
locale-hexchat-et \
locale-hexchat-eu \
locale-hexchat-fi \
locale-hexchat-fr \
locale-hexchat-gl \
locale-hexchat-gu \
locale-hexchat-hi \
locale-hexchat-hu \
locale-hexchat-id \
locale-hexchat-it \
locale-hexchat-kn \
locale-hexchat-ko \
locale-hexchat-lt \
locale-hexchat-lv \
locale-hexchat-mk \
locale-hexchat-ml \
locale-hexchat-ms \
locale-hexchat-nb \
locale-hexchat-nl \
locale-hexchat-pa \
locale-hexchat-pl \
locale-hexchat-pt \
locale-hexchat-pt-BR \
locale-hexchat-ru \
locale-hexchat-sk \
locale-hexchat-sl \
locale-hexchat-sq \
locale-hexchat-sr \
locale-hexchat-sr@latin \
locale-hexchat-sv \
locale-hexchat-th \
locale-hexchat-tr \
locale-hexchat-uk \
locale-hexchat-vi \
locale-hexchat-wa \
locale-hexchat-zh-CN \
locale-hexchat-zh-TW"

RDEPENDS:${PN} += "hexchat"

inherit rpm
