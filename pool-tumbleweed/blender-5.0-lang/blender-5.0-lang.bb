SUMMARY = "Translations for package blender-5.0"
DESCRIPTION = "Provides translations for the 'blender-5.0' package."
LICENSE = "GPL-2.0-or-later & CC-BY-4.0 & Apache-2.0-with-Trademark-Clause & Apache-2.0"

PV = "5.0.1"

RPM_NAME = "blender-5.0-lang-5.0.1-6.2.noarch.rpm"
RPM_HASH = "5a5057ca9a770bf9439f0d66865cc82791cbce33847f5087bf525e95e8a3741bd110921cc65ddf35f18097a1236034f0211c4826867fd66112b9384917802b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-5.0-lang \
blender-5.0-lang-all \
locale-blender-5.0-ab \
locale-blender-5.0-ar \
locale-blender-5.0-be \
locale-blender-5.0-bg \
locale-blender-5.0-ca \
locale-blender-5.0-cs \
locale-blender-5.0-da \
locale-blender-5.0-de \
locale-blender-5.0-el \
locale-blender-5.0-en-GB \
locale-blender-5.0-eo \
locale-blender-5.0-es \
locale-blender-5.0-eu \
locale-blender-5.0-fa \
locale-blender-5.0-fi \
locale-blender-5.0-fr \
locale-blender-5.0-ha \
locale-blender-5.0-he \
locale-blender-5.0-hi \
locale-blender-5.0-hr \
locale-blender-5.0-hu \
locale-blender-5.0-id \
locale-blender-5.0-it \
locale-blender-5.0-ja \
locale-blender-5.0-ka \
locale-blender-5.0-km \
locale-blender-5.0-ko \
locale-blender-5.0-ky \
locale-blender-5.0-lt \
locale-blender-5.0-ml \
locale-blender-5.0-ne \
locale-blender-5.0-nl \
locale-blender-5.0-pl \
locale-blender-5.0-pt \
locale-blender-5.0-pt-BR \
locale-blender-5.0-ro \
locale-blender-5.0-ru \
locale-blender-5.0-sk \
locale-blender-5.0-sl \
locale-blender-5.0-sr \
locale-blender-5.0-sr@latin \
locale-blender-5.0-sv \
locale-blender-5.0-sw \
locale-blender-5.0-ta \
locale-blender-5.0-th \
locale-blender-5.0-tr \
locale-blender-5.0-uk \
locale-blender-5.0-ur \
locale-blender-5.0-vi \
locale-blender-5.0-zh-HANS \
locale-blender-5.0-zh-HANT"

RDEPENDS:${PN} += "blender-5.0"

inherit rpm
