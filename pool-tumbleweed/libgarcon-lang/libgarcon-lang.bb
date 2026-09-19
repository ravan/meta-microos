SUMMARY = "Languages for package libgarcon"
DESCRIPTION = "Provides translations to the package libgarcon"
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-lang-4.20.0-1.8.noarch.rpm"
RPM_HASH = "a839fdb63fcf590e04366e50c7bda4a5538976da48cd284b103c22a731a19530ab9c9c7b189d0e28caf997ca9a4d289a26bfaf34d2e9bdc4b099db088ad9a520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-lang \
libgarcon-lang-all \
locale-libgarcon-ar \
locale-libgarcon-be \
locale-libgarcon-bg \
locale-libgarcon-bn \
locale-libgarcon-ca \
locale-libgarcon-cs \
locale-libgarcon-cy \
locale-libgarcon-da \
locale-libgarcon-de \
locale-libgarcon-el \
locale-libgarcon-en-AU \
locale-libgarcon-en-GB \
locale-libgarcon-eo \
locale-libgarcon-es \
locale-libgarcon-et \
locale-libgarcon-eu \
locale-libgarcon-fi \
locale-libgarcon-fr \
locale-libgarcon-gl \
locale-libgarcon-he \
locale-libgarcon-hi \
locale-libgarcon-hr \
locale-libgarcon-hu \
locale-libgarcon-id \
locale-libgarcon-is \
locale-libgarcon-it \
locale-libgarcon-ja \
locale-libgarcon-ka \
locale-libgarcon-ko \
locale-libgarcon-lt \
locale-libgarcon-lv \
locale-libgarcon-ms \
locale-libgarcon-nb \
locale-libgarcon-nl \
locale-libgarcon-nn \
locale-libgarcon-oc \
locale-libgarcon-pa \
locale-libgarcon-pl \
locale-libgarcon-pt \
locale-libgarcon-pt-BR \
locale-libgarcon-ro \
locale-libgarcon-ru \
locale-libgarcon-si \
locale-libgarcon-sk \
locale-libgarcon-sl \
locale-libgarcon-sq \
locale-libgarcon-sr \
locale-libgarcon-sv \
locale-libgarcon-te \
locale-libgarcon-th \
locale-libgarcon-tr \
locale-libgarcon-ug \
locale-libgarcon-uk \
locale-libgarcon-zh-CN \
locale-libgarcon-zh-HK \
locale-libgarcon-zh-TW"

RDEPENDS:${PN} += "libgarcon-data"

inherit rpm
