SUMMARY = "Translations for package kjournald"
DESCRIPTION = "Provides translations for the 'kjournald' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kjournald-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "26b8c23afe49457db5718400ae698293b02a2a485dfeedc48cbb7c2011a28aa931d3184008367a1d7cd3586a4bedb3be5af24470878c1c9120ad459e68fd8ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjournald-lang \
kjournald-lang-all \
locale-kjournald-ar \
locale-kjournald-ast \
locale-kjournald-ca \
locale-kjournald-ca@valencia \
locale-kjournald-cs \
locale-kjournald-de \
locale-kjournald-en-GB \
locale-kjournald-eo \
locale-kjournald-es \
locale-kjournald-eu \
locale-kjournald-fi \
locale-kjournald-fr \
locale-kjournald-ga \
locale-kjournald-gl \
locale-kjournald-he \
locale-kjournald-hi \
locale-kjournald-ia \
locale-kjournald-is \
locale-kjournald-it \
locale-kjournald-ja \
locale-kjournald-ka \
locale-kjournald-ko \
locale-kjournald-lt \
locale-kjournald-lv \
locale-kjournald-nl \
locale-kjournald-pl \
locale-kjournald-pt \
locale-kjournald-pt-BR \
locale-kjournald-ru \
locale-kjournald-sk \
locale-kjournald-sl \
locale-kjournald-sv \
locale-kjournald-tr \
locale-kjournald-ug \
locale-kjournald-uk \
locale-kjournald-zh-CN \
locale-kjournald-zh-TW"

RDEPENDS:${PN} += "kjournald"

inherit rpm
