SUMMARY = "Translations for package pulseaudio"
DESCRIPTION = "Provides translations for the 'pulseaudio' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-lang-17.0-7.5.noarch.rpm"
RPM_HASH = "8e30c9262422816634dc727b703a3e5be66e6888c9b8e4f3474c0532fc739f032e6c0748fdaa89770ccad0c9eb13b02f093bea2aa7a75be9d8a6cc98fac6f896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pulseaudio-af \
locale-pulseaudio-as \
locale-pulseaudio-be \
locale-pulseaudio-bg \
locale-pulseaudio-bn-IN \
locale-pulseaudio-ca \
locale-pulseaudio-cs \
locale-pulseaudio-da \
locale-pulseaudio-de \
locale-pulseaudio-de-CH \
locale-pulseaudio-el \
locale-pulseaudio-eo \
locale-pulseaudio-es \
locale-pulseaudio-eu \
locale-pulseaudio-fi \
locale-pulseaudio-fr \
locale-pulseaudio-gl \
locale-pulseaudio-gu \
locale-pulseaudio-he \
locale-pulseaudio-hi \
locale-pulseaudio-hr \
locale-pulseaudio-hu \
locale-pulseaudio-id \
locale-pulseaudio-it \
locale-pulseaudio-ja \
locale-pulseaudio-ka \
locale-pulseaudio-kk \
locale-pulseaudio-kn \
locale-pulseaudio-ko \
locale-pulseaudio-lt \
locale-pulseaudio-ml \
locale-pulseaudio-mr \
locale-pulseaudio-nl \
locale-pulseaudio-nn \
locale-pulseaudio-oc \
locale-pulseaudio-or \
locale-pulseaudio-pa \
locale-pulseaudio-pl \
locale-pulseaudio-pt \
locale-pulseaudio-pt-BR \
locale-pulseaudio-ru \
locale-pulseaudio-si \
locale-pulseaudio-sk \
locale-pulseaudio-sr \
locale-pulseaudio-sr@latin \
locale-pulseaudio-sv \
locale-pulseaudio-ta \
locale-pulseaudio-te \
locale-pulseaudio-tr \
locale-pulseaudio-uk \
locale-pulseaudio-zh-CN \
locale-pulseaudio-zh-TW \
pulseaudio-lang \
pulseaudio-lang-all"

RDEPENDS:${PN} += "pulseaudio"

inherit rpm
