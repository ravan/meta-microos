SUMMARY = "Translations for package libkgantt"
DESCRIPTION = "Provides translations for the 'libkgantt' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkgantt-lang-2.8.0-2.5.noarch.rpm"
RPM_HASH = "2e74d8af5c24f00dd61bb542113c0c061b365c48e346dc7f630579b8e0ad473749e0e3e689c57195c9a488d77c0c122136812ff517f555cb695ed91bf4baea3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgantt-lang \
libkgantt-lang-all \
locale-libkgantt-ar \
locale-libkgantt-ast \
locale-libkgantt-bg \
locale-libkgantt-bs \
locale-libkgantt-ca \
locale-libkgantt-ca@valencia \
locale-libkgantt-cs \
locale-libkgantt-da \
locale-libkgantt-de \
locale-libkgantt-el \
locale-libkgantt-en-GB \
locale-libkgantt-es \
locale-libkgantt-et \
locale-libkgantt-eu \
locale-libkgantt-fi \
locale-libkgantt-fr \
locale-libkgantt-gl \
locale-libkgantt-it \
locale-libkgantt-ko \
locale-libkgantt-nl \
locale-libkgantt-nn \
locale-libkgantt-pl \
locale-libkgantt-pt \
locale-libkgantt-pt-BR \
locale-libkgantt-ru \
locale-libkgantt-sk \
locale-libkgantt-sv \
locale-libkgantt-tr \
locale-libkgantt-uk \
locale-libkgantt-zh-CN \
locale-libkgantt-zh-TW"

RDEPENDS:${PN} += "libkgantt"

inherit rpm
