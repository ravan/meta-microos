SUMMARY = "Quick Binary Diff for generating and applying binary patches"
DESCRIPTION = "Quick Binary Diff (qbdiff) is a tool for generating and applying binary \
patches. It builds on the general ideas of bsdiff. \
 \
It is designed to be faster than bsdiff by taking advantage of multiple CPU \
cores. It is also designed to produce generally smaller patch files, and \
supports only LZMA compression as it performs well on sparse binary data. \
Further it aims to be frugal on memory usage and provides integrity checking \
using BLAKE2B."
LICENSE = "LGPL-3.0-or-later & Apache-2.0"

PV = "1.0.0"

RPM_NAME = "qbdiff-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "86aa29dcf33626f757b0c6dba0c1c763c90a13b5dece9b4dee451b34d899c383380dbeda571338829f9caf1c57040e0b9345d09a87f70fe771c2af4a4a61b92b"

RPROVIDES:${PN} += "qbdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqbdiff.so.0"

inherit rpm
