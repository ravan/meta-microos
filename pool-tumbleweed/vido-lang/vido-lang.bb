SUMMARY = "Translations for package vido"
DESCRIPTION = "Provides translations for the 'vido' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-lang-2.3.0-2.11.noarch.rpm"
RPM_HASH = "54bff13475f5ef0d80feaac2e67066c0aa9c637b6006af443eb52511f89810bac141baf84fb7fcf6953217195640fc704b734df9e72985996c33efba167de5a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vido-es \
locale-vido-fr \
locale-vido-id \
locale-vido-it \
locale-vido-ja \
locale-vido-lt \
locale-vido-nl \
locale-vido-ru \
vido-lang \
vido-lang-all"

RDEPENDS:${PN} += "vido"

inherit rpm
