SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.6.0.20260123"

RPM_NAME = "cross-pru-newlib-devel-4.6.0.20260123-1.4.aarch64.rpm"
RPM_HASH = "44b9c9f366257574e5653fe22c2a4ce85c17dcf8f30326a05f18743855482353df994743cf42c75ea37f5b9e3b08a5966b0c25e3e9bead86ddc51ad291c0f544"

RPROVIDES:${PN} += "cross-pru-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm
