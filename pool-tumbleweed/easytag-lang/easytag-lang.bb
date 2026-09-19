SUMMARY = "Translations for package easytag"
DESCRIPTION = "Provides translations for the 'easytag' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3+173"

RPM_NAME = "easytag-lang-2.4.3+173-1.3.noarch.rpm"
RPM_HASH = "bda086dbbaa0f6272342b2f994a5de3ab5bd06c2299189f275aa809f2c10007ec9607fbea00b0ba9ec3cf5e332713c6f17febcda2ac595cd4370420a25dd3b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easytag-lang \
easytag-lang-all \
locale-easytag-bg \
locale-easytag-bs \
locale-easytag-ca \
locale-easytag-cs \
locale-easytag-da \
locale-easytag-de \
locale-easytag-el \
locale-easytag-en-GB \
locale-easytag-es \
locale-easytag-eu \
locale-easytag-fr \
locale-easytag-he \
locale-easytag-hi \
locale-easytag-hr \
locale-easytag-hu \
locale-easytag-id \
locale-easytag-it \
locale-easytag-ja \
locale-easytag-ka \
locale-easytag-kk \
locale-easytag-ko \
locale-easytag-lt \
locale-easytag-nb \
locale-easytag-nl \
locale-easytag-oc \
locale-easytag-pl \
locale-easytag-pt \
locale-easytag-pt-BR \
locale-easytag-ro \
locale-easytag-ru \
locale-easytag-sl \
locale-easytag-sr \
locale-easytag-sr@latin \
locale-easytag-sv \
locale-easytag-te \
locale-easytag-tr \
locale-easytag-uk \
locale-easytag-zh-CN \
locale-easytag-zh-TW"

RDEPENDS:${PN} += "easytag"

inherit rpm
