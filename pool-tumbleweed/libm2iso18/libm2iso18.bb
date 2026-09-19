SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.5.0+git10516"

RPM_NAME = "libm2iso18-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "7fddfb0c2c1a4f8b262f7a582e0a24223e55cc5badc0873437dcf30246e6b805ffd664e3be66bf6aa104b8ba828aeac143317e35811eac156063a108be6a5a51"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
