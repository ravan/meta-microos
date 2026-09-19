SUMMARY = "Translations for package dolphin-emu"
DESCRIPTION = "Provides translations for the 'dolphin-emu' package."
LICENSE = "(Apache-2.0 | MIT) & BSD-2-Clause & libpng-2.0 & GPL-2.0-or-later"

PV = "2606a"

RPM_NAME = "dolphin-emu-lang-2606a-1.1.noarch.rpm"
RPM_HASH = "7c65b6834dc27dc444432f2fb21d13c10e47c54b764995ec0eb34a92338342cdcb4ffc8e57b7f93b6f55660e7bdf1a0e6a73fc0a43bb4362adc0b37c638f5034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-emu-lang \
dolphin-emu-lang-all \
locale-dolphin-emu-ar \
locale-dolphin-emu-ca \
locale-dolphin-emu-cs \
locale-dolphin-emu-da \
locale-dolphin-emu-de \
locale-dolphin-emu-el \
locale-dolphin-emu-en \
locale-dolphin-emu-es \
locale-dolphin-emu-fa \
locale-dolphin-emu-fi \
locale-dolphin-emu-fr \
locale-dolphin-emu-hr \
locale-dolphin-emu-hu \
locale-dolphin-emu-it \
locale-dolphin-emu-ja \
locale-dolphin-emu-ko \
locale-dolphin-emu-ms \
locale-dolphin-emu-nb \
locale-dolphin-emu-nl \
locale-dolphin-emu-pl \
locale-dolphin-emu-pt \
locale-dolphin-emu-pt-BR \
locale-dolphin-emu-ro \
locale-dolphin-emu-ru \
locale-dolphin-emu-sr \
locale-dolphin-emu-sv \
locale-dolphin-emu-tr \
locale-dolphin-emu-zh-CN \
locale-dolphin-emu-zh-TW"

RDEPENDS:${PN} += "dolphin-emu"

inherit rpm
