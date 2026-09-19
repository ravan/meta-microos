SUMMARY = "Translations for package kolourpaint"
DESCRIPTION = "Provides translations for the 'kolourpaint' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kolourpaint-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5d4378e7969fdf38ce1c4a78dbb7183b47c12b4590265e1200735573f19de5656dcd28add3f8cdf14d87118d7f2ba01924324e78e014ca4547b04c301610aa99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kolourpaint-lang \
kolourpaint-lang-all \
locale-kolourpaint-ar \
locale-kolourpaint-be \
locale-kolourpaint-bg \
locale-kolourpaint-br \
locale-kolourpaint-bs \
locale-kolourpaint-ca \
locale-kolourpaint-ca@valencia \
locale-kolourpaint-cs \
locale-kolourpaint-cy \
locale-kolourpaint-da \
locale-kolourpaint-de \
locale-kolourpaint-el \
locale-kolourpaint-en-GB \
locale-kolourpaint-eo \
locale-kolourpaint-es \
locale-kolourpaint-et \
locale-kolourpaint-eu \
locale-kolourpaint-fa \
locale-kolourpaint-fi \
locale-kolourpaint-fr \
locale-kolourpaint-ga \
locale-kolourpaint-gl \
locale-kolourpaint-he \
locale-kolourpaint-hi \
locale-kolourpaint-hr \
locale-kolourpaint-hu \
locale-kolourpaint-ia \
locale-kolourpaint-id \
locale-kolourpaint-is \
locale-kolourpaint-it \
locale-kolourpaint-ja \
locale-kolourpaint-ka \
locale-kolourpaint-kk \
locale-kolourpaint-km \
locale-kolourpaint-ko \
locale-kolourpaint-lt \
locale-kolourpaint-lv \
locale-kolourpaint-mk \
locale-kolourpaint-ml \
locale-kolourpaint-mr \
locale-kolourpaint-ms \
locale-kolourpaint-nb \
locale-kolourpaint-nds \
locale-kolourpaint-ne \
locale-kolourpaint-nl \
locale-kolourpaint-nn \
locale-kolourpaint-oc \
locale-kolourpaint-pa \
locale-kolourpaint-pl \
locale-kolourpaint-pt \
locale-kolourpaint-pt-BR \
locale-kolourpaint-ro \
locale-kolourpaint-ru \
locale-kolourpaint-si \
locale-kolourpaint-sk \
locale-kolourpaint-sl \
locale-kolourpaint-sq \
locale-kolourpaint-sv \
locale-kolourpaint-ta \
locale-kolourpaint-th \
locale-kolourpaint-tr \
locale-kolourpaint-ug \
locale-kolourpaint-uk \
locale-kolourpaint-zh-CN \
locale-kolourpaint-zh-HK \
locale-kolourpaint-zh-TW"

RDEPENDS:${PN} += "kolourpaint"

inherit rpm
