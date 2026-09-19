SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libm2cor18-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "c82edabc296588c813ae6dc709bc10432d9e77eb34dcc6e038d47db4382a98dca9438b4562ea1b7833f3112cb7d9e40a09e823d71e9ec0a0028fdbd79ac0e71f"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
