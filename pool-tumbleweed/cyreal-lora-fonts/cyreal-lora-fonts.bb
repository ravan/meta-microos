SUMMARY = "Serif family for text"
DESCRIPTION = "Lora is a well-balanced contemporary serif with roots in calligraphy. It is \
a text typeface with moderate contrast well suited for body text. A paragraph \
set in Lora will make a memorable appearance because of its brushed curves \
in contrast with driving serifs. The overall typographic voice of Lora perfectly \
conveys the mood of a modern-day story, or an art essay. \
 \
Technically Lora is optimised for screen appearance, and works equally well in \
print. \
 \
Designed by Olga Karpushina, and Alexei Vanyashin for Cyreal."
LICENSE = "OFL-1.1"

PV = "3.021"

RPM_NAME = "cyreal-lora-fonts-3.021-1.2.noarch.rpm"
RPM_HASH = "eb47bd11ae674452d8e81ce57a1542ddbd0b0622c9b344833f269135c7d9d4814acf8c9568e37fb6b4f68bb5019d4e1364ef009a88e23e96f29014764f72b453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-lora-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
