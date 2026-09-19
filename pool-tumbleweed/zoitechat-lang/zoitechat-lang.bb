SUMMARY = "Translations for package zoitechat"
DESCRIPTION = "Provides translations for the 'zoitechat' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.19.0"

RPM_NAME = "zoitechat-lang-2.19.0-1.1.noarch.rpm"
RPM_HASH = "95518ac441aa72915a6db4cf720d8d516ebd0774885c3590fdf9803b0e21835d7f825704f99d6d63b9d0ffe9859e9c3678d8dc8c2e69943e05a5e488c6729035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zoitechat-af \
locale-zoitechat-ast \
locale-zoitechat-az \
locale-zoitechat-be \
locale-zoitechat-bg \
locale-zoitechat-ca \
locale-zoitechat-cs \
locale-zoitechat-da \
locale-zoitechat-de \
locale-zoitechat-el \
locale-zoitechat-en-GB \
locale-zoitechat-es \
locale-zoitechat-et \
locale-zoitechat-eu \
locale-zoitechat-fi \
locale-zoitechat-fr \
locale-zoitechat-gl \
locale-zoitechat-gu \
locale-zoitechat-hi \
locale-zoitechat-hu \
locale-zoitechat-id \
locale-zoitechat-it \
locale-zoitechat-kn \
locale-zoitechat-ko \
locale-zoitechat-lt \
locale-zoitechat-lv \
locale-zoitechat-mk \
locale-zoitechat-ml \
locale-zoitechat-ms \
locale-zoitechat-nb \
locale-zoitechat-nl \
locale-zoitechat-pa \
locale-zoitechat-pl \
locale-zoitechat-pt \
locale-zoitechat-pt-BR \
locale-zoitechat-ru \
locale-zoitechat-sk \
locale-zoitechat-sl \
locale-zoitechat-sq \
locale-zoitechat-sr \
locale-zoitechat-sr@latin \
locale-zoitechat-sv \
locale-zoitechat-th \
locale-zoitechat-tr \
locale-zoitechat-uk \
locale-zoitechat-vi \
locale-zoitechat-wa \
locale-zoitechat-zh-CN \
locale-zoitechat-zh-TW \
zoitechat-lang \
zoitechat-lang-all"

RDEPENDS:${PN} += "zoitechat"

inherit rpm
