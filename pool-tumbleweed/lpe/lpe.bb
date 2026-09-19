SUMMARY = "Programming text editor"
DESCRIPTION = "LPE is meant as an acronym for 'lightweight programmer's editor'. \
It recognizes a few programming languages for syntax highlighting. \
The function keys are reminiscient of pico's choices."
LICENSE = "GPL-2.0-only"

PV = "1.2.8"

RPM_NAME = "lpe-1.2.8-7.9.aarch64.rpm"
RPM_HASH = "7dc767cb99c4e6c76a1e61d8498abbc03c24cbb406811ac1850a9a14789bea898ba5cafb1f7b2f1d31d6e967a5e60a410b7331d681daeb1db256b2c06a3613c9"

RPROVIDES:${PN} += "lpe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2 \
libtinfo.so.6"

inherit rpm
