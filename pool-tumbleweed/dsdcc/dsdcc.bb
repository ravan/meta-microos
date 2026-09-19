SUMMARY = "Digital Speech Decoder (DSD) rewritten as a C++ library"
DESCRIPTION = "DSDcc is a complete rewrite of the original DSD (Digital Speech Decoder) \
project. It decodes the DMR, dPMR, D-Star and Yaesu System Fusion (YSF) \
standards. \
 \
This package contains the dsdccx command line decoder."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.6"

RPM_NAME = "dsdcc-1.9.6-1.1.aarch64.rpm"
RPM_HASH = "a47e68de8af60c8e1607597c0a10015405c341ae919a10c083588d100f44addae2ec4494de8d0c6d37aa2f95e090c04eb842a3168c4389907b113a208b6d0d90"

RPROVIDES:${PN} += "dsdcc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdsdcc.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
