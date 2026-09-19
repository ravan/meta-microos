SUMMARY = "Translations for package xfce4-diskperf-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-diskperf-plugin' package."
LICENSE = "BSD-2-Clause"

PV = "2.8.0"

RPM_NAME = "xfce4-diskperf-plugin-lang-2.8.0-1.4.noarch.rpm"
RPM_HASH = "d26d11daa0a52ef87c6fe89ed04a20ae4af4780f8363c53a818a1aa39cb9ee8f21834ba6d83520d5ee762efdd1c642472f69b9ba5902348cd85a315e42798cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-diskperf-plugin-ar \
locale-xfce4-diskperf-plugin-be \
locale-xfce4-diskperf-plugin-bg \
locale-xfce4-diskperf-plugin-ca \
locale-xfce4-diskperf-plugin-cs \
locale-xfce4-diskperf-plugin-da \
locale-xfce4-diskperf-plugin-de \
locale-xfce4-diskperf-plugin-el \
locale-xfce4-diskperf-plugin-en-AU \
locale-xfce4-diskperf-plugin-en-CA \
locale-xfce4-diskperf-plugin-en-GB \
locale-xfce4-diskperf-plugin-es \
locale-xfce4-diskperf-plugin-et \
locale-xfce4-diskperf-plugin-eu \
locale-xfce4-diskperf-plugin-fi \
locale-xfce4-diskperf-plugin-fr \
locale-xfce4-diskperf-plugin-gl \
locale-xfce4-diskperf-plugin-he \
locale-xfce4-diskperf-plugin-hr \
locale-xfce4-diskperf-plugin-hu \
locale-xfce4-diskperf-plugin-id \
locale-xfce4-diskperf-plugin-is \
locale-xfce4-diskperf-plugin-it \
locale-xfce4-diskperf-plugin-ja \
locale-xfce4-diskperf-plugin-ko \
locale-xfce4-diskperf-plugin-lt \
locale-xfce4-diskperf-plugin-lv \
locale-xfce4-diskperf-plugin-ms \
locale-xfce4-diskperf-plugin-nb \
locale-xfce4-diskperf-plugin-nl \
locale-xfce4-diskperf-plugin-oc \
locale-xfce4-diskperf-plugin-pa \
locale-xfce4-diskperf-plugin-pl \
locale-xfce4-diskperf-plugin-pt \
locale-xfce4-diskperf-plugin-pt-BR \
locale-xfce4-diskperf-plugin-ro \
locale-xfce4-diskperf-plugin-ru \
locale-xfce4-diskperf-plugin-sk \
locale-xfce4-diskperf-plugin-sl \
locale-xfce4-diskperf-plugin-sq \
locale-xfce4-diskperf-plugin-sr \
locale-xfce4-diskperf-plugin-sv \
locale-xfce4-diskperf-plugin-th \
locale-xfce4-diskperf-plugin-tr \
locale-xfce4-diskperf-plugin-ug \
locale-xfce4-diskperf-plugin-uk \
locale-xfce4-diskperf-plugin-vi \
locale-xfce4-diskperf-plugin-zh-CN \
locale-xfce4-diskperf-plugin-zh-TW \
xfce4-diskperf-plugin-lang \
xfce4-diskperf-plugin-lang-all \
xfce4-panel-plugin-diskperf-lang"

RDEPENDS:${PN} += "xfce4-diskperf-plugin"

inherit rpm
