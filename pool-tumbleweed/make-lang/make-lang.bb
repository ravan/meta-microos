SUMMARY = "Translations for package make"
DESCRIPTION = "Provides translations for the 'make' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "make-lang-4.4.1-3.10.noarch.rpm"
RPM_HASH = "c053fc4b844dbef9ed2051f6489f00f32183928963cf9ad66e0c0286ab73a80f20ecdccd4fac95ce72f2371432b1ec51288478ed8fafad95ccf72fc4c56711db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-make-be \
locale-make-bg \
locale-make-cs \
locale-make-da \
locale-make-de \
locale-make-es \
locale-make-fi \
locale-make-fr \
locale-make-ga \
locale-make-gl \
locale-make-he \
locale-make-hr \
locale-make-id \
locale-make-it \
locale-make-ja \
locale-make-ko \
locale-make-lt \
locale-make-nl \
locale-make-pl \
locale-make-pt \
locale-make-pt-BR \
locale-make-ro \
locale-make-ru \
locale-make-sr \
locale-make-sv \
locale-make-tr \
locale-make-uk \
locale-make-vi \
locale-make-zh-CN \
locale-make-zh-TW \
make-lang \
make-lang-all"

RDEPENDS:${PN} += "make"

inherit rpm
