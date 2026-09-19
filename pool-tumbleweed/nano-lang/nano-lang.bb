SUMMARY = "Translations for package nano"
DESCRIPTION = "Provides translations for the 'nano' package."
LICENSE = "GPL-3.0-or-later"

PV = "9.2"

RPM_NAME = "nano-lang-9.2-1.1.noarch.rpm"
RPM_HASH = "89ce1db92f439aa996a199b46556ba8adf5cd02658be1e53540ff42ec3632d09fff163eac284132416238a21a0531efd8a6c9b8a260b1c94d27139da7a1e7d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nano-ar \
locale-nano-bg \
locale-nano-ca \
locale-nano-cs \
locale-nano-da \
locale-nano-de \
locale-nano-eo \
locale-nano-es \
locale-nano-eu \
locale-nano-fi \
locale-nano-fr \
locale-nano-ga \
locale-nano-gl \
locale-nano-hr \
locale-nano-hu \
locale-nano-id \
locale-nano-is \
locale-nano-it \
locale-nano-ja \
locale-nano-ka \
locale-nano-kk \
locale-nano-ko \
locale-nano-ms \
locale-nano-nb \
locale-nano-nl \
locale-nano-pl \
locale-nano-pt \
locale-nano-pt-BR \
locale-nano-ro \
locale-nano-ru \
locale-nano-sk \
locale-nano-sl \
locale-nano-sq \
locale-nano-sr \
locale-nano-sv \
locale-nano-tr \
locale-nano-uk \
locale-nano-vi \
locale-nano-zh-CN \
locale-nano-zh-TW \
nano-lang \
nano-lang-all"

RDEPENDS:${PN} += "nano"

inherit rpm
