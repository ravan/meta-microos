SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.6.0.20260123"

RPM_NAME = "cross-riscv64-newlib-devel-4.6.0.20260123-1.4.aarch64.rpm"
RPM_HASH = "890053b11946e0ab0f5304b0b54f69eb9b2bdac279d9a0ca09455f4cf28585c8f4fbe75a1ce3379229061e12e85efa5f21856d18532e41041536c25c6d2e3db0"

RPROVIDES:${PN} += "cross-riscv64-newlib-devel"

RDEPENDS:${PN} += ""

inherit rpm
