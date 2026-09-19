SUMMARY = "Translations for package blender-4.5"
DESCRIPTION = "Provides translations for the 'blender-4.5' package."
LICENSE = "GPL-2.0-or-later & CC-BY-4.0 & Apache-2.0-with-Trademark-Clause & Apache-2.0"

PV = "4.5.13"

RPM_NAME = "blender-4.5-lang-4.5.13-1.2.noarch.rpm"
RPM_HASH = "7a6765faaad6789940ca282a10fd8072d52160a9473d969ba2c359c1e7972362617b1d4e74b2ba03fa97328d06be2ea165d70056fbb58928d75175567a5a728a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-4.5-lang \
blender-4.5-lang-all \
locale-blender-4.5-ab \
locale-blender-4.5-ar \
locale-blender-4.5-be \
locale-blender-4.5-bg \
locale-blender-4.5-ca \
locale-blender-4.5-cs \
locale-blender-4.5-da \
locale-blender-4.5-de \
locale-blender-4.5-el \
locale-blender-4.5-en-GB \
locale-blender-4.5-eo \
locale-blender-4.5-es \
locale-blender-4.5-eu \
locale-blender-4.5-fa \
locale-blender-4.5-fi \
locale-blender-4.5-fr \
locale-blender-4.5-ha \
locale-blender-4.5-he \
locale-blender-4.5-hi \
locale-blender-4.5-hr \
locale-blender-4.5-hu \
locale-blender-4.5-id \
locale-blender-4.5-it \
locale-blender-4.5-ja \
locale-blender-4.5-ka \
locale-blender-4.5-km \
locale-blender-4.5-ko \
locale-blender-4.5-ky \
locale-blender-4.5-lt \
locale-blender-4.5-ne \
locale-blender-4.5-nl \
locale-blender-4.5-pl \
locale-blender-4.5-pt \
locale-blender-4.5-pt-BR \
locale-blender-4.5-ro \
locale-blender-4.5-ru \
locale-blender-4.5-sk \
locale-blender-4.5-sl \
locale-blender-4.5-sr \
locale-blender-4.5-sr@latin \
locale-blender-4.5-sv \
locale-blender-4.5-sw \
locale-blender-4.5-ta \
locale-blender-4.5-th \
locale-blender-4.5-tr \
locale-blender-4.5-uk \
locale-blender-4.5-ur \
locale-blender-4.5-vi \
locale-blender-4.5-zh-HANS \
locale-blender-4.5-zh-HANT"

RDEPENDS:${PN} += "blender-4.5"

inherit rpm
