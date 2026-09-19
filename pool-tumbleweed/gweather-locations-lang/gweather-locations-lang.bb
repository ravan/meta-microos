SUMMARY = "Translations for package gweather-locations"
DESCRIPTION = "Provides translations for the 'gweather-locations' package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.2"

RPM_NAME = "gweather-locations-lang-2026.2-1.2.noarch.rpm"
RPM_HASH = "f8d47c8528aef2bbbc5514a2caa5cab033664208d2f70196e58b8b7709ad82e2624f6492fe6d2e9f7f430a5d623e3f9a1b877af260cb507dafe23a85408f2ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gweather-locations-lang \
gweather-locations-lang-all \
locale-gweather-locations-ar \
locale-gweather-locations-as \
locale-gweather-locations-ast \
locale-gweather-locations-az \
locale-gweather-locations-be \
locale-gweather-locations-be@latin \
locale-gweather-locations-bg \
locale-gweather-locations-bn \
locale-gweather-locations-bn-IN \
locale-gweather-locations-br \
locale-gweather-locations-bs \
locale-gweather-locations-ca \
locale-gweather-locations-ca@valencia \
locale-gweather-locations-cs \
locale-gweather-locations-cy \
locale-gweather-locations-da \
locale-gweather-locations-de \
locale-gweather-locations-dz \
locale-gweather-locations-el \
locale-gweather-locations-en-CA \
locale-gweather-locations-en-GB \
locale-gweather-locations-en@shaw \
locale-gweather-locations-eo \
locale-gweather-locations-es \
locale-gweather-locations-et \
locale-gweather-locations-eu \
locale-gweather-locations-fa \
locale-gweather-locations-fi \
locale-gweather-locations-fr \
locale-gweather-locations-fur \
locale-gweather-locations-ga \
locale-gweather-locations-gd \
locale-gweather-locations-gl \
locale-gweather-locations-gu \
locale-gweather-locations-he \
locale-gweather-locations-hi \
locale-gweather-locations-hr \
locale-gweather-locations-hu \
locale-gweather-locations-id \
locale-gweather-locations-is \
locale-gweather-locations-it \
locale-gweather-locations-ja \
locale-gweather-locations-ka \
locale-gweather-locations-kk \
locale-gweather-locations-kn \
locale-gweather-locations-ko \
locale-gweather-locations-lt \
locale-gweather-locations-lv \
locale-gweather-locations-mai \
locale-gweather-locations-mk \
locale-gweather-locations-ml \
locale-gweather-locations-mr \
locale-gweather-locations-ms \
locale-gweather-locations-nb \
locale-gweather-locations-nds \
locale-gweather-locations-ne \
locale-gweather-locations-nl \
locale-gweather-locations-nn \
locale-gweather-locations-oc \
locale-gweather-locations-or \
locale-gweather-locations-pa \
locale-gweather-locations-pl \
locale-gweather-locations-pt \
locale-gweather-locations-pt-BR \
locale-gweather-locations-ro \
locale-gweather-locations-ru \
locale-gweather-locations-si \
locale-gweather-locations-sk \
locale-gweather-locations-sl \
locale-gweather-locations-sq \
locale-gweather-locations-sr \
locale-gweather-locations-sr@latin \
locale-gweather-locations-sv \
locale-gweather-locations-ta \
locale-gweather-locations-te \
locale-gweather-locations-th \
locale-gweather-locations-tr \
locale-gweather-locations-ug \
locale-gweather-locations-uk \
locale-gweather-locations-vi \
locale-gweather-locations-zh-CN \
locale-gweather-locations-zh-HK \
locale-gweather-locations-zh-TW"

RDEPENDS:${PN} += "gweather-locations"

inherit rpm
