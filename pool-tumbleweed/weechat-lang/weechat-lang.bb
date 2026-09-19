SUMMARY = "Translations for package weechat"
DESCRIPTION = "Provides translations for the 'weechat' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-lang-4.10.1-1.1.noarch.rpm"
RPM_HASH = "283d340b6f99921e85050ce9970b94ad4246114bc33f6d96700aba31108703315f0e93a98fdc4ed02fcb7aaee3aee99908f5c32fd772d8e584e393353b17f485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-weechat-cs \
locale-weechat-de \
locale-weechat-es \
locale-weechat-fr \
locale-weechat-hu \
locale-weechat-it \
locale-weechat-ja \
locale-weechat-pl \
locale-weechat-pt \
locale-weechat-pt-BR \
locale-weechat-ru \
locale-weechat-sr \
locale-weechat-tr \
weechat-lang \
weechat-lang-all"

RDEPENDS:${PN} += "weechat"

inherit rpm
