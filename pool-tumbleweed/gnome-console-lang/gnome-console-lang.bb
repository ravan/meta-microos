SUMMARY = "Translations for package gnome-console"
DESCRIPTION = "Provides translations for the 'gnome-console' package."
LICENSE = "GPL-3.0-only"

PV = "50.0"

RPM_NAME = "gnome-console-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "a0d0f056475b88f40ddd1d78defb0bc2c7a01677a12992112b44cea9a2223601407a6c680eafa082c28994543df9e79da9f26b72ddc62b0fa9d7bee444177b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-console-lang \
gnome-console-lang-all \
locale-gnome-console-ar \
locale-gnome-console-az \
locale-gnome-console-be \
locale-gnome-console-bg \
locale-gnome-console-ca \
locale-gnome-console-cs \
locale-gnome-console-da \
locale-gnome-console-de \
locale-gnome-console-el \
locale-gnome-console-en-GB \
locale-gnome-console-eo \
locale-gnome-console-es \
locale-gnome-console-eu \
locale-gnome-console-fa \
locale-gnome-console-fi \
locale-gnome-console-fr \
locale-gnome-console-fur \
locale-gnome-console-gl \
locale-gnome-console-he \
locale-gnome-console-hi \
locale-gnome-console-hr \
locale-gnome-console-hu \
locale-gnome-console-ia \
locale-gnome-console-id \
locale-gnome-console-it \
locale-gnome-console-ja \
locale-gnome-console-ka \
locale-gnome-console-kk \
locale-gnome-console-ko \
locale-gnome-console-lt \
locale-gnome-console-lv \
locale-gnome-console-nb \
locale-gnome-console-ne \
locale-gnome-console-nl \
locale-gnome-console-oc \
locale-gnome-console-pa \
locale-gnome-console-pl \
locale-gnome-console-pt \
locale-gnome-console-pt-BR \
locale-gnome-console-ro \
locale-gnome-console-ru \
locale-gnome-console-sk \
locale-gnome-console-sl \
locale-gnome-console-sr \
locale-gnome-console-sr@latin \
locale-gnome-console-sv \
locale-gnome-console-th \
locale-gnome-console-tr \
locale-gnome-console-ug \
locale-gnome-console-uk \
locale-gnome-console-vi \
locale-gnome-console-zh-CN \
locale-gnome-console-zh-TW"

RDEPENDS:${PN} += "gnome-console"

inherit rpm
