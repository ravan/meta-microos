SUMMARY = "Translations for package plasma6-systemmonitor"
DESCRIPTION = "Provides translations for the 'plasma6-systemmonitor' package."
LICENSE = "GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-systemmonitor-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "aa4845e0bebc071c2a2c4609efb9b55567d70aaf67495230fad0831f60cba4d454b856039a6b9e85388ec7b2fddcea5e4251ee864eeab5e0a34f605ac5b50fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-systemmonitor-ar \
locale-plasma6-systemmonitor-ast \
locale-plasma6-systemmonitor-az \
locale-plasma6-systemmonitor-be \
locale-plasma6-systemmonitor-bg \
locale-plasma6-systemmonitor-ca \
locale-plasma6-systemmonitor-ca@valencia \
locale-plasma6-systemmonitor-cs \
locale-plasma6-systemmonitor-da \
locale-plasma6-systemmonitor-de \
locale-plasma6-systemmonitor-en-GB \
locale-plasma6-systemmonitor-eo \
locale-plasma6-systemmonitor-es \
locale-plasma6-systemmonitor-eu \
locale-plasma6-systemmonitor-fi \
locale-plasma6-systemmonitor-fr \
locale-plasma6-systemmonitor-ga \
locale-plasma6-systemmonitor-gl \
locale-plasma6-systemmonitor-he \
locale-plasma6-systemmonitor-hi \
locale-plasma6-systemmonitor-hu \
locale-plasma6-systemmonitor-ia \
locale-plasma6-systemmonitor-id \
locale-plasma6-systemmonitor-is \
locale-plasma6-systemmonitor-it \
locale-plasma6-systemmonitor-ja \
locale-plasma6-systemmonitor-ka \
locale-plasma6-systemmonitor-ko \
locale-plasma6-systemmonitor-lt \
locale-plasma6-systemmonitor-lv \
locale-plasma6-systemmonitor-nb \
locale-plasma6-systemmonitor-nl \
locale-plasma6-systemmonitor-nn \
locale-plasma6-systemmonitor-pa \
locale-plasma6-systemmonitor-pl \
locale-plasma6-systemmonitor-pt \
locale-plasma6-systemmonitor-pt-BR \
locale-plasma6-systemmonitor-ro \
locale-plasma6-systemmonitor-ru \
locale-plasma6-systemmonitor-sk \
locale-plasma6-systemmonitor-sl \
locale-plasma6-systemmonitor-sv \
locale-plasma6-systemmonitor-ta \
locale-plasma6-systemmonitor-tr \
locale-plasma6-systemmonitor-uk \
locale-plasma6-systemmonitor-zh-CN \
locale-plasma6-systemmonitor-zh-TW \
plasma6-systemmonitor-lang \
plasma6-systemmonitor-lang-all"

RDEPENDS:${PN} += "plasma6-systemmonitor"

inherit rpm
