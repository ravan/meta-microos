SUMMARY = "Generate informative listings from JPEG files and check them for errors"
DESCRIPTION = "Utility to generate informative listings from JPEG files and to check them for errors. \
Also supports automatic deletion of broken JPEGs."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "jpeginfo-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "054869529459acd49a30cd4c4a830aa2c87e98fe6e81cb69a5e45ab08c22122cf2e78d2d49be7a95358b56234c300cc666b35cf839450b29045c1f70535cf1ab"

RPROVIDES:${PN} += "jpeginfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8"

inherit rpm
