SUMMARY = "Translations for package ghostty"
DESCRIPTION = "Provides translations for the 'ghostty' package."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-lang-1.3.1-1.6.noarch.rpm"
RPM_HASH = "2470bd7d0337dfcdc23922a40fc244d677c95c6472278f66c9a666f6a55694826cf14e29cd41f5a4db70e43538ae3c7bc2358ff7adce235bdb6a6fd166206835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-lang \
ghostty-lang-all \
locale-ghostty-bg \
locale-ghostty-ca \
locale-ghostty-de \
locale-ghostty-es-AR \
locale-ghostty-es-ES \
locale-ghostty-fr \
locale-ghostty-ga \
locale-ghostty-he \
locale-ghostty-hr \
locale-ghostty-hu \
locale-ghostty-id \
locale-ghostty-it \
locale-ghostty-ja \
locale-ghostty-kk \
locale-ghostty-lt \
locale-ghostty-lv \
locale-ghostty-mk \
locale-ghostty-nb \
locale-ghostty-nl \
locale-ghostty-pl \
locale-ghostty-pt-BR \
locale-ghostty-ru \
locale-ghostty-tr \
locale-ghostty-uk \
locale-ghostty-vi \
locale-ghostty-zh-CN \
locale-ghostty-zh-TW"

RDEPENDS:${PN} += "ghostty"

inherit rpm
