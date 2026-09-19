SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libm2cor21-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "6626fe3c388a1f6798ef503e11f0cf57f3cd33bbed1864bbade04deeb3d68aa0b3a86ff27c398e9ba3d2111aaa168aad4e17cb6829b9a9ffb18c4456b8ccda15"

RPROVIDES:${PN} += "libm2cor.so.21 \
libm2cor21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
