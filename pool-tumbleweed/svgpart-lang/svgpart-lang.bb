SUMMARY = "Translations for package svgpart"
DESCRIPTION = "Provides translations for the 'svgpart' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "svgpart-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1ccffb65c8cf0b979b2a24f25c24b3a6614d454afd12b863903e8779f1c987af5ee6b752d62677cb6c10f2551b5ad3275a0ebcd564d669e1f32c4057c20cc96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-svgpart-ar \
locale-svgpart-ast \
locale-svgpart-be \
locale-svgpart-bg \
locale-svgpart-bs \
locale-svgpart-ca \
locale-svgpart-ca@valencia \
locale-svgpart-cs \
locale-svgpart-da \
locale-svgpart-de \
locale-svgpart-el \
locale-svgpart-en-GB \
locale-svgpart-eo \
locale-svgpart-es \
locale-svgpart-et \
locale-svgpart-eu \
locale-svgpart-fi \
locale-svgpart-fr \
locale-svgpart-ga \
locale-svgpart-gl \
locale-svgpart-he \
locale-svgpart-hi \
locale-svgpart-hr \
locale-svgpart-hu \
locale-svgpart-ia \
locale-svgpart-id \
locale-svgpart-is \
locale-svgpart-it \
locale-svgpart-ja \
locale-svgpart-ka \
locale-svgpart-kk \
locale-svgpart-km \
locale-svgpart-ko \
locale-svgpart-lt \
locale-svgpart-lv \
locale-svgpart-mk \
locale-svgpart-ml \
locale-svgpart-mr \
locale-svgpart-nb \
locale-svgpart-nds \
locale-svgpart-nl \
locale-svgpart-nn \
locale-svgpart-pa \
locale-svgpart-pl \
locale-svgpart-pt \
locale-svgpart-pt-BR \
locale-svgpart-ro \
locale-svgpart-ru \
locale-svgpart-si \
locale-svgpart-sk \
locale-svgpart-sl \
locale-svgpart-sq \
locale-svgpart-sv \
locale-svgpart-ta \
locale-svgpart-th \
locale-svgpart-tr \
locale-svgpart-ug \
locale-svgpart-uk \
locale-svgpart-vi \
locale-svgpart-wa \
locale-svgpart-zh-CN \
locale-svgpart-zh-TW \
svgpart-lang \
svgpart-lang-all"

RDEPENDS:${PN} += "svgpart"

inherit rpm
