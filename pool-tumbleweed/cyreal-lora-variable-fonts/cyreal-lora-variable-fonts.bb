SUMMARY = "Serif family for text (variable version)"
DESCRIPTION = "Lora is a well-balanced contemporary serif with roots in calligraphy. It is \
a text typeface with moderate contrast well suited for body text. A paragraph \
set in Lora will make a memorable appearance because of its brushed curves \
in contrast with driving serifs. The overall typographic voice of Lora perfectly \
conveys the mood of a modern-day story, or an art essay. \
 \
Technically Lora is optimised for screen appearance, and works equally well in \
print. \
 \
Designed by Olga Karpushina, and Alexei Vanyashin for Cyreal. \
 \
This package contains the variable version of fonts."
LICENSE = "OFL-1.1"

PV = "3.021"

RPM_NAME = "cyreal-lora-variable-fonts-3.021-1.2.noarch.rpm"
RPM_HASH = "94715879528802688a0834445dca67cd6faf6468e9c8ff4736c3d7e44fedf926412c53ab1fbdcc7b6e44e66afcfc97784f374a91c7513f1973bb785a4c7d5c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-lora-variable-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
