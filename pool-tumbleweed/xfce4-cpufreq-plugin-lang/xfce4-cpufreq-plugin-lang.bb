SUMMARY = "Translations for package xfce4-cpufreq-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-cpufreq-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "xfce4-cpufreq-plugin-lang-1.3.0-1.4.noarch.rpm"
RPM_HASH = "33b8b63ef5571653ae4626eb3c9d86991abf7dd56607a958fcf81deb170cca1f7cd648286961248604c4559131449427859a910967cf92b68c37d958ca2bc085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-cpufreq-plugin-ar \
locale-xfce4-cpufreq-plugin-ast \
locale-xfce4-cpufreq-plugin-be \
locale-xfce4-cpufreq-plugin-bg \
locale-xfce4-cpufreq-plugin-ca \
locale-xfce4-cpufreq-plugin-cs \
locale-xfce4-cpufreq-plugin-da \
locale-xfce4-cpufreq-plugin-de \
locale-xfce4-cpufreq-plugin-el \
locale-xfce4-cpufreq-plugin-en-AU \
locale-xfce4-cpufreq-plugin-en-GB \
locale-xfce4-cpufreq-plugin-es \
locale-xfce4-cpufreq-plugin-et \
locale-xfce4-cpufreq-plugin-eu \
locale-xfce4-cpufreq-plugin-fi \
locale-xfce4-cpufreq-plugin-fr \
locale-xfce4-cpufreq-plugin-gl \
locale-xfce4-cpufreq-plugin-he \
locale-xfce4-cpufreq-plugin-hr \
locale-xfce4-cpufreq-plugin-hu \
locale-xfce4-cpufreq-plugin-id \
locale-xfce4-cpufreq-plugin-is \
locale-xfce4-cpufreq-plugin-it \
locale-xfce4-cpufreq-plugin-ja \
locale-xfce4-cpufreq-plugin-kk \
locale-xfce4-cpufreq-plugin-ko \
locale-xfce4-cpufreq-plugin-lt \
locale-xfce4-cpufreq-plugin-lv \
locale-xfce4-cpufreq-plugin-ms \
locale-xfce4-cpufreq-plugin-nb \
locale-xfce4-cpufreq-plugin-nl \
locale-xfce4-cpufreq-plugin-oc \
locale-xfce4-cpufreq-plugin-pa \
locale-xfce4-cpufreq-plugin-pl \
locale-xfce4-cpufreq-plugin-pt \
locale-xfce4-cpufreq-plugin-pt-BR \
locale-xfce4-cpufreq-plugin-ro \
locale-xfce4-cpufreq-plugin-ru \
locale-xfce4-cpufreq-plugin-sk \
locale-xfce4-cpufreq-plugin-sl \
locale-xfce4-cpufreq-plugin-sq \
locale-xfce4-cpufreq-plugin-sr \
locale-xfce4-cpufreq-plugin-sv \
locale-xfce4-cpufreq-plugin-th \
locale-xfce4-cpufreq-plugin-tr \
locale-xfce4-cpufreq-plugin-ug \
locale-xfce4-cpufreq-plugin-uk \
locale-xfce4-cpufreq-plugin-vi \
locale-xfce4-cpufreq-plugin-zh-CN \
locale-xfce4-cpufreq-plugin-zh-TW \
xfce4-cpufreq-plugin-lang \
xfce4-cpufreq-plugin-lang-all \
xfce4-panel-plugin-cpufreq-lang"

RDEPENDS:${PN} += "xfce4-cpufreq-plugin"

inherit rpm
