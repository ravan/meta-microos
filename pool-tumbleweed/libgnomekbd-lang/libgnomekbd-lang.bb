SUMMARY = "Translations for package libgnomekbd"
DESCRIPTION = "Provides translations for the 'libgnomekbd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd-lang-3.28.1-1.15.noarch.rpm"
RPM_HASH = "a01fe61d04aa13132ea7970a768ad83ad36d55fb23f29c9df3df0dd7a45b737bb80d16ea97ebfbc3708bd62bf52559896c69669dcf64ea74279ebd99c7a24f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnomekbd-lang \
libgnomekbd-lang-all \
locale-libgnomekbd-ar \
locale-libgnomekbd-as \
locale-libgnomekbd-ast \
locale-libgnomekbd-be \
locale-libgnomekbd-be@latin \
locale-libgnomekbd-bg \
locale-libgnomekbd-bn \
locale-libgnomekbd-bn-IN \
locale-libgnomekbd-bs \
locale-libgnomekbd-ca \
locale-libgnomekbd-ca@valencia \
locale-libgnomekbd-cs \
locale-libgnomekbd-da \
locale-libgnomekbd-de \
locale-libgnomekbd-dz \
locale-libgnomekbd-el \
locale-libgnomekbd-en-GB \
locale-libgnomekbd-en@shaw \
locale-libgnomekbd-eo \
locale-libgnomekbd-es \
locale-libgnomekbd-et \
locale-libgnomekbd-eu \
locale-libgnomekbd-fa \
locale-libgnomekbd-fi \
locale-libgnomekbd-fr \
locale-libgnomekbd-fur \
locale-libgnomekbd-ga \
locale-libgnomekbd-gl \
locale-libgnomekbd-gu \
locale-libgnomekbd-he \
locale-libgnomekbd-hi \
locale-libgnomekbd-hr \
locale-libgnomekbd-hu \
locale-libgnomekbd-id \
locale-libgnomekbd-it \
locale-libgnomekbd-ja \
locale-libgnomekbd-ka \
locale-libgnomekbd-kk \
locale-libgnomekbd-km \
locale-libgnomekbd-kn \
locale-libgnomekbd-ko \
locale-libgnomekbd-lt \
locale-libgnomekbd-lv \
locale-libgnomekbd-mai \
locale-libgnomekbd-mk \
locale-libgnomekbd-ml \
locale-libgnomekbd-mr \
locale-libgnomekbd-ms \
locale-libgnomekbd-nb \
locale-libgnomekbd-nl \
locale-libgnomekbd-nn \
locale-libgnomekbd-oc \
locale-libgnomekbd-or \
locale-libgnomekbd-pa \
locale-libgnomekbd-pl \
locale-libgnomekbd-pt \
locale-libgnomekbd-pt-BR \
locale-libgnomekbd-ro \
locale-libgnomekbd-ru \
locale-libgnomekbd-si \
locale-libgnomekbd-sk \
locale-libgnomekbd-sl \
locale-libgnomekbd-sq \
locale-libgnomekbd-sr \
locale-libgnomekbd-sr@latin \
locale-libgnomekbd-sv \
locale-libgnomekbd-ta \
locale-libgnomekbd-te \
locale-libgnomekbd-th \
locale-libgnomekbd-tr \
locale-libgnomekbd-ug \
locale-libgnomekbd-uk \
locale-libgnomekbd-vi \
locale-libgnomekbd-zh-CN \
locale-libgnomekbd-zh-HK \
locale-libgnomekbd-zh-TW"

RDEPENDS:${PN} += "libgnomekbd"

inherit rpm
