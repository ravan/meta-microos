SUMMARY = "Development files for the Thai language support library"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support. \
 \
This package contains headers and libraries required for developing \
software using libthai."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.30"

RPM_NAME = "libthai-devel-0.1.30-1.4.aarch64.rpm"
RPM_HASH = "429cdbdf69f15d8d27e26f6321a886b2ae7ed39ecb0276bcbbce71f27fa5ba957c2d3431a90ed9b9394d994295971323f38c75ebfa5c79aa27bf9066a3028769"

RPROVIDES:${PN} += "libthai-devel \
pkgconfig-libthai"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthai0 \
pkgconfig-datrie-0.2"

inherit rpm
