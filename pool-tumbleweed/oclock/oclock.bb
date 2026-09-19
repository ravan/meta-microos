SUMMARY = "Simple round analog clock"
DESCRIPTION = "oclock is a simple analog clock using the SHAPE extension to make \
a round (possibly transparent) window."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "oclock-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "e9623777a17f4544f839683bb190f82910a356003396fb61514a0d1b29b838cd24da3eca266ce0f9fd588bc4dc875774a2c19607ccda04b14537c8d3a0e8e3fa"

RPROVIDES:${PN} += "oclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
