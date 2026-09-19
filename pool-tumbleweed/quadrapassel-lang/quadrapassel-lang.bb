SUMMARY = "Translations for package quadrapassel"
DESCRIPTION = "Provides translations for the 'quadrapassel' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "quadrapassel-lang-50.2-1.2.noarch.rpm"
RPM_HASH = "72a5ca6149092e72513cfe46c03753ba1a2d0193b4da58658ec34f1aa054541d24734fce96a3c794639bb22eb984f37253188417457202cc7ea66892f4c88e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-quadrapassel-af \
locale-quadrapassel-ar \
locale-quadrapassel-as \
locale-quadrapassel-ast \
locale-quadrapassel-az \
locale-quadrapassel-be \
locale-quadrapassel-bg \
locale-quadrapassel-bn \
locale-quadrapassel-bn-IN \
locale-quadrapassel-br \
locale-quadrapassel-bs \
locale-quadrapassel-ca \
locale-quadrapassel-ca@valencia \
locale-quadrapassel-cs \
locale-quadrapassel-cy \
locale-quadrapassel-da \
locale-quadrapassel-de \
locale-quadrapassel-dz \
locale-quadrapassel-el \
locale-quadrapassel-en-CA \
locale-quadrapassel-en-GB \
locale-quadrapassel-en@shaw \
locale-quadrapassel-eo \
locale-quadrapassel-es \
locale-quadrapassel-et \
locale-quadrapassel-eu \
locale-quadrapassel-fa \
locale-quadrapassel-fi \
locale-quadrapassel-fr \
locale-quadrapassel-fur \
locale-quadrapassel-ga \
locale-quadrapassel-gl \
locale-quadrapassel-gu \
locale-quadrapassel-he \
locale-quadrapassel-hi \
locale-quadrapassel-hr \
locale-quadrapassel-hu \
locale-quadrapassel-id \
locale-quadrapassel-is \
locale-quadrapassel-it \
locale-quadrapassel-ja \
locale-quadrapassel-ka \
locale-quadrapassel-kk \
locale-quadrapassel-km \
locale-quadrapassel-kn \
locale-quadrapassel-ko \
locale-quadrapassel-lt \
locale-quadrapassel-lv \
locale-quadrapassel-mai \
locale-quadrapassel-mk \
locale-quadrapassel-ml \
locale-quadrapassel-mr \
locale-quadrapassel-ms \
locale-quadrapassel-nb \
locale-quadrapassel-ne \
locale-quadrapassel-nl \
locale-quadrapassel-nn \
locale-quadrapassel-oc \
locale-quadrapassel-or \
locale-quadrapassel-pa \
locale-quadrapassel-pl \
locale-quadrapassel-pt \
locale-quadrapassel-pt-BR \
locale-quadrapassel-ro \
locale-quadrapassel-ru \
locale-quadrapassel-si \
locale-quadrapassel-sk \
locale-quadrapassel-sl \
locale-quadrapassel-sq \
locale-quadrapassel-sr \
locale-quadrapassel-sr@latin \
locale-quadrapassel-sv \
locale-quadrapassel-ta \
locale-quadrapassel-te \
locale-quadrapassel-th \
locale-quadrapassel-tr \
locale-quadrapassel-ug \
locale-quadrapassel-uk \
locale-quadrapassel-vi \
locale-quadrapassel-wa \
locale-quadrapassel-zh-CN \
locale-quadrapassel-zh-HK \
locale-quadrapassel-zh-TW \
quadrapassel-lang \
quadrapassel-lang-all"

RDEPENDS:${PN} += "quadrapassel"

inherit rpm
