SUMMARY = "Translations for package libKSaneCore6-1"
DESCRIPTION = "Provides translations for the 'libKSaneCore6-1' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libKSaneCore6-1-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "96331fb84ce5cd317062ec059c84804118baeed41560319c55b895085ff28b776cd7eaea4d28dae94dc60598963ded17113c5d4ba58e0555fb329f2b9ad10a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKSaneCore6-1-lang \
libKSaneCore6-1-lang-all \
locale-libKSaneCore6-1-ar \
locale-libKSaneCore6-1-bg \
locale-libKSaneCore6-1-ca \
locale-libKSaneCore6-1-ca@valencia \
locale-libKSaneCore6-1-cs \
locale-libKSaneCore6-1-de \
locale-libKSaneCore6-1-en-GB \
locale-libKSaneCore6-1-eo \
locale-libKSaneCore6-1-es \
locale-libKSaneCore6-1-eu \
locale-libKSaneCore6-1-fi \
locale-libKSaneCore6-1-fr \
locale-libKSaneCore6-1-ga \
locale-libKSaneCore6-1-gl \
locale-libKSaneCore6-1-he \
locale-libKSaneCore6-1-hi \
locale-libKSaneCore6-1-hu \
locale-libKSaneCore6-1-ia \
locale-libKSaneCore6-1-is \
locale-libKSaneCore6-1-it \
locale-libKSaneCore6-1-ja \
locale-libKSaneCore6-1-ka \
locale-libKSaneCore6-1-ko \
locale-libKSaneCore6-1-lt \
locale-libKSaneCore6-1-lv \
locale-libKSaneCore6-1-nl \
locale-libKSaneCore6-1-nn \
locale-libKSaneCore6-1-pl \
locale-libKSaneCore6-1-pt \
locale-libKSaneCore6-1-pt-BR \
locale-libKSaneCore6-1-ro \
locale-libKSaneCore6-1-ru \
locale-libKSaneCore6-1-sk \
locale-libKSaneCore6-1-sl \
locale-libKSaneCore6-1-sv \
locale-libKSaneCore6-1-tr \
locale-libKSaneCore6-1-ug \
locale-libKSaneCore6-1-uk \
locale-libKSaneCore6-1-zh-CN \
locale-libKSaneCore6-1-zh-TW"

RDEPENDS:${PN} += "libKSaneCore6-1"

inherit rpm
