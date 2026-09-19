SUMMARY = "Translations for package pdfarranger"
DESCRIPTION = "Provides translations for the 'pdfarranger' package."
LICENSE = "GPL-3.0-only"

PV = "1.14.0"

RPM_NAME = "pdfarranger-lang-1.14.0-1.1.noarch.rpm"
RPM_HASH = "447c0b7831c8ce48f78a7fb88f928c4f5ff632714e6f33c324543d2ba03ae4f57f3b797feed6539b1b7aebb890254d18bc7696231f0ac1c572de12c787ebf601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pdfarranger-ar \
locale-pdfarranger-ca \
locale-pdfarranger-ca@valencia \
locale-pdfarranger-cs \
locale-pdfarranger-da \
locale-pdfarranger-de \
locale-pdfarranger-el \
locale-pdfarranger-es \
locale-pdfarranger-eu \
locale-pdfarranger-fi \
locale-pdfarranger-fr \
locale-pdfarranger-he \
locale-pdfarranger-hr \
locale-pdfarranger-hu \
locale-pdfarranger-id \
locale-pdfarranger-is \
locale-pdfarranger-it \
locale-pdfarranger-ja \
locale-pdfarranger-ka \
locale-pdfarranger-ko \
locale-pdfarranger-nl \
locale-pdfarranger-oc \
locale-pdfarranger-pl-PL \
locale-pdfarranger-pt-BR \
locale-pdfarranger-pt-PT \
locale-pdfarranger-ru \
locale-pdfarranger-sl \
locale-pdfarranger-sv \
locale-pdfarranger-tr \
locale-pdfarranger-uk \
locale-pdfarranger-vi \
locale-pdfarranger-zh-CN \
locale-pdfarranger-zh-TW \
pdfarranger-lang \
pdfarranger-lang-all"

RDEPENDS:${PN} += "pdfarranger"

inherit rpm
