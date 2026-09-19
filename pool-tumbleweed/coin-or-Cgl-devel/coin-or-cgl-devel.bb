SUMMARY = "Development headers for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators. \
 \
This package contains the development headers for coin-or-Cgl."
LICENSE = "EPL-2.0"

PV = "0.60.9"

RPM_NAME = "coin-or-Cgl-devel-0.60.9-1.7.aarch64.rpm"
RPM_HASH = "f9915ab445f69d75c307cbecd27132069c97598fc4d172d858041f358373955f38066a6d38803f45594778fdb5901a258c6482e429a04871d577c330826df9a7"

RPROVIDES:${PN} += "coin-or-Cgl-devel \
pkgconfig-cgl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCgl1 \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi \
pkgconfig-osi-clp"

inherit rpm
