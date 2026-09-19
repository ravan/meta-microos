SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libm2cor19-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "59efcdcd80e51a8820555b3128803cb029954db8b5ed4cef55d670f70a7b6b12fd56fdf52abaadccce63b42406686c73e51976ec5e7723df139453a08f565196"

RPROVIDES:${PN} += "libm2cor.so.19 \
libm2cor19"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
