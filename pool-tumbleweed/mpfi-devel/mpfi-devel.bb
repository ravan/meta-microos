SUMMARY = "Development files for the MPFI interval arithmetic computation library"
DESCRIPTION = "MPFI is a C library for arbitrary precision interval arithmetic with \
intervals represented using MPFR reliable floating-point numbers. \
 \
This subpackage provides the development headers and libraries for it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "mpfi-devel-1.5.4-2.9.aarch64.rpm"
RPM_HASH = "feaa03233c92501de5542acadbe385c0d1a5cef50e0bc4f24e98a16d095993ec5db67e0d172cd0ad1717bb0a52256770195f23855c0c927ee9f1bd4957629e0f"

RPROVIDES:${PN} += "mpfi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libmpfi0"

inherit rpm
