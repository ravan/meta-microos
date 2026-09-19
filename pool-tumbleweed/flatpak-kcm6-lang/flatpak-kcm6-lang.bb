SUMMARY = "Translations for package flatpak-kcm6"
DESCRIPTION = "Provides translations for the 'flatpak-kcm6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "flatpak-kcm6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "f4b0c06db9d8e4c4f4fb6bcf7c13dcb0716b23fb7dc7148936232868a985967827b78398dd458d8e2c72f1de0cc478ba73de448d16a8cc91f63fa4ef0e5c3163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-kcm6-lang \
flatpak-kcm6-lang-all \
locale-flatpak-kcm6-ar \
locale-flatpak-kcm6-ast \
locale-flatpak-kcm6-ca \
locale-flatpak-kcm6-ca@valencia \
locale-flatpak-kcm6-cs \
locale-flatpak-kcm6-da \
locale-flatpak-kcm6-de \
locale-flatpak-kcm6-en-GB \
locale-flatpak-kcm6-eo \
locale-flatpak-kcm6-es \
locale-flatpak-kcm6-eu \
locale-flatpak-kcm6-fi \
locale-flatpak-kcm6-fr \
locale-flatpak-kcm6-ga \
locale-flatpak-kcm6-gl \
locale-flatpak-kcm6-he \
locale-flatpak-kcm6-hi \
locale-flatpak-kcm6-hu \
locale-flatpak-kcm6-ia \
locale-flatpak-kcm6-id \
locale-flatpak-kcm6-is \
locale-flatpak-kcm6-it \
locale-flatpak-kcm6-ja \
locale-flatpak-kcm6-ka \
locale-flatpak-kcm6-ko \
locale-flatpak-kcm6-lt \
locale-flatpak-kcm6-lv \
locale-flatpak-kcm6-nb \
locale-flatpak-kcm6-nl \
locale-flatpak-kcm6-nn \
locale-flatpak-kcm6-pa \
locale-flatpak-kcm6-pl \
locale-flatpak-kcm6-pt \
locale-flatpak-kcm6-pt-BR \
locale-flatpak-kcm6-ro \
locale-flatpak-kcm6-ru \
locale-flatpak-kcm6-sk \
locale-flatpak-kcm6-sl \
locale-flatpak-kcm6-ta \
locale-flatpak-kcm6-tr \
locale-flatpak-kcm6-uk \
locale-flatpak-kcm6-zh-CN \
locale-flatpak-kcm6-zh-TW"

RDEPENDS:${PN} += "flatpak-kcm6"

inherit rpm
