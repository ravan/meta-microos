SUMMARY = "Translations for package grsync"
DESCRIPTION = "Provides translations for the 'grsync' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "grsync-lang-1.3.1-1.14.noarch.rpm"
RPM_HASH = "30df858069a8268cd35c3ea8d1e35d108b4af34edbd4fe4278febfc1fb4c09a70b206da91e5d0e1fd3042e3e3e76ec079f2277d7ea4db713518d9460f4c59246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grsync-lang \
grsync-lang-all \
locale-grsync-ca \
locale-grsync-cs \
locale-grsync-de \
locale-grsync-es \
locale-grsync-fr \
locale-grsync-gl \
locale-grsync-hr \
locale-grsync-hu \
locale-grsync-id \
locale-grsync-it \
locale-grsync-nb \
locale-grsync-nl \
locale-grsync-pt-BR \
locale-grsync-ru \
locale-grsync-sv \
locale-grsync-tr \
locale-grsync-zh-CN \
locale-grsync-zh-TW"

RDEPENDS:${PN} += "grsync"

inherit rpm
