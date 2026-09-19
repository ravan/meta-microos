SUMMARY = "Translations for package kamoso"
DESCRIPTION = "Provides translations for the 'kamoso' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kamoso-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "7dc9d5b1a43e0e53c94b9a549e72ae15505ca3e8a9642ff80279cf7bca46d92e8d6438bc5eaef40efcf4587f7bfdb7598f53508a8b345e392b4c2ea2a89ef9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamoso-lang \
kamoso-lang-all \
locale-kamoso-ar \
locale-kamoso-bg \
locale-kamoso-bs \
locale-kamoso-ca \
locale-kamoso-ca@valencia \
locale-kamoso-cs \
locale-kamoso-da \
locale-kamoso-de \
locale-kamoso-el \
locale-kamoso-en-GB \
locale-kamoso-eo \
locale-kamoso-es \
locale-kamoso-et \
locale-kamoso-eu \
locale-kamoso-fi \
locale-kamoso-fr \
locale-kamoso-ga \
locale-kamoso-gl \
locale-kamoso-he \
locale-kamoso-hu \
locale-kamoso-ia \
locale-kamoso-id \
locale-kamoso-is \
locale-kamoso-it \
locale-kamoso-ja \
locale-kamoso-ka \
locale-kamoso-kk \
locale-kamoso-ko \
locale-kamoso-lt \
locale-kamoso-lv \
locale-kamoso-mai \
locale-kamoso-mr \
locale-kamoso-nb \
locale-kamoso-nds \
locale-kamoso-nl \
locale-kamoso-nn \
locale-kamoso-pa \
locale-kamoso-pl \
locale-kamoso-pt \
locale-kamoso-pt-BR \
locale-kamoso-ro \
locale-kamoso-ru \
locale-kamoso-sk \
locale-kamoso-sl \
locale-kamoso-sv \
locale-kamoso-tr \
locale-kamoso-ug \
locale-kamoso-uk \
locale-kamoso-zh-CN \
locale-kamoso-zh-TW"

RDEPENDS:${PN} += "kamoso"

inherit rpm
