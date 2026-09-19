SUMMARY = "Touch with mkdir tool"
DESCRIPTION = "Bonk is a touch alternative with an added feature to \
create directories."
LICENSE = "MIT"

PV = "0.4.0+g0"

RPM_NAME = "bonk-0.4.0+g0-2.8.aarch64.rpm"
RPM_HASH = "f36cc3411a3ff5e99e787a53649e994beb1685642d149fead5b7253330acdbccfa94e7a989095d0e1cf8f8fa8fbf75bf5fdd9b425f9218f570dd71c871202f35"

RPROVIDES:${PN} += "bonk \
bundled-rust-crate-bonky"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
