SUMMARY = "A library for building efficient parsers"
DESCRIPTION = "LibParserUtils is a library for building efficient parsers, written in \
C. It was developed as part of the NetSurf project."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "libparserutils0-0.2.4-3.9.aarch64.rpm"
RPM_HASH = "abe1ab2b1c849e90f68b843e0c939ce7d8485c8c6051e7b4ffb9546158c7b6c407dc16c331bff26f9edee0ce6b97b73dcdc45066d649868e47ca328b86d215b3"

RPROVIDES:${PN} += "libparserutils.so.0 \
libparserutils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
