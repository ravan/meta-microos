SUMMARY = "Languages for libgviewv4l2core"
DESCRIPTION = "Provides translations to libgviewv4l2core."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libgviewv4l2core-lang-2.2.2-1.7.noarch.rpm"
RPM_HASH = "2850ef3149d268c08f0d6555d101bf12fce3808f8c3ac4c7dca1261e349d65690141eb01bdac60ffeeaee9a4ff1dcca91473ebe7dee94fdcbf9bce91287b08b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgviewv4l2core-lang \
libgviewv4l2core-lang-all \
locale-libgviewv4l2core-bg \
locale-libgviewv4l2core-bs \
locale-libgviewv4l2core-cs \
locale-libgviewv4l2core-da \
locale-libgviewv4l2core-de \
locale-libgviewv4l2core-en-AU \
locale-libgviewv4l2core-es \
locale-libgviewv4l2core-eu \
locale-libgviewv4l2core-fr \
locale-libgviewv4l2core-gl \
locale-libgviewv4l2core-he \
locale-libgviewv4l2core-hr \
locale-libgviewv4l2core-it \
locale-libgviewv4l2core-ja \
locale-libgviewv4l2core-lv \
locale-libgviewv4l2core-nl \
locale-libgviewv4l2core-pl \
locale-libgviewv4l2core-pt \
locale-libgviewv4l2core-pt-BR \
locale-libgviewv4l2core-ru \
locale-libgviewv4l2core-si \
locale-libgviewv4l2core-sr \
locale-libgviewv4l2core-tr \
locale-libgviewv4l2core-uk \
locale-libgviewv4l2core-zh-TW"

RDEPENDS:${PN} += "libgviewv4l2core-2-2-2"

inherit rpm
