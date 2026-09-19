SUMMARY = "Translations for package minicom"
DESCRIPTION = "Provides translations for the 'minicom' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.1"

RPM_NAME = "minicom-lang-2.11.1-2.3.noarch.rpm"
RPM_HASH = "7194878fb3e7a7d98b6828f25e5136fb12eb55b3be21ff21069102e5afefcf591ca791ebe6934bc8790ceee883811a89ae1f5e0c44f1c102fbcc905bff3385af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minicom-cs \
locale-minicom-da \
locale-minicom-de \
locale-minicom-es \
locale-minicom-fi \
locale-minicom-fr \
locale-minicom-hu \
locale-minicom-id \
locale-minicom-ja \
locale-minicom-ka \
locale-minicom-ko \
locale-minicom-nb \
locale-minicom-pl \
locale-minicom-pt-BR \
locale-minicom-ro \
locale-minicom-ru \
locale-minicom-sr \
locale-minicom-sv \
locale-minicom-vi \
locale-minicom-zh-CN \
locale-minicom-zh-TW \
minicom-lang \
minicom-lang-all"

RDEPENDS:${PN} += "minicom"

inherit rpm
