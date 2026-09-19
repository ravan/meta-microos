SUMMARY = "Development files for qbdiff"
DESCRIPTION = "Quick Binary Diff (qbdiff) is a tool for generating and applying binary \
patches. It builds on the general ideas of bsdiff. \
 \
It is designed to be faster than bsdiff by taking advantage of multiple CPU \
cores. It is also designed to produce generally smaller patch files, and \
supports only LZMA compression as it performs well on sparse binary data. \
Further it aims to be frugal on memory usage and provides integrity checking \
using BLAKE2B. \
 \
This package contains the files required for building using bsdiff."
LICENSE = "LGPL-3.0-or-later & Apache-2.0"

PV = "1.0.0"

RPM_NAME = "qbdiff-devel-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "a3d46c590a304b0d067cba513239d81fbae9b59b2a928bb86459eba47392795c5a022e52f2acc16c133e5f8829812f81934fe2776ba2380ff9a7b465ed9a28fa"

RPROVIDES:${PN} += "pkgconfig-qbdiff \
qbdiff-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqbdiff0"

inherit rpm
