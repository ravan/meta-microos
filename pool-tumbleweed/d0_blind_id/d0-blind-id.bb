SUMMARY = "Blind-ID library"
DESCRIPTION = "Blind-ID library for user identification using RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "d0_blind_id-0.8.6-1.11.aarch64.rpm"
RPM_HASH = "67242de683748cb58928522e1b4019d922c42faca09e892e5e5b5450f5fcae855c6d7e92e2c4b49ed1a309f428c2279afff3d974cccffc84f24a83dc60724cd8"

RPROVIDES:${PN} += "d0-blind-id"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libd0-blind-id.so.0"

inherit rpm
