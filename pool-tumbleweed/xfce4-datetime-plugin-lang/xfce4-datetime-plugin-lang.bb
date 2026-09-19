SUMMARY = "Translations for package xfce4-datetime-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-datetime-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-datetime-plugin-lang-0.8.3-1.14.noarch.rpm"
RPM_HASH = "f6369c8cbb2fedeb33169086c12021ae94e8792feaefa3afe608bb4fd335e97350c94ef2cc896f465176d0f27f61fb7b4d39b5e8e7a56e8c4ab309ccced7c63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-datetime-plugin-ar \
locale-xfce4-datetime-plugin-be \
locale-xfce4-datetime-plugin-bg \
locale-xfce4-datetime-plugin-ca \
locale-xfce4-datetime-plugin-cs \
locale-xfce4-datetime-plugin-da \
locale-xfce4-datetime-plugin-de \
locale-xfce4-datetime-plugin-el \
locale-xfce4-datetime-plugin-en-AU \
locale-xfce4-datetime-plugin-en-CA \
locale-xfce4-datetime-plugin-en-GB \
locale-xfce4-datetime-plugin-es \
locale-xfce4-datetime-plugin-et \
locale-xfce4-datetime-plugin-eu \
locale-xfce4-datetime-plugin-fi \
locale-xfce4-datetime-plugin-fr \
locale-xfce4-datetime-plugin-gl \
locale-xfce4-datetime-plugin-he \
locale-xfce4-datetime-plugin-hr \
locale-xfce4-datetime-plugin-hu \
locale-xfce4-datetime-plugin-id \
locale-xfce4-datetime-plugin-is \
locale-xfce4-datetime-plugin-it \
locale-xfce4-datetime-plugin-ja \
locale-xfce4-datetime-plugin-ko \
locale-xfce4-datetime-plugin-lt \
locale-xfce4-datetime-plugin-lv \
locale-xfce4-datetime-plugin-ms \
locale-xfce4-datetime-plugin-nb \
locale-xfce4-datetime-plugin-nl \
locale-xfce4-datetime-plugin-nn \
locale-xfce4-datetime-plugin-oc \
locale-xfce4-datetime-plugin-pa \
locale-xfce4-datetime-plugin-pl \
locale-xfce4-datetime-plugin-pt \
locale-xfce4-datetime-plugin-pt-BR \
locale-xfce4-datetime-plugin-ro \
locale-xfce4-datetime-plugin-ru \
locale-xfce4-datetime-plugin-sk \
locale-xfce4-datetime-plugin-sl \
locale-xfce4-datetime-plugin-sq \
locale-xfce4-datetime-plugin-sr \
locale-xfce4-datetime-plugin-sv \
locale-xfce4-datetime-plugin-th \
locale-xfce4-datetime-plugin-tr \
locale-xfce4-datetime-plugin-ug \
locale-xfce4-datetime-plugin-uk \
locale-xfce4-datetime-plugin-zh-CN \
locale-xfce4-datetime-plugin-zh-TW \
xfce4-datetime-plugin-lang \
xfce4-datetime-plugin-lang-all \
xfce4-panel-plugin-datetime-lang"

RDEPENDS:${PN} += "xfce4-datetime-plugin"

inherit rpm
