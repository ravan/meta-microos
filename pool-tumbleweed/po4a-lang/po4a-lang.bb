SUMMARY = "Translations for package po4a"
DESCRIPTION = "Provides translations for the 'po4a' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.74+git.1774221329.f4123361"

RPM_NAME = "po4a-lang-0.74+git.1774221329.f4123361-1.4.noarch.rpm"
RPM_HASH = "9519dc626e03d22e1f0492ec356627cd96776198c6c2d7b5eb89814acfe30b2aff22baae9cf4251fcbedf7eb5b6ae1b542ebc5f1c3816fa7e1aaed9d717d3e34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-po4a-af \
locale-po4a-ar \
locale-po4a-ca \
locale-po4a-cs \
locale-po4a-da \
locale-po4a-de \
locale-po4a-eo \
locale-po4a-es \
locale-po4a-et \
locale-po4a-eu \
locale-po4a-fr \
locale-po4a-hr \
locale-po4a-hu \
locale-po4a-id \
locale-po4a-it \
locale-po4a-ja \
locale-po4a-ka \
locale-po4a-kn \
locale-po4a-ko \
locale-po4a-nb \
locale-po4a-nl \
locale-po4a-pl \
locale-po4a-pt \
locale-po4a-pt-BR \
locale-po4a-ro \
locale-po4a-ru \
locale-po4a-sl \
locale-po4a-sr \
locale-po4a-sv \
locale-po4a-ta \
locale-po4a-uk \
locale-po4a-vi \
locale-po4a-zh-Hans \
locale-po4a-zh-Hant \
po4a-lang \
po4a-lang-all"

RDEPENDS:${PN} += "po4a"

inherit rpm
