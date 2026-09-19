SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.6.0.20260123"

RPM_NAME = "cross-rx-newlib-devel-4.6.0.20260123-1.4.aarch64.rpm"
RPM_HASH = "26c2139335320c5d8ea13d0c8cc30d6b5ecdb830923b5ca0a8470c814933e10705d6a5bcf993edcd1d1f49d886216246e04bbd979de5c9dadbde8b863cd873df"

RPROVIDES:${PN} += "cross-rx-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm
