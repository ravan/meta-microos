SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software dedicated to \
frame data manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.48.4"

RPM_NAME = "framel-8.48.4-2.7.aarch64.rpm"
RPM_HASH = "d44e6af22256e3baa27b67db75fa08ac15cadf178e8f66d418449f702fa7cb724a4be0c08b9859c50bc5fa675eea0406a5ed065e2253ac0b0bae8e3cc1ddfb0a"

RPROVIDES:${PN} += "framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libm.so.6"

inherit rpm
