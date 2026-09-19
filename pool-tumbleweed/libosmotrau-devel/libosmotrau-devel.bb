SUMMARY = "Development files for the Osmocom TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit \
(TRAU) for GSM systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmotrau."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libosmotrau-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "b561fa08ea5c5bb6967a4feba7a719c19bb9246124dabbf7a873132b9e332369360e8b25a640bdf18528ceaeced751e38664c4df155c38fbe5bdd896a29cb0b3"

RPROVIDES:${PN} += "libosmotrau-devel \
pkgconfig-libosmotrau"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmotrau11 \
pkgconfig-libosmocore"

inherit rpm
