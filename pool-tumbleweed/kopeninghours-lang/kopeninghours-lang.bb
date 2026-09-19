SUMMARY = "Translations for package kopeninghours"
DESCRIPTION = "Provides translations for the 'kopeninghours' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kopeninghours-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "188efc0547dc006c5c7d4874e44d977d19dcde5cc16dba6cf2691a25452adab7881117de86ea35050391ad98473bc9eab4f494408ef1e9a1d253cd65ae02873a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopeninghours-lang \
kopeninghours-lang-all \
locale-kopeninghours-ar \
locale-kopeninghours-ast \
locale-kopeninghours-ca \
locale-kopeninghours-ca@valencia \
locale-kopeninghours-cs \
locale-kopeninghours-de \
locale-kopeninghours-en-GB \
locale-kopeninghours-eo \
locale-kopeninghours-es \
locale-kopeninghours-eu \
locale-kopeninghours-fi \
locale-kopeninghours-fr \
locale-kopeninghours-ga \
locale-kopeninghours-gl \
locale-kopeninghours-he \
locale-kopeninghours-hi \
locale-kopeninghours-hu \
locale-kopeninghours-ia \
locale-kopeninghours-is \
locale-kopeninghours-it \
locale-kopeninghours-ja \
locale-kopeninghours-ka \
locale-kopeninghours-ko \
locale-kopeninghours-lt \
locale-kopeninghours-lv \
locale-kopeninghours-nl \
locale-kopeninghours-nn \
locale-kopeninghours-pl \
locale-kopeninghours-pt \
locale-kopeninghours-pt-BR \
locale-kopeninghours-ro \
locale-kopeninghours-ru \
locale-kopeninghours-sk \
locale-kopeninghours-sl \
locale-kopeninghours-sv \
locale-kopeninghours-tr \
locale-kopeninghours-ug \
locale-kopeninghours-uk \
locale-kopeninghours-zh-CN \
locale-kopeninghours-zh-TW"

RDEPENDS:${PN} += "kopeninghours"

inherit rpm
