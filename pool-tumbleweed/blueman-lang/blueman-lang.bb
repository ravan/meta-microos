SUMMARY = "Translations for package blueman"
DESCRIPTION = "Provides translations for the 'blueman' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "blueman-lang-2.4.6-1.5.noarch.rpm"
RPM_HASH = "736b1ff2c45ec3a778595e5affffb2dc4c27fd88cc5e8860a72e608e9db5bfeb16472608edfccb54f452e17f07426a76302383a376ff40164ea842fdbc784fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueman-lang \
blueman-lang-all \
locale-blueman-af \
locale-blueman-ar \
locale-blueman-ast \
locale-blueman-be \
locale-blueman-bg \
locale-blueman-bs \
locale-blueman-ca \
locale-blueman-cs \
locale-blueman-cy \
locale-blueman-da \
locale-blueman-de \
locale-blueman-el \
locale-blueman-en-AU \
locale-blueman-en-GB \
locale-blueman-eo \
locale-blueman-es \
locale-blueman-et \
locale-blueman-eu \
locale-blueman-fa \
locale-blueman-fi \
locale-blueman-fr \
locale-blueman-ga \
locale-blueman-gl \
locale-blueman-he \
locale-blueman-hi \
locale-blueman-hr \
locale-blueman-hu \
locale-blueman-id \
locale-blueman-is \
locale-blueman-it \
locale-blueman-ja \
locale-blueman-ka \
locale-blueman-kk \
locale-blueman-ko \
locale-blueman-lt \
locale-blueman-lv \
locale-blueman-mk \
locale-blueman-mr \
locale-blueman-ms \
locale-blueman-nb \
locale-blueman-nds \
locale-blueman-nl \
locale-blueman-oc \
locale-blueman-pl \
locale-blueman-pt \
locale-blueman-pt-BR \
locale-blueman-ro \
locale-blueman-ru \
locale-blueman-sk \
locale-blueman-sl \
locale-blueman-sq \
locale-blueman-sr \
locale-blueman-sv \
locale-blueman-ta \
locale-blueman-tr \
locale-blueman-uk \
locale-blueman-vi \
locale-blueman-zh-CN \
locale-blueman-zh-HK \
locale-blueman-zh-TW"

RDEPENDS:${PN} += "blueman"

inherit rpm
