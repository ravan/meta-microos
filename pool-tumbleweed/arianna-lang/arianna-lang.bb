SUMMARY = "Translations for package arianna"
DESCRIPTION = "Provides translations for the 'arianna' package."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "arianna-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "8bd3f8e6db207a7d2468bb730806e39e53e2324f593207327bafc31793726a4db53a9679f7de1d5bf70a70add1ac442c8dda52b61b06db679101b9ef37793635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arianna-lang \
arianna-lang-all \
locale-arianna-ar \
locale-arianna-ast \
locale-arianna-ca \
locale-arianna-ca@valencia \
locale-arianna-cs \
locale-arianna-de \
locale-arianna-en-GB \
locale-arianna-eo \
locale-arianna-es \
locale-arianna-eu \
locale-arianna-fi \
locale-arianna-fr \
locale-arianna-ga \
locale-arianna-gl \
locale-arianna-he \
locale-arianna-hi \
locale-arianna-hu \
locale-arianna-ia \
locale-arianna-is \
locale-arianna-it \
locale-arianna-ja \
locale-arianna-ka \
locale-arianna-ko \
locale-arianna-lt \
locale-arianna-lv \
locale-arianna-nl \
locale-arianna-pl \
locale-arianna-pt \
locale-arianna-pt-BR \
locale-arianna-ro \
locale-arianna-ru \
locale-arianna-sk \
locale-arianna-sl \
locale-arianna-sv \
locale-arianna-tr \
locale-arianna-ug \
locale-arianna-uk \
locale-arianna-zh-CN \
locale-arianna-zh-TW"

RDEPENDS:${PN} += "arianna"

inherit rpm
