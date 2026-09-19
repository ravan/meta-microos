SUMMARY = "Translations for package libcinnamon-desktop"
DESCRIPTION = "Provides translations for the 'libcinnamon-desktop' package."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcinnamon-desktop-lang-6.4.1-1.8.noarch.rpm"
RPM_HASH = "664bd926365a10060941ddc279af34befc593725055e05c5f2f9f15c44a9a5643ab908a109a3ab0d2a9e4635016e0283d8c3a41ed5c7c3acb8ee1773f7d0b7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-lang \
libcinnamon-desktop-lang-all \
locale-libcinnamon-desktop-af \
locale-libcinnamon-desktop-ar \
locale-libcinnamon-desktop-as \
locale-libcinnamon-desktop-ast \
locale-libcinnamon-desktop-az \
locale-libcinnamon-desktop-be \
locale-libcinnamon-desktop-be@latin \
locale-libcinnamon-desktop-bg \
locale-libcinnamon-desktop-bn \
locale-libcinnamon-desktop-bn-IN \
locale-libcinnamon-desktop-br \
locale-libcinnamon-desktop-bs \
locale-libcinnamon-desktop-ca \
locale-libcinnamon-desktop-ca@valencia \
locale-libcinnamon-desktop-cs \
locale-libcinnamon-desktop-cy \
locale-libcinnamon-desktop-da \
locale-libcinnamon-desktop-de \
locale-libcinnamon-desktop-dz \
locale-libcinnamon-desktop-el \
locale-libcinnamon-desktop-en-CA \
locale-libcinnamon-desktop-en-GB \
locale-libcinnamon-desktop-en@shaw \
locale-libcinnamon-desktop-eo \
locale-libcinnamon-desktop-es \
locale-libcinnamon-desktop-et \
locale-libcinnamon-desktop-eu \
locale-libcinnamon-desktop-fa \
locale-libcinnamon-desktop-fi \
locale-libcinnamon-desktop-fr \
locale-libcinnamon-desktop-fur \
locale-libcinnamon-desktop-ga \
locale-libcinnamon-desktop-gl \
locale-libcinnamon-desktop-gu \
locale-libcinnamon-desktop-he \
locale-libcinnamon-desktop-hi \
locale-libcinnamon-desktop-hr \
locale-libcinnamon-desktop-hu \
locale-libcinnamon-desktop-id \
locale-libcinnamon-desktop-is \
locale-libcinnamon-desktop-it \
locale-libcinnamon-desktop-ja \
locale-libcinnamon-desktop-ka \
locale-libcinnamon-desktop-kk \
locale-libcinnamon-desktop-km \
locale-libcinnamon-desktop-kn \
locale-libcinnamon-desktop-ko \
locale-libcinnamon-desktop-lt \
locale-libcinnamon-desktop-lv \
locale-libcinnamon-desktop-mai \
locale-libcinnamon-desktop-mk \
locale-libcinnamon-desktop-ml \
locale-libcinnamon-desktop-mr \
locale-libcinnamon-desktop-ms \
locale-libcinnamon-desktop-nb \
locale-libcinnamon-desktop-nds \
locale-libcinnamon-desktop-ne \
locale-libcinnamon-desktop-nl \
locale-libcinnamon-desktop-nn \
locale-libcinnamon-desktop-oc \
locale-libcinnamon-desktop-or \
locale-libcinnamon-desktop-pa \
locale-libcinnamon-desktop-pl \
locale-libcinnamon-desktop-pt \
locale-libcinnamon-desktop-pt-BR \
locale-libcinnamon-desktop-ro \
locale-libcinnamon-desktop-ru \
locale-libcinnamon-desktop-si \
locale-libcinnamon-desktop-sk \
locale-libcinnamon-desktop-sl \
locale-libcinnamon-desktop-sq \
locale-libcinnamon-desktop-sr \
locale-libcinnamon-desktop-sr@latin \
locale-libcinnamon-desktop-sv \
locale-libcinnamon-desktop-ta \
locale-libcinnamon-desktop-te \
locale-libcinnamon-desktop-th \
locale-libcinnamon-desktop-tr \
locale-libcinnamon-desktop-ug \
locale-libcinnamon-desktop-uk \
locale-libcinnamon-desktop-vi \
locale-libcinnamon-desktop-wa \
locale-libcinnamon-desktop-zh-CN \
locale-libcinnamon-desktop-zh-HK \
locale-libcinnamon-desktop-zh-TW"

RDEPENDS:${PN} += "libcinnamon-desktop"

inherit rpm
