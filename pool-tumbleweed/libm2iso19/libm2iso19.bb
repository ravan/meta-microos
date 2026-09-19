SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libm2iso19-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "ddd241f6366c1440539c02a2e6f680dab140b66d498beb0cee32a4668e293a9b29b035d58f6b87fc22a7b1119b84b4abe0b97a1d4e8e09bb28a69731cec2c598"

RPROVIDES:${PN} += "libm2iso.so.19 \
libm2iso19"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
