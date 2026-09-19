SUMMARY = "Translations for package fwupd"
DESCRIPTION = "Provides translations for the 'fwupd' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-lang-2.1.7-2.1.noarch.rpm"
RPM_HASH = "6955b9bb932bd0e4f904af6c7920442f9e02f871dc4dd13bcce277bf6936d0e0b99594e44f2efe3c4a555a159867c56d9a6d74bcc4480da61d1269d0166f7cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-lang \
fwupd-lang-all \
locale-fwupd-af \
locale-fwupd-ar \
locale-fwupd-ast \
locale-fwupd-bg \
locale-fwupd-ca \
locale-fwupd-cs \
locale-fwupd-da \
locale-fwupd-de \
locale-fwupd-en-GB \
locale-fwupd-eo \
locale-fwupd-es \
locale-fwupd-et \
locale-fwupd-eu \
locale-fwupd-fi \
locale-fwupd-fr \
locale-fwupd-fur \
locale-fwupd-gl \
locale-fwupd-he \
locale-fwupd-hi \
locale-fwupd-hr \
locale-fwupd-hu \
locale-fwupd-id \
locale-fwupd-it \
locale-fwupd-ja \
locale-fwupd-ka \
locale-fwupd-kk \
locale-fwupd-ko \
locale-fwupd-lt \
locale-fwupd-lv \
locale-fwupd-nl \
locale-fwupd-oc \
locale-fwupd-pa \
locale-fwupd-pl \
locale-fwupd-pt \
locale-fwupd-pt-BR \
locale-fwupd-ro \
locale-fwupd-ru \
locale-fwupd-si \
locale-fwupd-sk \
locale-fwupd-sl \
locale-fwupd-sq \
locale-fwupd-sr \
locale-fwupd-sv \
locale-fwupd-tr \
locale-fwupd-uk \
locale-fwupd-zh-CN \
locale-fwupd-zh-TW"

RDEPENDS:${PN} += "fwupd"

inherit rpm
