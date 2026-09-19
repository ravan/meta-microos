SUMMARY = "Translations for package massif-visualizer"
DESCRIPTION = "Provides translations for the 'massif-visualizer' package."
LICENSE = "LGPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "massif-visualizer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "71ba5130a17e66bd86f6bb86eeb75c7140ac134b835d1cb4272bb71d903c1567b1b40d56b2ea0a6cfa9a6161c4881b6b2b5e246e24d69378d4ae1330ecc407d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-massif-visualizer-ar \
locale-massif-visualizer-bs \
locale-massif-visualizer-ca \
locale-massif-visualizer-ca@valencia \
locale-massif-visualizer-cs \
locale-massif-visualizer-da \
locale-massif-visualizer-de \
locale-massif-visualizer-el \
locale-massif-visualizer-en-GB \
locale-massif-visualizer-eo \
locale-massif-visualizer-es \
locale-massif-visualizer-et \
locale-massif-visualizer-eu \
locale-massif-visualizer-fi \
locale-massif-visualizer-fr \
locale-massif-visualizer-ga \
locale-massif-visualizer-gl \
locale-massif-visualizer-he \
locale-massif-visualizer-hi \
locale-massif-visualizer-hu \
locale-massif-visualizer-ia \
locale-massif-visualizer-is \
locale-massif-visualizer-it \
locale-massif-visualizer-ja \
locale-massif-visualizer-ka \
locale-massif-visualizer-kk \
locale-massif-visualizer-ko \
locale-massif-visualizer-lt \
locale-massif-visualizer-mr \
locale-massif-visualizer-nb \
locale-massif-visualizer-nds \
locale-massif-visualizer-nl \
locale-massif-visualizer-nn \
locale-massif-visualizer-pl \
locale-massif-visualizer-pt \
locale-massif-visualizer-pt-BR \
locale-massif-visualizer-ru \
locale-massif-visualizer-sk \
locale-massif-visualizer-sl \
locale-massif-visualizer-sv \
locale-massif-visualizer-tr \
locale-massif-visualizer-ug \
locale-massif-visualizer-uk \
locale-massif-visualizer-zh-CN \
locale-massif-visualizer-zh-TW \
massif-visualizer-lang \
massif-visualizer-lang-all"

RDEPENDS:${PN} += "massif-visualizer"

inherit rpm
