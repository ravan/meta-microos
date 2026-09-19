SUMMARY = "A complete rewrite of the NASM assembler"
DESCRIPTION = "YASM is a complete rewrite of the NASM assembler. It is designed from \
the ground up to allow for multiple syntaxes to be supported (e.g., \
NASM, TASM, GAS, etc.) in addition to multiple output object formats. \
Another primary module of the overall design is an optimizer module. \
Actually it supports ix86 and AMD64, next will be PowerPC"
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-1.3.0-9.8.aarch64.rpm"
RPM_HASH = "58e41541d5485204b8d1f6f0a4a0439cb80700dd6cdb2cae15073ec2f86eb75ae2c5aaf7564cad42292aad1e632ba5fe921c2383f53021d5ea2522e2527b6467"

RPROVIDES:${PN} += "yasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
