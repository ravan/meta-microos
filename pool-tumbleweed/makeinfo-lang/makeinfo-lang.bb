SUMMARY = "Translations for package makeinfo"
DESCRIPTION = "Provides translations for the 'makeinfo' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "makeinfo-lang-7.3-1.5.noarch.rpm"
RPM_HASH = "6b706f3f184cc8fc52778e0d45ccae31edde0032313e5a9d4bb828acddd728ef23b3240435be624bea451c3401444357e257010fff7a0a6d6fd4bf0b8aeaf87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-makeinfo-ca \
locale-makeinfo-cs \
locale-makeinfo-de \
locale-makeinfo-eo \
locale-makeinfo-es \
locale-makeinfo-fi \
locale-makeinfo-fr \
locale-makeinfo-hr \
locale-makeinfo-hu \
locale-makeinfo-it \
locale-makeinfo-ka \
locale-makeinfo-nb \
locale-makeinfo-nl \
locale-makeinfo-pl \
locale-makeinfo-pt \
locale-makeinfo-pt-BR \
locale-makeinfo-ro \
locale-makeinfo-sk \
locale-makeinfo-sr \
locale-makeinfo-sv \
locale-makeinfo-uk \
makeinfo-lang \
makeinfo-lang-all"

RDEPENDS:${PN} += "makeinfo"

inherit rpm
