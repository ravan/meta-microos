SUMMARY = "Query configuration information of DRI drivers"
DESCRIPTION = "Driinfo can be used to query configuration information of direct rendering \
drivers (DRI)."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xdriinfo-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "06035816992b9fe12973060bc2e20461c0b5cd70fcc3d4d73aec7760340f392f966080f99f9e357a3ba4549f2d1ae16b833ead704f49ff602cb248348b12648f"

RPROVIDES:${PN} += "xdriinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
