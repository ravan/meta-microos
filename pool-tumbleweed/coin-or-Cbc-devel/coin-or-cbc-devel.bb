SUMMARY = "Development headers for coin-or-Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. \
 \
This package contains the development headers for coin-or-Cbc."
LICENSE = "EPL-2.0"

PV = "2.10.13"

RPM_NAME = "coin-or-Cbc-devel-2.10.13-1.2.aarch64.rpm"
RPM_HASH = "422bacc561e9ae578b41ca43a5f18c6d98193f6af871608186cc5c9c78aa64faa7128ab2b539e2562b6ad8ec102e373b7df13d964e624cf47e5aa6d61ac951e6"

RPROVIDES:${PN} += "coin-or-Cbc-devel \
pkgconfig-cbc \
pkgconfig-osi-cbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCbc3 \
libOsiCbc3 \
pkgconfig-cbc \
pkgconfig-cgl \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi \
pkgconfig-osi-clp"

inherit rpm
