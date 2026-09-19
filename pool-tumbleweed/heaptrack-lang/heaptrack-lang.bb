SUMMARY = "Translations for package heaptrack"
DESCRIPTION = "Provides translations for the 'heaptrack' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "heaptrack-lang-1.5.0-6.8.noarch.rpm"
RPM_HASH = "23984caec2720a1b9a434463e83b02a66e8cb046da444e30dd41b1ae30aeddcf323db8426461722ae82ac1871e140de33127280a86493fdf507c2c27cde7619d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "heaptrack-lang \
heaptrack-lang-all \
locale-heaptrack-ast \
locale-heaptrack-ca \
locale-heaptrack-ca@valencia \
locale-heaptrack-cs \
locale-heaptrack-da \
locale-heaptrack-de \
locale-heaptrack-en-GB \
locale-heaptrack-es \
locale-heaptrack-eu \
locale-heaptrack-fr \
locale-heaptrack-gl \
locale-heaptrack-ia \
locale-heaptrack-it \
locale-heaptrack-ja \
locale-heaptrack-ka \
locale-heaptrack-ko \
locale-heaptrack-lt \
locale-heaptrack-nl \
locale-heaptrack-nn \
locale-heaptrack-pl \
locale-heaptrack-pt \
locale-heaptrack-pt-BR \
locale-heaptrack-ru \
locale-heaptrack-sk \
locale-heaptrack-sl \
locale-heaptrack-sv \
locale-heaptrack-tr \
locale-heaptrack-uk \
locale-heaptrack-zh-CN \
locale-heaptrack-zh-TW"

RDEPENDS:${PN} += "heaptrack"

inherit rpm
