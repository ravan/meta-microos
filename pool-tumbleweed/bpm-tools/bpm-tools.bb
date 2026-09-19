SUMMARY = "Automatic calculating and tagging the tempo of music files"
DESCRIPTION = "Automatic calculating and tagging the tempo (in beats-per-minute) of music files."
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "bpm-tools-0.3-2.5.aarch64.rpm"
RPM_HASH = "be3c7c8a44d78fd34a23f1a1096072af33810993065f2c551366397a933096c45afceb015650fe051a69ed707b4c4aebafbdaa85ac5f5b8899faaefa845e777d"

RPROVIDES:${PN} += "bpm-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6 \
sox"

inherit rpm
