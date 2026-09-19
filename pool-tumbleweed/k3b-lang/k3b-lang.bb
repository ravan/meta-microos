SUMMARY = "Translations for package k3b"
DESCRIPTION = "Provides translations for the 'k3b' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "k3b-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "129305d8ad0d350b749be1716f0726bb65b3f5c75809bb59d9d9f4b5e9be520ed641d85c8e557e14bf4b26d4e762a94868e34b8fa168530b367e1938cacf6ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k3b-lang \
k3b-lang-all \
locale-k3b-ar \
locale-k3b-be \
locale-k3b-bg \
locale-k3b-bs \
locale-k3b-ca \
locale-k3b-ca@valencia \
locale-k3b-cs \
locale-k3b-da \
locale-k3b-de \
locale-k3b-el \
locale-k3b-en-GB \
locale-k3b-eo \
locale-k3b-es \
locale-k3b-et \
locale-k3b-eu \
locale-k3b-fa \
locale-k3b-fi \
locale-k3b-fr \
locale-k3b-ga \
locale-k3b-gl \
locale-k3b-he \
locale-k3b-hi \
locale-k3b-hr \
locale-k3b-hu \
locale-k3b-ia \
locale-k3b-id \
locale-k3b-is \
locale-k3b-it \
locale-k3b-ja \
locale-k3b-ka \
locale-k3b-kk \
locale-k3b-km \
locale-k3b-ko \
locale-k3b-lt \
locale-k3b-lv \
locale-k3b-mai \
locale-k3b-ml \
locale-k3b-mr \
locale-k3b-ms \
locale-k3b-nb \
locale-k3b-nds \
locale-k3b-nl \
locale-k3b-nn \
locale-k3b-oc \
locale-k3b-pa \
locale-k3b-pl \
locale-k3b-pt \
locale-k3b-pt-BR \
locale-k3b-ro \
locale-k3b-ru \
locale-k3b-sk \
locale-k3b-sl \
locale-k3b-sq \
locale-k3b-sr \
locale-k3b-sr@ijekavian \
locale-k3b-sr@ijekavianlatin \
locale-k3b-sr@latin \
locale-k3b-sv \
locale-k3b-th \
locale-k3b-tr \
locale-k3b-ug \
locale-k3b-uk \
locale-k3b-wa \
locale-k3b-zh-CN \
locale-k3b-zh-TW"

RDEPENDS:${PN} += "k3b"

inherit rpm
