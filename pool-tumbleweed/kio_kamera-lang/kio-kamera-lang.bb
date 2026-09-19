SUMMARY = "Translations for package kio_kamera"
DESCRIPTION = "Provides translations for the 'kio_kamera' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kio_kamera-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b380cdb3e65f012917ca858bfb01d8bdd22a1328e6228a1493bbee02ef28ece92d4ca5d45e2823281c7e740804b1e8765f43261edd50779f98e3e956700ce76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-kamera-lang \
kio-kamera-lang-all \
locale-kio-kamera-af \
locale-kio-kamera-ar \
locale-kio-kamera-ast \
locale-kio-kamera-az \
locale-kio-kamera-be \
locale-kio-kamera-bg \
locale-kio-kamera-br \
locale-kio-kamera-bs \
locale-kio-kamera-ca \
locale-kio-kamera-ca@valencia \
locale-kio-kamera-cs \
locale-kio-kamera-cy \
locale-kio-kamera-da \
locale-kio-kamera-de \
locale-kio-kamera-el \
locale-kio-kamera-en-GB \
locale-kio-kamera-eo \
locale-kio-kamera-es \
locale-kio-kamera-et \
locale-kio-kamera-eu \
locale-kio-kamera-fa \
locale-kio-kamera-fi \
locale-kio-kamera-fr \
locale-kio-kamera-ga \
locale-kio-kamera-gl \
locale-kio-kamera-he \
locale-kio-kamera-hi \
locale-kio-kamera-hr \
locale-kio-kamera-hu \
locale-kio-kamera-ia \
locale-kio-kamera-id \
locale-kio-kamera-is \
locale-kio-kamera-it \
locale-kio-kamera-ja \
locale-kio-kamera-ka \
locale-kio-kamera-kk \
locale-kio-kamera-km \
locale-kio-kamera-ko \
locale-kio-kamera-lt \
locale-kio-kamera-lv \
locale-kio-kamera-mk \
locale-kio-kamera-ml \
locale-kio-kamera-mr \
locale-kio-kamera-ms \
locale-kio-kamera-nb \
locale-kio-kamera-nds \
locale-kio-kamera-ne \
locale-kio-kamera-nl \
locale-kio-kamera-nn \
locale-kio-kamera-oc \
locale-kio-kamera-pa \
locale-kio-kamera-pl \
locale-kio-kamera-pt \
locale-kio-kamera-pt-BR \
locale-kio-kamera-ro \
locale-kio-kamera-ru \
locale-kio-kamera-si \
locale-kio-kamera-sk \
locale-kio-kamera-sl \
locale-kio-kamera-sq \
locale-kio-kamera-sv \
locale-kio-kamera-ta \
locale-kio-kamera-th \
locale-kio-kamera-tr \
locale-kio-kamera-ug \
locale-kio-kamera-uk \
locale-kio-kamera-vi \
locale-kio-kamera-zh-CN \
locale-kio-kamera-zh-HK \
locale-kio-kamera-zh-TW"

RDEPENDS:${PN} += "kio-kamera"

inherit rpm
