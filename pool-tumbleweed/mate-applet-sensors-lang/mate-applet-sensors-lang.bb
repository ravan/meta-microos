SUMMARY = "Translations for package mate-applet-sensors"
DESCRIPTION = "Provides translations for the 'mate-applet-sensors' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-applet-sensors-lang-1.28.0-1.11.noarch.rpm"
RPM_HASH = "d62660d1d394ca8432500d81c26c792115578a5a13765cf0c3ef68fa394857c3226d73c9e4d3bb51343a527015a0859ffcc2a8c1fa158c6b3f5920275d53fe78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-applet-sensors-af \
locale-mate-applet-sensors-ar \
locale-mate-applet-sensors-as \
locale-mate-applet-sensors-ast \
locale-mate-applet-sensors-az \
locale-mate-applet-sensors-be \
locale-mate-applet-sensors-bg \
locale-mate-applet-sensors-bn \
locale-mate-applet-sensors-bn-IN \
locale-mate-applet-sensors-br \
locale-mate-applet-sensors-bs \
locale-mate-applet-sensors-ca \
locale-mate-applet-sensors-ca@valencia \
locale-mate-applet-sensors-cs \
locale-mate-applet-sensors-cy \
locale-mate-applet-sensors-da \
locale-mate-applet-sensors-de \
locale-mate-applet-sensors-dz \
locale-mate-applet-sensors-el \
locale-mate-applet-sensors-en-AU \
locale-mate-applet-sensors-en-CA \
locale-mate-applet-sensors-en-GB \
locale-mate-applet-sensors-eo \
locale-mate-applet-sensors-es \
locale-mate-applet-sensors-es-AR \
locale-mate-applet-sensors-es-CL \
locale-mate-applet-sensors-es-CO \
locale-mate-applet-sensors-es-CR \
locale-mate-applet-sensors-es-DO \
locale-mate-applet-sensors-es-EC \
locale-mate-applet-sensors-es-ES \
locale-mate-applet-sensors-es-MX \
locale-mate-applet-sensors-es-NI \
locale-mate-applet-sensors-es-PA \
locale-mate-applet-sensors-es-PE \
locale-mate-applet-sensors-es-PR \
locale-mate-applet-sensors-es-SV \
locale-mate-applet-sensors-es-UY \
locale-mate-applet-sensors-es-VE \
locale-mate-applet-sensors-et \
locale-mate-applet-sensors-eu \
locale-mate-applet-sensors-fa \
locale-mate-applet-sensors-fi \
locale-mate-applet-sensors-fr \
locale-mate-applet-sensors-fr-CA \
locale-mate-applet-sensors-fur \
locale-mate-applet-sensors-ga \
locale-mate-applet-sensors-gl \
locale-mate-applet-sensors-gu \
locale-mate-applet-sensors-he \
locale-mate-applet-sensors-hi \
locale-mate-applet-sensors-hr \
locale-mate-applet-sensors-hu \
locale-mate-applet-sensors-ia \
locale-mate-applet-sensors-id \
locale-mate-applet-sensors-is \
locale-mate-applet-sensors-it \
locale-mate-applet-sensors-ja \
locale-mate-applet-sensors-ka \
locale-mate-applet-sensors-kk \
locale-mate-applet-sensors-km \
locale-mate-applet-sensors-kn \
locale-mate-applet-sensors-ko \
locale-mate-applet-sensors-lt \
locale-mate-applet-sensors-lv \
locale-mate-applet-sensors-mai \
locale-mate-applet-sensors-mk \
locale-mate-applet-sensors-ml \
locale-mate-applet-sensors-mr \
locale-mate-applet-sensors-ms \
locale-mate-applet-sensors-nb \
locale-mate-applet-sensors-nds \
locale-mate-applet-sensors-ne \
locale-mate-applet-sensors-nl \
locale-mate-applet-sensors-nn \
locale-mate-applet-sensors-oc \
locale-mate-applet-sensors-or \
locale-mate-applet-sensors-pa \
locale-mate-applet-sensors-pl \
locale-mate-applet-sensors-pt \
locale-mate-applet-sensors-pt-BR \
locale-mate-applet-sensors-ro \
locale-mate-applet-sensors-ru \
locale-mate-applet-sensors-si \
locale-mate-applet-sensors-sk \
locale-mate-applet-sensors-sl \
locale-mate-applet-sensors-sq \
locale-mate-applet-sensors-sr \
locale-mate-applet-sensors-sr@latin \
locale-mate-applet-sensors-sv \
locale-mate-applet-sensors-ta \
locale-mate-applet-sensors-te \
locale-mate-applet-sensors-th \
locale-mate-applet-sensors-tr \
locale-mate-applet-sensors-ug \
locale-mate-applet-sensors-uk \
locale-mate-applet-sensors-vi \
locale-mate-applet-sensors-wa \
locale-mate-applet-sensors-zh-CN \
locale-mate-applet-sensors-zh-HK \
locale-mate-applet-sensors-zh-TW \
mate-applet-sensors-lang \
mate-applet-sensors-lang-all"

RDEPENDS:${PN} += "mate-applet-sensors"

inherit rpm
