SUMMARY = "Translations for package sed"
DESCRIPTION = "Provides translations for the 'sed' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.10"

RPM_NAME = "sed-lang-4.10-1.4.noarch.rpm"
RPM_HASH = "64576939f67c3cb823df6e95950fd5d399ef92beb29db91e701b2955f794884549f93bf022d1f579c5253b3a7adb79f1b7b4f8c06d4738b4d099e83f06c5747c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sed-af \
locale-sed-ar \
locale-sed-ast \
locale-sed-be \
locale-sed-bg \
locale-sed-ca \
locale-sed-cs \
locale-sed-da \
locale-sed-de \
locale-sed-el \
locale-sed-eo \
locale-sed-es \
locale-sed-et \
locale-sed-eu \
locale-sed-fi \
locale-sed-fr \
locale-sed-ga \
locale-sed-gl \
locale-sed-he \
locale-sed-hr \
locale-sed-hu \
locale-sed-id \
locale-sed-it \
locale-sed-ja \
locale-sed-ka \
locale-sed-ko \
locale-sed-nb \
locale-sed-nl \
locale-sed-pl \
locale-sed-pt \
locale-sed-pt-BR \
locale-sed-ro \
locale-sed-ru \
locale-sed-sk \
locale-sed-sl \
locale-sed-sr \
locale-sed-sv \
locale-sed-tr \
locale-sed-uk \
locale-sed-vi \
locale-sed-zh-CN \
locale-sed-zh-TW \
sed-lang \
sed-lang-all"

RDEPENDS:${PN} += "sed"

inherit rpm
