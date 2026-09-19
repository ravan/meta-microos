SUMMARY = "Library for handling xkb descriptions"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbregistry0-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "0e02d86917115e7e4715127d704519ecb490ac5636a87056305ab17ebe1de423ba6cad82986bf991550e056f8483fb1a078baf73b45300466f133c35b223c4fa"

RPROVIDES:${PN} += "libxkbregistry.so.0 \
libxkbregistry0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16"

inherit rpm
