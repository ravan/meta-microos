SUMMARY = "Translations for package xviewer-plugins"
DESCRIPTION = "Provides translations for the 'xviewer-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugins-lang-3.4.3-1.2.noarch.rpm"
RPM_HASH = "719e721431c97b8f93384acfe1943c03ffd65e2ef04403cde1ddcc511ccb9fe759e49a29d85e9a1642cc482a4a9c304410359bcccb77dd3dc8f714846f7402f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xviewer-plugins-ar \
locale-xviewer-plugins-as \
locale-xviewer-plugins-be@latin \
locale-xviewer-plugins-bg \
locale-xviewer-plugins-bn-IN \
locale-xviewer-plugins-ca \
locale-xviewer-plugins-ca@valencia \
locale-xviewer-plugins-cs \
locale-xviewer-plugins-da \
locale-xviewer-plugins-de \
locale-xviewer-plugins-el \
locale-xviewer-plugins-en-GB \
locale-xviewer-plugins-es \
locale-xviewer-plugins-eu \
locale-xviewer-plugins-fi \
locale-xviewer-plugins-fr \
locale-xviewer-plugins-gl \
locale-xviewer-plugins-gu \
locale-xviewer-plugins-he \
locale-xviewer-plugins-hr \
locale-xviewer-plugins-hu \
locale-xviewer-plugins-id \
locale-xviewer-plugins-it \
locale-xviewer-plugins-ja \
locale-xviewer-plugins-kn \
locale-xviewer-plugins-ko \
locale-xviewer-plugins-lt \
locale-xviewer-plugins-lv \
locale-xviewer-plugins-mk \
locale-xviewer-plugins-ml \
locale-xviewer-plugins-mr \
locale-xviewer-plugins-nb \
locale-xviewer-plugins-or \
locale-xviewer-plugins-pa \
locale-xviewer-plugins-pl \
locale-xviewer-plugins-pt \
locale-xviewer-plugins-pt-BR \
locale-xviewer-plugins-ro \
locale-xviewer-plugins-ru \
locale-xviewer-plugins-sk \
locale-xviewer-plugins-sl \
locale-xviewer-plugins-sq \
locale-xviewer-plugins-sr \
locale-xviewer-plugins-sr@latin \
locale-xviewer-plugins-sv \
locale-xviewer-plugins-ta \
locale-xviewer-plugins-te \
locale-xviewer-plugins-uk \
locale-xviewer-plugins-vi \
locale-xviewer-plugins-zh-CN \
locale-xviewer-plugins-zh-HK \
locale-xviewer-plugins-zh-TW \
xviewer-plugins-lang \
xviewer-plugins-lang-all"

RDEPENDS:${PN} += "xviewer-plugins"

inherit rpm
