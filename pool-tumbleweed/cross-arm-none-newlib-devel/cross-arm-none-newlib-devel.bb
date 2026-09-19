SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.6.0.20260123"

RPM_NAME = "cross-arm-none-newlib-devel-4.6.0.20260123-1.4.aarch64.rpm"
RPM_HASH = "9d903d8ae480d3a1d3463e399d08f35833a08cb4652ae928c60f15dbb030eb852804dcbf9841528d6f06aa051d7d83aa25f6b27581981e71284218cbcb4e48ce"

RPROVIDES:${PN} += "cross-arm-none-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm
