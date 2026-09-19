SUMMARY = "Translations for package libgedit-amtk-5"
DESCRIPTION = "Provides translations for the 'libgedit-amtk-5' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.10.0"

RPM_NAME = "libgedit-amtk-5-lang-5.10.0-1.3.noarch.rpm"
RPM_HASH = "2de147db465b08f4fa24b4a643cd0afdf8a65eca5cca52aa4dab109d476ab34cf6d4b6d1cb6ffb608156b5c124a890da7434d0bb44c5f65de682254c3fbeb840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgedit-amtk-5-lang \
libgedit-amtk-5-lang-all \
locale-libgedit-amtk-5-be \
locale-libgedit-amtk-5-bg \
locale-libgedit-amtk-5-ca \
locale-libgedit-amtk-5-cs \
locale-libgedit-amtk-5-da \
locale-libgedit-amtk-5-de \
locale-libgedit-amtk-5-el \
locale-libgedit-amtk-5-en-GB \
locale-libgedit-amtk-5-es \
locale-libgedit-amtk-5-eu \
locale-libgedit-amtk-5-fr \
locale-libgedit-amtk-5-fur \
locale-libgedit-amtk-5-hr \
locale-libgedit-amtk-5-hu \
locale-libgedit-amtk-5-id \
locale-libgedit-amtk-5-it \
locale-libgedit-amtk-5-ja \
locale-libgedit-amtk-5-ka \
locale-libgedit-amtk-5-kk \
locale-libgedit-amtk-5-lt \
locale-libgedit-amtk-5-ms \
locale-libgedit-amtk-5-nl \
locale-libgedit-amtk-5-pl \
locale-libgedit-amtk-5-pt \
locale-libgedit-amtk-5-pt-BR \
locale-libgedit-amtk-5-ro \
locale-libgedit-amtk-5-ru \
locale-libgedit-amtk-5-sl \
locale-libgedit-amtk-5-sr \
locale-libgedit-amtk-5-sv \
locale-libgedit-amtk-5-tr \
locale-libgedit-amtk-5-uk \
locale-libgedit-amtk-5-zh-CN"

RDEPENDS:${PN} += "libgedit-amtk-5"

inherit rpm
