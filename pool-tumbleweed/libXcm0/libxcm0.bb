SUMMARY = "X Color Management Library"
DESCRIPTION = "The libXcm library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
servers. A EDID parser and a color management event observer are included."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcm0-0.5.4-1.32.aarch64.rpm"
RPM_HASH = "9772b716a33dd40eac8e8bb1154092f7908b996604a3cce5ab4eb00427eaeedf1eab3fa67f924f485d39122edb2275f2c26fc2203f6b4376568524920a8d6e9e"

RPROVIDES:${PN} += "libXcm.so.0 \
libXcm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libXcmEDID.so.0 \
libm.so.6"

inherit rpm
