SUMMARY = "Simple SVG parse"
DESCRIPTION = "Shared library built from the code in the nanosvg.h header file \
 \
A simple SVG parser. The output of the parser is a list of cubic bezier shapes."
LICENSE = "Zlib"

PV = "2022.12.22"

RPM_NAME = "libnanosvg0-2022.12.22-1.12.aarch64.rpm"
RPM_HASH = "5d1fcf5aeea89c490b75c4e8fdb831a1450278e272a7e85da0cb3bd59d461155aaf75fd7bc2403f22b0acde701318f2aee78b39c387fb371696d15d7b0d35502"

RPROVIDES:${PN} += "libnanosvg.so.0 \
libnanosvg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
