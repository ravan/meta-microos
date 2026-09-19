SUMMARY = "The lightweight Tox client"
DESCRIPTION = "Lightweight Tox client."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "utox-0.18.1-2.7.aarch64.rpm"
RPM_HASH = "6c47da32c71b916af4fbdf4c031b48b6ef4814d20c637d6e01a5d19ef5b9819e4fe842f5fe184d80b20e3430ba842ef7b740d6f9c54ec932bae1abe8c1f62243"

RPROVIDES:${PN} += "utox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfilteraudio.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libopenal.so.1 \
libtoxcore.so.2 \
libv4lconvert.so.0 \
libvpx.so.12"

inherit rpm
