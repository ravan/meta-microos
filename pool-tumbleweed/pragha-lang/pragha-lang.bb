SUMMARY = "Translations for package pragha"
DESCRIPTION = "Provides translations for the 'pragha' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-lang-1.3.99.1-5.7.noarch.rpm"
RPM_HASH = "dc36c1f7f4736e4027c9ab18b12dd84fcf1b3ed1317753180ef23dc57c4c7497026d0999f065919b1fea75950b81a36738c8697be8537f2881a3c8045b8dfbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pragha-ar \
locale-pragha-bg \
locale-pragha-ca \
locale-pragha-cs \
locale-pragha-da \
locale-pragha-de \
locale-pragha-el \
locale-pragha-es \
locale-pragha-fr \
locale-pragha-hu \
locale-pragha-id \
locale-pragha-it \
locale-pragha-ja \
locale-pragha-ko \
locale-pragha-lt \
locale-pragha-nb \
locale-pragha-nl \
locale-pragha-pl \
locale-pragha-pt \
locale-pragha-pt-BR \
locale-pragha-ru \
locale-pragha-sk \
locale-pragha-sv \
locale-pragha-tr \
locale-pragha-uk \
locale-pragha-vi \
locale-pragha-zh-CN \
pragha-lang \
pragha-lang-all"

RDEPENDS:${PN} += "pragha"

inherit rpm
