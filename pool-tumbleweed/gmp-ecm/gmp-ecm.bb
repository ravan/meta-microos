SUMMARY = "Elliptic Curve Method for Integer Factorization"
DESCRIPTION = "GMP-ECM reads the numbers to be factored from stdin (one number on each \
line) and requires a numerical parameter, the stage 1 bound B1. A reasonable \
stage 2 bound B2 for the given B1 is chosen by default, but can be overridden \
by a second numerical parameter. By default, GMP-ECM uses the ECM factoring \
algorithm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-7.0.5-1.14.aarch64.rpm"
RPM_HASH = "9477b226b9a39f0667191c1362411710e8d6dc9263c5167340ba3aa51c044306c87f886ac439de132d870509af0464cac4135d6f8a1b58c1534ef8f05afabbe8"

RPROVIDES:${PN} += "gmp-ecm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libecm.so.1 \
libgmp.so.10 \
libm.so.6"

inherit rpm
